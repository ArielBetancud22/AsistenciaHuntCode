package clases;

public class ClaseHija_Retiro extends ClasePadre_Abstracta {

    @Override
    public void Transacciones() {

        try {
            System.out.println("--------------------------------");
            System.out.print(" Cuanto deseas retirar ? ");
            Retiro(); //llamamos el metodo de la clase padre para pedir el saldo y guardarlo
            if (retiro <= getSaldo()) {  //PARA VALIDAR QUE TENGAMOS SALDO EN LA CUENTA 
                transacciones = getSaldo(); //guardamos en el atributo transaccines el saldo que tenemos actualmente
               
                
                setSaldo(transacciones - retiro); // SETEAMOS, es decir cambiamos el valor del monto que tenemos. Restamos lo de RETIRO a Transacciones y lo guardamos en Saldo
                System.out.println("--------------------------------");
                System.out.println("        Retiraste : " + retiro + " de la cuenta de " + this.banco());
        
                
                System.out.println("        Tu saldo actual es: " + getSaldo());
                System.out.println("--------------------------------");
            } else {
                System.out.println("--------------------------------");
                System.out.println(" Saldo insuficiente en tu cuenta de " + this.banco());
                System.out.println("--------------------------------");
            }

        } catch (Exception e) {
            System.out.println("--------------------------------");
            System.out.println("\"El sistema de deposito no admite letras , simbolos o numeros con coma. Por el momento, por favor solo ingresa numeros enteros"); //al sout podemos agregarle + e de objeto, si queremos ver el error de codigo 
            System.out.println("--------------------------------");
        }
        
        

    }

}
