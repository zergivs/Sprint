
public class Revision {

	private int idRevision, idVisita;
	private String nombre, detalle, estado;

	/**
	 * 
	 */
	public Revision() {
		super();
	}

	/**
	 * @param idRevision
	 * @param idVisita
	 * @param nombre
	 * @param detalle
	 * @param estado
	 */
	public Revision(int idRevision, int idVisita, String nombre, String detalle, String estado) {
		super();
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.nombre = nombre;
		this.detalle = detalle;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombre=" + nombre + ", detalle="
				+ detalle + ", estado=" + estado + "]";
	}

	/**
	 * @return the idRevision
	 */
	public int getIdRevision() {
		return idRevision;
	}

	/**
	 * @param idRevision the idRevision to set
	 */
	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}

	/**
	 * @return the idVisita
	 */
	public int getIdVisita() {
		return idVisita;
	}

	/**
	 * @param idVisita the idVisita to set
	 */
	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the detalle
	 */
	public String getDetalle() {
		return detalle;
	}

	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
