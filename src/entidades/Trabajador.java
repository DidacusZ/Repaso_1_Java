package entidades;

public class Trabajador {

	//atributtos
	int id;
	String nombre;
	String apellidos;
	String dni;
	String fechaNacimiento;
	String titulacionMasAlta;
	long nSS;
	String nCuenta;
	
	//contructor lleno
	public Trabajador(int id, String nombre, String apellidos, String dni, String fechaNacimiento,
			String titulacionMasAlta, long nSS, String nCuenta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.titulacionMasAlta = titulacionMasAlta;
		this.nSS = nSS;
		this.nCuenta = nCuenta;
	}
	
	//constructtor vacio
	public Trabajador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getters y setters
//	public int getId() {
//		return id;
//	}
	public void setId(int id) {
		this.id = id;
	}
//	public String getNombre() {
//		return nombre;
//	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
//	public String getApellidos() {
//		return apellidos;
//	}
 	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
//	public String getDni() {
//		return dni;
//	}
	public void setDni(String dni) {
		this.dni = dni;
	}
//	public String getFechaNacimiento() {
//		return fechaNacimiento;
//	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
//	public String getTitulacionMasAlta() {
//		return titulacionMasAlta;
//	}
	public void setTitulacionMasAlta(String titulacionMasAlta) {
		this.titulacionMasAlta = titulacionMasAlta;
	}
//	public int getnSS() {
//		return nSS;
//	}
	public void setnSS(long nSS) {
		this.nSS = nSS;
	}
//	public String getnCuenta() {
//		return nCuenta;
//	}
	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}
	
	//to string
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", fechaNacimiento=" + fechaNacimiento + ", titulacionMasAlta=" + titulacionMasAlta + ", nSS=" + nSS
				+ ", nCuenta=" + nCuenta + "]";
	}	
	
}
