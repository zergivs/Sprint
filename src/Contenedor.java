import java.util.ArrayList;
import java.util.Scanner;

public class Contenedor implements Asesoria {

	public static ArrayList<Usuario> users = new ArrayList<Usuario>();
	public static ArrayList<Capacitacion> capacitacion = new ArrayList<Capacitacion>();

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub

	}

	public void addCliente() {
		Scanner input = new Scanner(System.in);
		System.out.println("\tINGRESAR NUEVO CLIENTE ");
		System.out.print("Ingrese RUT: ");
		String rut = input.nextLine();
		System.out.print("Ingrese nombre: ");
		String nombre = input.nextLine();
		System.out.print("Ingrese apellido: ");
		String apellido = input.nextLine();
		System.out.print("Ingrese telefono: ");
		String telefono = input.nextLine();
		System.out.print("ingrese AFP: ");
		String afp = input.nextLine();
		System.out.print("ingrese sistema de salud: ");
		String sistemaSalud = input.nextLine();
		System.out.print("Ingrese direccion: ");
		String direccion = input.nextLine();
		System.out.print("Ingrese comuna: ");
		String comuna = input.nextLine();
		System.out.print("Ingrese edad: ");
		int edad = input.nextInt();
		input.nextLine();
		Cliente cliente = new Cliente(rut, nombre, apellido, telefono, afp, sistemaSalud, direccion, comuna, edad);
		users.add(cliente);
		System.out.println("Nuevo cliente agregado exitosamente.");
	}

	public void addAdmin() {
		Scanner input = new Scanner(System.in);
		System.out.println("\tINGRESAR NUEVO ADMINISTRATIVO ");
		System.out.print("Ingrese RUT: ");
		String rut = input.nextLine();
		System.out.print("Ingrese nombre: ");
		String nombre = input.nextLine();
		System.out.print("Ingrese fecha nacimiento: ");
		String fechaNacimiento = input.nextLine();
		System.out.print("Ingrese area: ");
		String area = input.nextLine();
		System.out.print("Ingrese experiencia previa: ");
		String experienciaPrevia = input.nextLine();
		Administrativo admin = new Administrativo(rut, nombre, fechaNacimiento, area, experienciaPrevia);
		users.add(admin);
		System.out.println("Nuevo administrativo agregado exitosamente.");
	}

	public void addPro() {
		Scanner input = new Scanner(System.in);
		System.out.println("\tINGRESAR NUEVO PROFESIONAL ");
		System.out.print("Ingrese RUT: ");
		String rut = input.nextLine();
		System.out.print("Ingrese nombre: ");
		String nombre = input.nextLine();
		System.out.print("Ingrese fecha nacimiento: ");
		String fechaNacimiento = input.nextLine();
		System.out.print("Ingrese titulo: ");
		String titulo = input.nextLine();
		System.out.print("Ingrese fecha de ingreso: ");
		String fechaIngreso = input.nextLine();
		Profesional pro = new Profesional(rut, nombre, fechaNacimiento, titulo, fechaIngreso);
		users.add(pro);
		System.out.println("Nuevo profesional agregado exitosamente.");
	}

	public void addCapacitacion() {
		Scanner input = new Scanner(System.in);
		System.out.println("\tINGRESAR NUEVA CAPACITACION ");
		System.out.print("Ingrese numero de capacitacion: ");
		String capacitacionId = input.nextLine();
		System.out.print("Ingrese rut de cliente: ");
		String rutCliente = input.nextLine();
		System.out.print("Ingrese dia: ");
		String dia = input.nextLine();
		System.out.print("Ingrese hora: ");
		String hora = input.nextLine();
	}

	public void deleteUser() {
		System.out.println("\tELIMINAR USUARIO POR RUT");
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese rut: ");
		String rut = input.nextLine();
		boolean removed = false;
		for (Usuario user : users) {
			if (user.getRut().equals(rut)) {
				users.remove(user);
				removed = true;
				System.out.println("Cliente removido exitosamente.");
				break;
			}
		}
		if (!removed) {
			System.out.println("RUT " + rut + " no encontrado.");
		}
	}

	public void showUserList() {
		System.out.println("\tLISTA DE USUARIOS");
		if (users.isEmpty()) {
			System.out.println("Sin usuarios por el momento.");
			return;
		}
		for (Usuario user : users) {
			if (user instanceof Cliente) {
				// Display Cliente-specific fields
				Cliente cliente = (Cliente) user;
				System.out.println("RUT: " + cliente.getRut() + ", Nombre: " + cliente.getNombre()
						+ ", Fecha de nacimiento: " + cliente.getFechaNacimiento() + ", Teléfono: "
						+ cliente.getTelefono() + ", AFP: " + cliente.getAfp() + ", Sistema de salud: "
						+ cliente.getSistemaSalud() + ", Dirección: " + cliente.getDireccion() + ", Comuna: "
						+ cliente.getComuna() + ", Edad: " + cliente.getEdad());
			} else if (user instanceof Administrativo) {
				// Display Administrativo-specific fields
				Administrativo administrativo = (Administrativo) user;
				System.out.println("RUT: " + administrativo.getRut() + ", Nombre: " + administrativo.getNombre()
						+ ", Fecha de nacimiento: " + administrativo.getFechaNacimiento() + ", Área: "
						+ administrativo.getArea() + ", Experiencia previa: " + administrativo.getExperienciaPrevia());
			} else if (user instanceof Profesional) {
				// Display Profesional-specific fields
				Profesional profesional = (Profesional) user;
				System.out.println("RUT: " + profesional.getRut() + ", Nombre: " + profesional.getNombre()
						+ ", Fecha de nacimiento: " + profesional.getFechaNacimiento() + ", Título: "
						+ profesional.getTitulo() + ", Fecha de ingreso: " + profesional.getFechaIngreso());
			} else {
				// Display common fields for all types of users
				System.out.println("RUT: " + user.getRut() + ", Nombre: " + user.getNombre() + ", Fecha de nacimiento: "
						+ user.getFechaNacimiento());
			}
		}
	}

	public void showUserType(String userType) {
		if (users.isEmpty()) {
			System.out.println("Sin usuarios por el momento.");
			return;
		}
		System.out.println("\tLISTA DE " + userType + "s:");
		for (Usuario user : users) {
			if (user instanceof Cliente && userType.equals("Cliente")) {
				// Display Cliente-specific fields
				Cliente cliente = (Cliente) user;
				System.out.println("RUT: " + cliente.getRut() + ", Nombre: " + cliente.getNombre()
						+ ", Fecha de nacimiento: " + cliente.getFechaNacimiento() + ", Teléfono: "
						+ cliente.getTelefono() + ", AFP: " + cliente.getAfp() + ", Sistema de salud: "
						+ cliente.getSistemaSalud() + ", Dirección: " + cliente.getDireccion() + ", Comuna: "
						+ cliente.getComuna() + ", Edad: " + cliente.getEdad());
			} else if (user instanceof Administrativo && userType.equals("Administrativo")) {
				// Display Administrativo-specific fields
				Administrativo administrativo = (Administrativo) user;
				System.out.println("RUT: " + administrativo.getRut() + ", Nombre: " + administrativo.getNombre()
						+ ", Fecha de nacimiento: " + administrativo.getFechaNacimiento() + ", Área: "
						+ administrativo.getArea() + ", Experiencia previa: " + administrativo.getExperienciaPrevia());
			} else if (user instanceof Profesional && userType.equals("Profesional")) {
				// Display Profesional-specific fields
				Profesional profesional = (Profesional) user;
				System.out.println("RUT: " + profesional.getRut() + ", Nombre: " + profesional.getNombre()
						+ ", Fecha de nacimiento: " + profesional.getFechaNacimiento() + ", Título: "
						+ profesional.getTitulo() + ", Fecha de ingreso: " + profesional.getFechaIngreso());
			} else if (userType.equals("Usuario")) {
				// Display common fields for all types of users
				System.out.println("RUT: " + user.getRut() + ", Nombre: " + user.getNombre() + ", Fecha de nacimiento: "
						+ user.getFechaNacimiento());
			}
		}
	}

	public void showCapacitacion() {
		if (capacitacion.isEmpty()) {
			System.out.println("Sin capacitacion por el momento.");
			return;
		}
		System.out.println("List of Capacitaciones:");
		for (Capacitacion cap : capacitacion) {
			System.out.println("Capacitacion ID: " + cap.getCapacitacionId() + ", Rut Cliente: " + cap.getRutCliente()
					+ ", Día: " + cap.getDia() + ", Hora: " + cap.getHora() + ", Lugar: " + cap.getLugar()
					+ ", Duración: " + cap.getDuracion() + ", Cantidad de asistentes: " + cap.getCantidadAsistentes());
		}
	}
}
