
/**
 * Write a description of class PruebasConWhite here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PruebasConWhile
{
    // instance variables - replace the example below with your own
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void multiplosDe5()
    {
        int indice = 10;
        while (indice >= 10 && indice <=95 )
        {
            System.out.println(indice);
            indice +=5;
        }
        
    }
    
    public void sumaEntre1y10()
    {
        int suma = 0;
        int indice =1;
        while (indice <11)
        {
            suma += indice;
            indice++;
        }
        System.out.println(suma);
    }
    
    public void sumaAyB(int a ,int b)
    {
        int suma = 0;
        int indice = a;
        while (indice < b+1)
        {
            suma = a;
            indice++;
        }
        System.out.println(suma);
    }
    
    public boolean isPrime (int n)
    {
        int divisor = 2;
        boolean esPrimo = true;
        while (divisor<n)
        {
            if(n % divisor == 0)
            {
                esPrimo = false;
            }
            divisor ++;
        }
        return esPrimo ;
    }
    
    
    
}
