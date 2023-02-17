
public class Cliente extends Usuario {

	private String rut;
	private String nombre;
	private String apellido;
	private String telefono;
	private String afp;
	private String sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;

	/**
	 * 
	 */
	public Cliente() {
		super();
	}

	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 * @param afp
	 * @param sistemaSalud
	 * @param direccion
	 * @param comuna
	 * @param edad
	 */
	public Cliente(String rut, String nombre, String apellido, String telefono, String afp, String sistemaSalud,
			String direccion, String comuna, int edad) {
		super();
		if (rut.matches("[0-9]{6,8}")) {
			this.rut = rut;
		}
		if (sistemaSalud == "1") {
			this.sistemaSalud = "Fonasa";
		}
		if (sistemaSalud == "2") {
			this.sistemaSalud = "Isapre";
		}
		if (nombre.matches("[5-30]")) {
			this.nombre = nombre;
		}
		if (apellido.matches("[5-30]")) {
			this.nombre = apellido;
		}
		if (afp.matches("[4-30]")) {
			this.nombre = afp;
		}
		if (comuna.matches("[5-50]")) {
			this.nombre = comuna;
		}
		if (edad >= 0 && edad <= 150) {
			this.edad = edad;
		} else {
			throw new IllegalArgumentException("Error: La edad debe ser entre 0 y 150");
		}
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", Apellido=" + apellido + ", telefono=" + telefono
				+ ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", edad=" + edad + "]";
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the afp
	 */
	public String getAfp() {
		return afp;
	}

	/**
	 * @param afp the afp to set
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}

	/**
	 * @return the sistemaSalud
	 */
	public String getSistemaSalud() {
		return sistemaSalud;
	}

	/**
	 * @param sistemaSalud the sistemaSalud to set
	 */
	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}

	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String obtenerNombre() {
		return nombre + apellido;

	}

	public String obtenerSistemaSalud() {
		return sistemaSalud;
	}

	public String analizarUsuario() {
		return nombre + apellido + rut + direccion + comuna;
	}

}
