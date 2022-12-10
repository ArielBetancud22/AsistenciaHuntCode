package clases;

public class ClaseHija_Cbu extends ClasePadre_Abstracta {

    @Override
    public void Transacciones() {

        System.out.println("  ---------------------------------- ");
        System.out.println("Mostrando CBU PERSONAL : ");
        crearCbu();
        System.out.println("Banco : " + this.banco());
        System.out.println("  ---------------------------------- ");
    }

}
