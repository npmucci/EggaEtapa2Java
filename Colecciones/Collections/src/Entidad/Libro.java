package Entidad;


public class Libro {
  private String libro;

  public Libro() {
  }

  public Libro(String libro) {
    this.libro = libro;
  }

  public String getLibro() {
    return libro;
  }

  public void setLibro(String libro) {
    this.libro = libro;
  }

  @Override
  public String toString() {
    return "Libro{" + "libro=" + libro + '}';
  }
  
  
}
