package view;

import java.time.LocalDate;
import java.util.Scanner;
import controller.Order;
import model.ClothingProduct;
import model.ExpiredProductException;
import model.FoodProduct;
import model.InvalidProductDataException;
import model.InvalidSizeException;
import model.InvalidWarrantyException;
import model.TechProduct;

/**
 * Clase principal que contiene la interacción con el usuario
 * 
 * @author Juan José Argüello
 * @version 1.0
 */

public class App {
    private static Order o = new Order();
    private static ClothingProduct clothingP;
    private static TechProduct techP;

    public static void main(String[] args) throws Exception {
        menu();
    }

    /**
     * Método que con tiene todo el menú principal e interacción con el usuario
     */
    public static void menu() {

        Scanner sc = new Scanner(System.in);
        String op = "";
        System.out.println("=== FAST DELIVERY APP ===");
        do {
            try {
                System.out.println("""
                        Eliga una opción:
                        1. Agregar producto alimenticio
                        2. Agregar producto tecnológico
                        3. Agregar prenda de ropa
                        4. Mostrar pedido
                        5. Calcular total
                        0. Salir
                                        """);
                op = sc.nextLine();
                switch (op) {
                    case "1":// agregar producto alimenticio
                        System.out.println("Ingrese el nombre del producto: ");
                        String nameP = sc.nextLine();
                        System.out.println("Ingrese el precio base del producto: ");
                        String priceP = sc.nextLine();
                        System.out.println("Ingrese la cantidad del producto: ");
                        String quantityP = sc.nextLine();
                        System.out.println("Ingrese la fecha de expiración del producto:(YYYY-MM-DD) ");
                        String expirationDateP = sc.nextLine();
                        o.addProduct(new FoodProduct(nameP, Double.parseDouble(priceP), Integer.parseInt(quantityP),
                                LocalDate.parse(expirationDateP)));

                        break;
                    case "2": // agregar producto tecnológico
                        System.out.println("Ingrese el nombre del producto: ");
                        String namePT = sc.nextLine();
                        System.out.println("Ingrese el precio base del producto: ");
                        String pricePT = sc.nextLine();
                        System.out.println("Ingrese la cantidad del producto: ");
                        String quantityPT = sc.nextLine();
                        System.out.println("Ingrese los meses de garantía del producto: ");
                        String warrantyM = sc.nextLine();
                        o.addProduct(new TechProduct(namePT, Double.parseDouble(pricePT), Integer.parseInt(quantityPT),
                                Integer.parseInt(warrantyM)));

                        break;
                    case "3": // agregar producto ropa
                        System.out.println("Ingrese el nombre del producto: ");
                        String namePC = sc.nextLine();
                        System.out.println("Ingrese el precio base del producto: ");
                        String pricePC = sc.nextLine();
                        System.out.println("Ingrese la cantidad del producto: ");
                        String quantityPC = sc.nextLine();
                        System.out.println("Ingrese la talla del producto (S, M, L, XL): ");
                        String size = sc.nextLine();
                        o.addProduct(
                                new ClothingProduct(namePC, Double.parseDouble(pricePC), Integer.parseInt(quantityPC),
                                        size));

                        break;
                    case "4": // Mostrar pedido
                        o.showOrderDetails();
                        break;
                    case "5": // Calcular Total
                        o.calculateTotalOrderValue();
                        break;
                    case "0":
                        System.out.println("Cerrando el programa...");
                        break;

                    default:
                        System.err.println("Opción inválida");
                        break;
                }
            } catch (ExpiredProductException e) {
                System.out.println(e.getMessage());

            } catch (InvalidProductDataException e) {
                System.out.println(e.getMessage());

            } catch (InvalidSizeException e) {
                System.out.println(e.getMessage());
            } catch (InvalidWarrantyException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        } while (!op.equals("0"));

    }
}
