package domain;

public class Profesor {
  private int id;
  private String cedula;
  private String nombre;
  private String titulo;
  private String area;
  private String telefono;

  public Profesor () {};
  public void setId(int id) {this.id=id;}
  public void setCedula(String cedula) {this.cedula=cedula;}
  public void setNombre(String nombre) {this.nombre=nombre;}
  public void setTitulo(String titulo) throws Exception {
    if (titulo.toLowerCase().equals("bachiller") ||
        titulo.toLowerCase().equals("licenciado") ||
        titulo.toLowerCase().equals("master") ||
        titulo.toLowerCase().equals("doctor"))
      this.titulo=titulo;
    else
      throw new Exception("Error en título de profesor");
  }
  public void setArea(String area) {this.area=area;}
  public void setTelefono(String telefono) {this.telefono=telefono;}
  public int getId() {return id;}
  public String getCedula() {return cedula;}
  public String getNombre() {return nombre;}
  public String getTitulo() {return titulo;}
  public String getArea() {return area;}
  public String getTelefono() {return telefono;}
}