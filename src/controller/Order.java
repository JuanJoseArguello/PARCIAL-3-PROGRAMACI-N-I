package controller;

import java.util.ArrayList;

import model.ExpiredProductException;
import model.InvalidSizeException;
import model.InvalidWarrantyException;
import model.Product;

/**
 * Clase que representa el pedido completo
 * @author Juan José Argüello
 * @version 1.0
 */

public class Order {
    private ArrayList<Product> products = new ArrayList<>(); 

    public void addProduct(Product p){
        products.add(p); 
        System.out.println("Producto agregado con exito");
    }

    public void showOrderDetails()throws ExpiredProductException, InvalidWarrantyException, InvalidSizeException{
        for (Product p : products) {
            System.out.println(p.toString()+" valor total: "+p.calculateTotalPrice()+"\n");
        }
    }

    public void calculateTotalOrderValue() throws ExpiredProductException, InvalidWarrantyException, InvalidSizeException{
        int totalPrice= 0; 
        for (Product p : products) {
            totalPrice += p.calculateTotalPrice();
        }
        System.out.println("Valor total del pedido: "+totalPrice); 
    }
}
