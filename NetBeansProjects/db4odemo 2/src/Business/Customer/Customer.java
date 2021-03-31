/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.TypesDishes;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    private String Name;
    private String userName;
    private ArrayList<Order> orderList;
    private String address;
    private int number;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Order> getOrderlist() {
        return orderList;
    }

    public void setOrderlist(ArrayList<Order> orderlist) {
        this.orderList = orderlist;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

   

    public Customer(String userName) {
        this.userName = userName;
        orderList= new ArrayList<Order>();
    }
    
    int id=1;
    public void addnewOrder(String RestaurantName, String CustomerName , String DeliveryMan, ArrayList<TypesDishes> Order, Float Price, String DeliveryAddress){
        Order order= new Order();
        order.setOrderId(String.valueOf(id));
        order.setRestaurantName(RestaurantName);
        order.setCustomerName(CustomerName);
        order.setDeliveryMan(DeliveryMan);
        order.setDeliveryAddress(DeliveryAddress);
        order.setOrder(Order);
        order.setPrice(Price);
        orderList.add(order);
        id++;
        
        
;    }
    
    
    
    
}
