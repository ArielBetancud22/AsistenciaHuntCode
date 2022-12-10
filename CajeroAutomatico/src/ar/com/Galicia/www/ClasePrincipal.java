package ar.com.Galicia.www;

import clases.ClaseHija_Consulta;
import clases.ClasePadre_Abstracta;


public class ClasePrincipal {

    public static void main(String[] args) {
      
       
        
        //Uso la abstract para el saldo
        ClasePadre_Abstracta estadoCuenta = new ClaseHija_Consulta();
        estadoCuenta.cargarDatosNombre();// CARGAMOS EL NOMBRE Y VALIDAMOS 
        estadoCuenta.cargarDatosBanco(); //CARGAMOS EL NOMBRE Y VALIDAMOS
        estadoCuenta.setSaldo(10000); //aca le ponemos el saldo inicial que queramos por parametros o lo dejamos en Cero
        estadoCuenta.Operaciones(); // invocamos todo el menu.

    }
    

  
}
