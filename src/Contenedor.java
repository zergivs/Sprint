import java.util.ArrayList;

public class Contenedor implements Asesoria {

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub

	}
	ArrayList<Usuario> users = new ArrayList<Usuario>();
	ArrayList<Capacitacion> capacitacion = new ArrayList<Capacitacion>();

	
		users.add(new Cliente("12123123", "Ana", "Baez", "987658765", "Habitat", "1", "Quillota 980", "Viña", 25));
		users.add(new Administrativo());
		users.add(new Profesional());
		
		capacitacion.add(new capacitacion());
	
}
