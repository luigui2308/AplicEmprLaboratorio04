package util;

public class ProfesorDTO {
  private int id;
  private String cedula;
  private String nombre;
  private String titulo;
  private String area;
  private String telefono;

  public int getId() {return id;}
  public String getCedula() {return cedula;}
  public String getNombre() {return nombre;}
  public String getTitulo() {return titulo;}
  public String getArea() {return area;}
  public String getTelefono() {return telefono;}
  public void setId(int id) {this.id=id;}
  public void setCedula(String ced) {cedula=ced;}
  public void setNombre(String nom) {nombre=nom;}
  public void setTitulo(String tit) {titulo=tit;}
  public void setArea(String are) {area=are;}
  public void setTelefono(String tel) {telefono=tel;}
}