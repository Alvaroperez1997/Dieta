
/**
 * Write a description of class Alimento here.
 * 
 * @author (Arthur Gosling) 
 * @version (the good one)
 */
public class Alimento
{
    // instance variables - proteinas,carbohidratos y grasas
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    private String nombreAlimento;
    private float caloriasTotales;

    private String MacroMayoritario;
    
    /**
     * Constructor for objects of class Alimento
     */
    public Alimento(String nombreAlimento ,float proteinas,float carbohidratos,float grasas)
    {
        // initializa alimento con un parámetro de tipo String "nombre" y sus componentes de tipo float.
        this.nombreAlimento = nombreAlimento;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;

    }

    /**
     * Método que muestra datos de los alimentos y cual es el macronutriente mayoritario
     * Si dos macronutrientes son iguales y son mayoritarios,se muestran ambos.
     *  Si los macronutrientes son mayores de 100 gramos, el dato introducido no se considera válido.
     */
    public void muestraDatos()
    {
        System.out.println ("Nombre del alimento " +  nombreAlimento ) ;
        System.out.println ("Proteínas por cada 100 gramos " +  proteinas ) ;
        System.out.println ("Carbohidratos por cada 100 gramos " +  carbohidratos ) ;
        System.out.println ("Grasas por cada 100 gramos " +  grasas ) ;
        caloriasTotales =(proteinas*4)+ (carbohidratos*4)+(grasas*9);
        if (proteinas >=0 && proteinas<=100 && carbohidratos>=0 && carbohidratos<=100 && grasas >=0 && grasas <=100)
        {
            if (proteinas > carbohidratos && proteinas > grasas)
            {
                MacroMayoritario =  " proteinas";
            }
            else if (carbohidratos > proteinas && carbohidratos > grasas)
            {
                MacroMayoritario = "carbohidratos" ;
            }
            else if(grasas > carbohidratos && grasas > proteinas)
            {
                MacroMayoritario =  "grasas";
            }
            else if(proteinas == carbohidratos && proteinas != grasas && proteinas > grasas )
            {
                MacroMayoritario =  "proteínas y carbohidratos";
            }
            else if(proteinas == grasas && proteinas != carbohidratos && proteinas > carbohidratos )
            {
                MacroMayoritario =  "proteínas y grasas";
            }
            else if(carbohidratos == grasas && proteinas != carbohidratos && proteinas <carbohidratos )
            {
                MacroMayoritario =  "carbohidratos y grasas";
            }
        }
        else
        {
            System.out.println ("El macronutriente no es válido "  ) ;
        }
        System.out.println ("El macronutriente mayoritario es  " +  MacroMayoritario ) ;
        System.out.println ("Las calorias totales son  " +  caloriasTotales ) ;//la ultima parte en entornos de desarrollo, lo de num1<num2ESTE EJERCICIO BUSCALO
    }
    
    
}
