
package shoppingcart02;

public class JvonShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double itemprice = 12.00, Salestax = .10 ;
        
        int itemquantity = 2;
        // Declare and assign a calculated totalPrice
        
        double totalPrice = ((itemprice*itemquantity));
        // Modify message to include quantity 
        
        totalPrice = (totalPrice + (totalPrice* Salestax));
               
        
        
        System.out.println(message);
        System.out.println("Total cost with tax is: $" + totalPrice);
        // Print another message with the total cost
        
    }    
}
