/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.awt.Menu;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> RestaurantList;
    private Restaurant Restaurant;
    private TypesDishes Menu;

    public RestaurantDirectory() {
        RestaurantList = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return RestaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> RestaurantList) {
        this.RestaurantList = RestaurantList;
    }

    public Restaurant getRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.Restaurant = Restaurant;
    }

    public TypesDishes getMenu() {
        return Menu;
    }

    public void setMenu(TypesDishes menu) {
        this.Menu = Menu;
    }
     public Restaurant createNewUserAccount(String username){
        Restaurant = new Restaurant(username);
        RestaurantList.add(Restaurant);
        return Restaurant;
    }
     
     public void updateRestaurantInfo(Restaurant restaurant, String Name,String Contact,String Address ){
         restaurant.setName(Name);
         restaurant.setAddress(Address);
         restaurant.setContact(Contact);
     }
     
    
    
    public void deleteRestaurant(String username){
        for(int i=0;i<RestaurantList.size();i++){
            if(RestaurantList.get(i).getUserName()==username){
                RestaurantList.remove(i);
            }
        }
    
    }
    
    public TypesDishes AddMenuDishes(Restaurant restaurant,String Name,String Description,String Price){
        Menu=new TypesDishes(Name, Description, Price);
        restaurant.addFoodItem(Menu);
        return Menu;
    }
    
    public void DeleteDishes(Restaurant restaurant ,TypesDishes menu){
        restaurant.removeFoodItem(menu);
        
    }
    
    
    
    
}
