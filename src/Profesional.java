
public class Profesional extends Usuario {

	private String titulo;
	private String fechaIngreso;

	/**
	 * 
	 */
	public Profesional() {
		super();
	}

	
	/**
	 * @param rut
	 * @param nombre
	 * @param fechaNacimiento
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(String rut, String nombre, String fechaNacimiento, String titulo, String fechaIngreso) {
		super(rut, nombre, fechaNacimiento);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}



	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the fechaIngreso
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
