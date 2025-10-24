package model;

/**
 * Clase que representa los productos de ropa
 * @author Juan José Argüello Alvarado
 * @version 1.0
 */

public class ClothingProduct extends Product{
    private String size;

    public ClothingProduct(String name, double basePrice, int quantity, String size) throws InvalidProductDataException{
        super(name, basePrice, quantity);
        this.size = size;
    }


 
/**
 * Clase que representa los productos de ropa
 * @return el precio total de los productos ropa
 * @version 1.0
 * @exception InvalidSizeException Arroja excepción en caso de colocar una talla inválida
 */
    @Override
    public double calculateTotalPrice() throws InvalidSizeException{
        if (size != "S"||size != "M"||size != "L"  ||size != "XL"||size != "s"||size != "m"||size != "l"||size != "xl") {
            throw new InvalidSizeException("Error: La talla no corresponde con (S, M, L ,XL)"); 
        }
        return basePrice*quantity;
    } 
    
    

}
