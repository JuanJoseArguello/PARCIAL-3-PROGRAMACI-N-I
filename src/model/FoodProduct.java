package model;

import java.time.LocalDate;

/**
 * Clase abstracta que representa producto de tipo comida
 * 
 * @author Juan José Argüello
 * @version 1.0
 */


public class FoodProduct extends Product{
    private LocalDate expirationDate;

    public FoodProduct(String name, double basePrice, int quantity, LocalDate expirationDate) throws InvalidProductDataException {
        super(name, basePrice, quantity);
        this.expirationDate = expirationDate;
    }

    /**
     * Método abstracto que srive para calcular el precio total del producto
     * @author Juan José Argüello
     * @version 1.0
     * @throws ExpiredProductException arroja una excepción si el producto está caducado
     */
    @Override
    public double calculateTotalPrice() throws ExpiredProductException{
        if (expirationDate.isBefore(LocalDate.now())) {
            throw new ExpiredProductException("Error: El producto no puede estar caducado");
        }
        return basePrice * quantity*0.9;
    } 

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
    }
    
    
    
    
}
