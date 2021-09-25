/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.Restaurant.TypesDishes;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String Name;
    private String UserName;
    private ArrayList<Order> OrderList;
    private String Address;
    private int Number;

    @Override
    public String toString() {
        return  UserName ;
    }
    
    

    public DeliveryMan(String UserName) {
        this.UserName = UserName;
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

    public ArrayList<Order> getOrderList() {
        return OrderList;
    }

    public void setOrderList(ArrayList<Order> OrderList) {
        this.OrderList = OrderList;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }
    
     public void addOrder(String RestaurantName, String CustomerName, String DeliveryMan, ArrayList<TypesDishes> Order, Float Price, String DeliveryAddress) {
        Order order=new Order();
        
        order.setCustomerName(CustomerName);
        order.setRestaurantName(RestaurantName);
        order.setDeliveryMan(DeliveryMan);
        order.setOrder(Order);
        order.setPrice(Price);
        order.setDeliveryAddress(DeliveryAddress);
        order.setStatus("New Order");
        OrderList.add(order);
    
     }
     
}
