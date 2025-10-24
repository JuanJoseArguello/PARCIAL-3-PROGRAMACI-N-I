package model;


/**
 * Clase que representa la clase de productos de tecnología
 * 
 * @author Juan José Argüello
 * @version 1.0
 */

public class TechProduct extends Product{
    private int warrantyMonths;

    public TechProduct(String name, double basePrice, int quantity, int warrantyMonths) throws InvalidProductDataException{
        super(name, basePrice, quantity);
        this.warrantyMonths = warrantyMonths;
    }


    /**
     * Método abstracto que srive para calcular el precio total del producto
     * @author Juan José Argüello
     * @version 1.0
     * @throws InvalidWarrantyException arroja una excepción si no existen meses de garantía
     */
    @Override
    public double calculateTotalPrice() throws InvalidWarrantyException{
        if (warrantyMonths <0 ) {
            throw new InvalidWarrantyException("Error: No existen meses de garantía"); 
        }
        return basePrice*quantity+(basePrice*0.05*warrantyMonths);
    }

    
}
