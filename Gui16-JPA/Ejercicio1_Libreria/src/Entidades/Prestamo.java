
package Entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE) // Para mapear solo la fecha sin hora
    private Date fechaPrestamo;
    @Temporal(TemporalType.DATE) // Para mapear solo la fecha sin hora
    private Date fechaDevolución;
    @ManyToOne
    private Libro libro;
    @ManyToOne
    private Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(Long id, Date fechaPréstamo, Date fechaDevolución, Libro libro, Cliente cliente) {
        this.id = id;
        this.fechaPrestamo = fechaPréstamo;
        this.fechaDevolución = fechaDevolución;
        this.libro = libro;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolución() {
        return fechaDevolución;
    }

    public void setFechaDevolución(Date fechaDevolución) {
        this.fechaDevolución = fechaDevolución;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", fechaPr\u00e9stamo=" + fechaPrestamo + ", fechaDevoluci\u00f3n=" + fechaDevolución + ", libro=" + libro + ", cliente=" + cliente + '}';
    }
    
    
    
}
