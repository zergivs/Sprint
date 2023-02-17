
public class Capacitacion {
	private String capacitacionId;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadAsistentes;

	/**
	 * 
	 */
	public Capacitacion() {
		super();
	}

	/**
	 * @param capacitacionId
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 * @param cantidadAsistentes
	 */
	public Capacitacion(String capacitacionId, String rutCliente, String dia, String hora, String lugar,
			String duracion, int cantidadAsistentes) {
		super();
		this.capacitacionId = capacitacionId;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	@Override
	public String toString() {
		return "Capacitacion [capacitacionId=" + capacitacionId + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}

	/**
	 * @return the capacitacionId
	 */
	public String getCapacitacionId() {
		return capacitacionId;
	}

	/**
	 * @param capacitacionId the capacitacionId to set
	 */
	public void setCapacitacionId(String capacitacionId) {
		this.capacitacionId = capacitacionId;
	}

	/**
	 * @return the rutCliente
	 */
	public String getRutCliente() {
		return rutCliente;
	}

	/**
	 * @param rutCliente the rutCliente to set
	 */
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	/**
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}

	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the cantidadAsistentes
	 */
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	/**
	 * @param cantidadAsistentes the cantidadAsistentes to set
	 */
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public void mostrarDetalle() {
		System.out.println("La capacitacion sera en " + lugar + "a las " + hora + ", el dia " + dia
				+ "y su duracion es de " + duracion + "minutos.");

	}
}
