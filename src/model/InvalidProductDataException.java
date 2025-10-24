package model;

/**
 * Clase excepción que se arroja en caso de ingresar cantidad o precio inválido
 * @author Juan José Argüello
 * @version 1.0
 */
public class InvalidProductDataException extends Exception {
    public InvalidProductDataException(String message){
        super(message); 
    }
    
}
