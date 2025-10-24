package model;


/**
 * Clase excepción que se arroja en caso de ingresar un producto sin garantía
 * @author Juan José Argüello
 * @version 1.0
 */
public class InvalidWarrantyException extends Exception{
     public InvalidWarrantyException(String message){
        super(message); 
    }
}
