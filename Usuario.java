
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String alimento;
    private float cantidadEnGramos;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombre)
    {
        // initialise el nombre de la persona
        this.nombre = nombre;
    }

    /**
     * Te dice el alimento y los gramos de ese alimento que va a comer
     * el usuario
     */
    public void comer(Alimento alimento, float cantidadEnGramosQueVaAComer)
    {
        cantidadEnGramos = cantidadEnGramosQueVaAComer;
    }
    
    /**
     * Muestra los datos del usuario
     */
    public void mostrarDatos()
    {
        System.out.println ("Nombre:            " + nombre);
        
    }
}
