package clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public abstract class ClasePadre_Abstracta {
    // protected El campo o método es visible en la clase en donde se define y en cualquiera de sus subclases

    protected int transacciones;
    protected int retiro;
    protected int deposito;
   

    //Static la variable es única para todas las instancias (objetos) de la clase (ocupa un único lugar en memoria).
    //private cualquier elemento de una clase que sea privado puede ser accedido únicamente por la misma clase por nada más
    private static int saldo;
    private static String nombre;
    private static String banco;
    private static long cbu;

    
  
    
    Scanner sc = new Scanner(System.in);

    
   
     
    //Mostramos el menu
    public void Operaciones() {

        int bandera = 0; //Solamente la usamos para entrar o salir del DO
        int seleccion = 0; //SELECCION es para elegir la opcion del menu
        try {

            do {
                do { // este evalua que se elija la opcion del menu correcto

                    System.out.println("Por favor selecciono una opcion: ");
                    System.out.println("    0. Extraccion comprobante CBU     ");
                    System.out.println("    1. Consulta de Saldo.    ");
                    System.out.println("    2. Retiro de efectivo.   ");
                    System.out.println("    3. Deposito de Efectivo.     ");

                    System.out.println("    4. Salir.   ");

                    seleccion = Integer.parseInt(sc.next());

                    if (seleccion >= 0 && seleccion <= 4) {
                        bandera = 1;
                    } else {
                        System.out.println("------------------------------------------------------");
                        System.out.println(" Opcion no disponible, vuelva a intentar por favor. ");
                        System.out.println("------------------------------------------------------");
                    }
                } while (bandera == 0);
                if (seleccion == 0) {  //Invocamos la clase hija correspondiente para darle uso basado en los atributos de la clase padre
                    ClasePadre_Abstracta estadoCuenta = new ClaseHija_Cbu();
                    estadoCuenta.Transacciones();
                } else if (seleccion == 1) {
                    ClasePadre_Abstracta estadoCuenta = new ClaseHija_Consulta();
                    estadoCuenta.Transacciones();
                } else if (seleccion == 2) {
                    ClasePadre_Abstracta estadoCuenta = new ClaseHija_Retiro();
                    estadoCuenta.Transacciones();
                } else if (seleccion == 3) {
                    ClasePadre_Abstracta estadoCuenta = new ClaseHija_Deposito();
                    estadoCuenta.Transacciones();
                } else if (seleccion == 4) {
                    System.out.println("------------------------------------------------------");
                    System.out.println("          .  Gracias " + nombre + "!, Vuelva pronto.               ");
                    System.out.println("------------------------------------------------------");
                    bandera = 2;
                }

            } while (bandera != 2);
        } catch (Exception e) {
            System.out.println("------------------------------------------------------");
            System.out.println("Opcion del menu desconocida, desconectando por seguridad"); //al sout podemos agregarle + e de objeto, si queremos ver el error de codigo 
            System.out.println("------------------------------------------------------");

        } finally {
            System.out.println("------------------------------------------------------");
            System.out.println("PARA INICIAR SESION NO OLVIDES ELEGIR LA OPCION DEL MENU Y VALORES VALIDOS- SALUDOS " + this.nombre());
            System.out.println("------------------------------------------------------");
        }

    }

    //Retiramos
    public void Retiro() {
        retiro = Integer.parseInt(sc.next());

    }

  

    //Depositamos
    public void Deposito() {
        deposito = Integer.parseInt(sc.next());
    }

    public void crearCbu() {
        int bandera = 0;

        if (bandera == 0) {

            //Usamos los numeros de la diagonal principal como CBU y los guardamos en el numero array de abajo
            int[] cbuArray = new int[22]; // AQUI es "ABAJO" ,
            bandera += 1;
            int matriz[][] = new int[22][22]; //usamos 22 numeros por la cantidad de numeros del CBU
            for (int x = 0; x < matriz.length; x++) {
                for (int y = 0; y < matriz[x].length; y++) {
                    matriz[x][y] = (int) (Math.random() * 9); //numero aleatorio entre  0 y 9
                    if (x == y) {
                        cbuArray[x] = matriz[x][y]; // CBU  , el cual esta creado en base a la DIAGONAL PRINCIPAL DE LA MATRIZ
                    }
                }
            }
            //mostramos la matriz para ver si funca realmente . luego la mostramos si necesitamos revisar algo
            /* for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println("");
        }  */ //dejamos comentada la matriz por si necesita ser mostrada en caso de revision 

            //muestro el CBU  , el cual esta creado en base a la DIAGONAL PRINCIPAL DE LA MATRIZ
            for (int x = 0; x < cbuArray.length; x++) {
                System.out.print(cbuArray[x]);

            }
        } else {
            getCbu();
        }

        System.out.println("   ");

        //getCbu();
    } //creamos el cbu con la diagonal Principal de la matriz usando un array dependiente de la matriz con numeros aleatorios

    //Lo vamos a usar segun el caso, aca usamos polimorfismo  con el metodo abstracto.
    public abstract void Transacciones(); //Esto es metodo abstracto  ,solo lleva parentesis y lo modificamos en las clases hijas

    public void cargarDatosNombre() {
        System.out.println("Ingresa tu nombre y Apellido: ");
        nombre = sc.nextLine();
        var nombreUser = 0;
        nombreUser = nombre.length();
        while (nombreUser < 3) {
            System.out.println(" El nombre de Usuario ingresado no es valido, ingrese su nombre de la cuenta: ");
            nombre = sc.nextLine();
            nombreUser = nombre.length();
        }

    }// LE METIMOS UNA VALIDACION PARA QUE NO INGRESEN EL CAMPO NULL

    public void cargarDatosBanco() {
        System.out.println("Ingresa el banco al cual pertenece la cuenta: ");
        banco = sc.nextLine();
        var nombreBanco = 0;
        nombreBanco = banco.length();
        while (nombreBanco < 4) {
            System.out.println(" El nombre del Banco  ingresado no es valido, ingrese su nombre de la cuenta: ");
            banco = sc.nextLine();
            nombreBanco = banco.length();
        }
    }  // lO MISMO QUE ARRIBA, VALIDAMOS PARA QUE NO METAN UN CAMPO NULL

   
    //Metodos setter y getter para consultar las variables Saldo
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public long getCbu() {
        return cbu;
    }

    public void setCbu(long cbu) {
        this.cbu = cbu;
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public String banco() {
        return banco;
    }

    public void setBanco() {
        this.banco = banco;
    }
    
   
   

}
