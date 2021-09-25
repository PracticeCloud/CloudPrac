/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.TypesDishes;
import java.util.ArrayList;

/**
 *
 * @author truptiraut
 */
public class Order {
    private String OrderId;
    private String RestaurantName;
    private String CustomerName;
    private String DeliveryMan;
    private ArrayList<TypesDishes> Order;
    private Float Price;
    private String Status;
    private String DeliveryAddress;

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        this.OrderId = orderId;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.RestaurantName = restaurantName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getDeliveryMan() {
        return DeliveryMan;
    }

    public void setDeliveryMan(String DeliveryMan) {
        this.DeliveryMan = DeliveryMan;
    }

    public ArrayList<TypesDishes> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<TypesDishes> Order) {
        this.Order = Order;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        this.Price = price;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.DeliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return  OrderId ;
    }
    
    
    
}
