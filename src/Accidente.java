
public class Accidente {

	private String accidenteId;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencia;

	/**
	 * 
	 */
	public Accidente() {
		super();
	}

	/**
	 * @param accidenteId
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param origen
	 * @param consecuencia
	 */
	public Accidente(String accidenteId, String rutCliente, String dia, String hora, String lugar, String origen,
			String consecuencia) {
		super();
		this.accidenteId = accidenteId;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencia = consecuencia;
	}

	@Override
	public String toString() {
		return "Accidente [accidenteId=" + accidenteId + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencia=" + consecuencia + "]";
	}

	/**
	 * @return the accidenteId
	 */
	public String getAccidenteId() {
		return accidenteId;
	}

	/**
	 * @param accidenteId the accidenteId to set
	 */
	public void setAccidenteId(String accidenteId) {
		this.accidenteId = accidenteId;
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
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the consecuencia
	 */
	public String getConsecuencia() {
		return consecuencia;
	}

	/**
	 * @param consecuencia the consecuencia to set
	 */
	public void setConsecuencia(String consecuencia) {
		this.consecuencia = consecuencia;
	}

}
