/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author truptiraut
 */
public class TypesDishes {
    private String Name;
    private String Description;
    private String Price;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public TypesDishes(String Name, String Description, String Price) {
        this.Name = Name;
        this.Description = Description;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return  Name ;
    }
    
    

    
}
