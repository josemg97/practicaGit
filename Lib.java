/**
 *
 * @author José María Muñoz García
 */

public class Lib {

    public void metodoAlumno1(){
        metodoAlumno2();
	System.out.println("modificado por alumno 1"); // alumno 1
    }

    public void metodoAlumno2(){
        metodo3();
	System.out.println("modificado por alumno 2"); //alumno 2 
    }

    public void metodoComunitario(){

        System.out.println("cambio en master");

        System.out.println("cambio en metodo3");
        // modificaciones alumno2 
	System.out.println("Alumno2 inserta esta sentencia");   
	// modificaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");

    }
	public void metodo3(){
	System.out.println("metodo  3");
}
}
