package model;

/**
 * Clase abstracta que representa producto
 * 
 * @author Juan José Argüello
 * @version 1.0
 */

public abstract class Product {
    protected String name;
    protected double basePrice;
    protected int quantity;

    public Product(String name, double basePrice, int quantity) throws InvalidProductDataException {
        this.name = name;
        if (basePrice <= 0 || quantity <= 0) {
            throw new InvalidProductDataException("Error: La cantidad o el precio no pueden ser negativas");
        }
        this.basePrice = basePrice;
        this.quantity = quantity;
    }

    /**
     * Método abstracto que srive para calcular el precio total del producto
     * @author Juan José Argüello
     * @version 1.0
     * @throws ExpiredProductException 
     * @throws InvalidWarrantyException
     * @throws InvalidSizeException
     */
    public abstract double calculateTotalPrice()
            throws ExpiredProductException, InvalidWarrantyException, InvalidSizeException;

    @Override
    public String toString() {
        return "Product [nombre=" + name + ", precioBase=" + basePrice + ", cantidad=" + quantity + "]";
    }

}
