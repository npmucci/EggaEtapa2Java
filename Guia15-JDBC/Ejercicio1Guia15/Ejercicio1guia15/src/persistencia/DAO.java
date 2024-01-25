package persistencia;

import java.sql.*;

public abstract class DAO {

    protected Connection conn = null;
    protected Statement stmt = null;
    protected ResultSet rs = null;

    private final String URL = "jdbc:mysql://localhost:3306/tienda?zeroDateTimeBehavior=convertToNull";
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarBase() throws SQLException, ClassNotFoundException {
        try {
            
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBase();
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception ex) {
            throw ex;
        } finally {
            desconectarBase(); // Asegurarse de que la conexión se cierre en caso de error
        }
    }

    protected ResultSet select(String sql) throws Exception {
        try {
            conectarBase();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception ex) {
            throw ex;
        }
    }
}
