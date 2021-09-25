/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManList;

    public DeliveryManDirectory getDeliveryManList() {
        
        if(deliveryManList == null){
            deliveryManList = new DeliveryManDirectory();
        }
        return deliveryManList;
    }

    public void setDeliveryManList(DeliveryManDirectory deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    

    public RestaurantDirectory getRestaurantDirectory() {
        if(restaurantDirectory == null){
            restaurantDirectory = new RestaurantDirectory();
        }
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

   
   
    public CustomerDirectory getCustomerDirectory() {
        if(customerDirectory == null){
            customerDirectory = new CustomerDirectory();
        }
        
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

//    public DeliveryManDirectory getDeliveryManList() {
//        if(deliveryManList == null){
//            deliveryManList = new DeliveryManDirectory();
//        }
//        
//        return deliveryManList;
//    }
//
//    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManList) {
//        this.deliveryManList = deliveryManList;
//    }
    
    
    
     public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManList = deliveryManDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
