package model;


/**
 * @author Juan José Argüello
 * @version 1.0
 */
public class ExpiredProductException extends Exception{
     public ExpiredProductException(String message){
        super(message); 
    }
}
