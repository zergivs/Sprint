import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Usuario {
	private String nombre;
	private String fechaNacimiento;
	private int rut;

	/**
	 * 
	 */
	public Usuario() {
		super();
	}

	public Usuario(String nombre, String fechaNacimiento, int rut) {
		setNombre(nombre);
		this.fechaNacimiento = fechaNacimiento;
		setRut(rut);
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", rut=" + rut + "]";
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
		if (nombre.length() < 10 || nombre.length() > 50) {
			throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres");
		}
		this.nombre = nombre;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the rut
	 */
	public int getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(int rut) {
		if (rut >= 99999999) {
			throw new IllegalArgumentException("El rut debe ser menor a 99999999");
		}
		this.rut = rut;
	}

	public String analizarUsuario() {
		return "Nombre: " + nombre + " Rut: " + rut;
	}

	public void mostrarEdad() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);
		LocalDate currentDate = LocalDate.now();
		int age = Period.between(fechaNac, currentDate).getYears();
		System.out.println("Edad: " + age);
	}
}
