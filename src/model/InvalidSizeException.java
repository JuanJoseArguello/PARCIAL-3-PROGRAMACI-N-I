package model;


/**
 * Clase excepción que se arroja en caso de ingresar una talla inválida
 * @author Juan José Argüello
 * @version 1.0
 */
public class InvalidSizeException extends Exception{
     public InvalidSizeException(String message){
        super(message); 
    }
}
