/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String Name;
    private String UserName;
    private String Address;
    private String Contact;
    private ArrayList<TypesDishes> Menu;
    private ArrayList<Order> OrderList;

    public Restaurant(String UserName) {
        this.UserName = UserName;
        Menu= new ArrayList<TypesDishes>();
        OrderList= new ArrayList<Order>();
     
    }

   
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public ArrayList<TypesDishes> getMenu() {
        return Menu;
    }

    public void setMenu(ArrayList<TypesDishes> Menu) {
        this.Menu = Menu;
    }

    public ArrayList<Order> getOrderList() {
        return OrderList;
    }

    public void setOrderList(ArrayList<Order> OrderList) {
        this.OrderList = OrderList;
    }
    
    public void addFoodItem(TypesDishes menu){
        Menu.add(menu);
    }
    
    public void removeFoodItem(TypesDishes menu){
         Menu.remove(menu);
    }

    
    int id = 1;
      public void addOrder(String RestaurantName, String CustomerName, String DeliveryMan, ArrayList<TypesDishes> Order, Float Price, String DeliveryAddress) {
        Order order=new Order();
        order.setOrderId(String.valueOf(id));
        order.setCustomerName(CustomerName);
        order.setRestaurantName(RestaurantName);
        order.setDeliveryMan(DeliveryMan);
        order.setOrder(Order);
        order.setPrice(Price);
        order.setDeliveryAddress(DeliveryAddress);
        order.setStatus("New Order");
        OrderList.add(order);
        id++;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "Name=" + Name + '}';
    }
    
    
    
    
    
}
