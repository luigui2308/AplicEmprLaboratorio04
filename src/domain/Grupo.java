package domain;

public class Grupo {
  private int id;
	private int numero;
	private String sigla;
	private String nombre;
	private String horario;
	private String aula;
	private int id_profesor;
	
	public int getId() { return id;}
	public void setId(int x) { this.id=x;}
	public int getNumero() { return numero;}
	public void setNumero(int x) { this.numero=x;}
	public String getSigla() { return sigla; }
	public void setSigla(String x) { this.sigla=x;}
	public String getNombre() { return nombre; }
	public void setNombre(String x) { this.nombre=x;}
	public String getHorario() { return horario; }
	public void setHorario(String x) { this.horario=x;}
	public String getAula() { return aula; }
	public void setAula(String x) { this.aula=x;}
	public int getIdProfesor() { return id_profesor;}
	public void setIdProfesor(int x) { this.id_profesor=x;}
  
  public Grupo () {};
}