
public class Administrativo extends Usuario {

	private String Area;
	private String experienciaPrevia;

	/**
	 * 
	 */
	public Administrativo() {
		super();
	}

	

	/**
	 * @param rut
	 * @param nombre
	 * @param fechaNacimiento
	 * @param area
	 * @param experienciaPrevia
	 */
	public Administrativo(String rut, String nombre, String fechaNacimiento, String area, String experienciaPrevia) {
		super(rut, nombre, fechaNacimiento);
		this.Area = area;
		this.experienciaPrevia = experienciaPrevia;
	}



	@Override
	public String toString() {
		return "Administrativo [Area=" + Area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return Area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		Area = area;
	}

	/**
	 * @return the experienciaPrevia
	 */
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	/**
	 * @param experienciaPrevia the experienciaPrevia to set
	 */
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

}
