
package clases;


public class ClaseHija_Consulta extends   ClasePadre_Abstracta{
    
    @Override  //Recordar que cuando llamammos un metodo abstracto, SIEMPRE debemos sobreescribir, en su defecto override.
    public void Transacciones (){
        System.out.println("  -------------------------------------------- ");
        System.out.println("          BANCO "+this.banco());
        System.out.println("  Tu saldo Actual de tu cuenta es:        "+ getSaldo()+ " ARS ");
        System.out.println("  ---------------------------------------------");
    }
    
    
    
    
}
