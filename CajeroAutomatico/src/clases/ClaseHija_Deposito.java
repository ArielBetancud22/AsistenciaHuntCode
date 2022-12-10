package clases;

/**
 *
 * @author santi
 */
public class ClaseHija_Deposito extends ClasePadre_Abstracta {

    @Override
    public void Transacciones() {
        try {
            int bandera = 0;
            while (bandera == 0) { // validamos que no ingresen numeros negativos en el deposito
                System.out.print(" ¿Cuanto deseas Depositar ? ");
                Deposito(); //nos pide con el scanner el monto y lo guarda en una variable

                if (this.deposito <= 0) {
                    System.out.println("El monto no es valido, debes ser mayor a 0, \n Vuelve a ingresar el valor: ");
                    Deposito(); //nos pide con el scanner el monto y lo guarda en una variable
                    if (this.deposito > 0) {
                        transacciones = getSaldo(); //guardamos temporalmente en esta varibale el monto del saldo disponible
                        setSaldo(transacciones + deposito); //mandamos a guardar en la clase padre el valor que teniamos MAS el que sumamos. 
                        bandera += 1;
                    };
                } else {
                    bandera += 1;
                    transacciones = getSaldo(); //guardamos temporalmente en esta varibale el monto del saldo disponible
                    
                    setSaldo(transacciones + deposito); //mandamos a guardar en la clase padre el valor que teniamos MAS el que sumamos.
                  
                }

            }
        } catch (Exception e) {
            System.out.println("El sistema de deposito no admite letras , simbolos o numeros con coma. Por el momento, por favor solo ingresa numeros enteros");  //al sout podemos agregarle + e de objeto, si queremos ver el error de codigo 
        }

        // setSaldo(deposito +getSaldo());
        System.out.println("-------------------------------------");
        System.out.println("Depositaste: " + deposito + " ARS  en su cuenta del banco " + this.banco());
        System.out.println("   Su saldo actual es de: " + getSaldo() + " ARS");
        System.out.println("-------------------------------------");
    }

}
