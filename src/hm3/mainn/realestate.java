/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hm3.mainn;


public class realestate {
   
    private property [] properties;
    private int count=0;
      public realestate() {
        properties = new property[100];
      
    }
          public void addProperty(property property) {
        if (count < 100) {
            properties[count++] = property;
        } else {
            System.out.println("Property limit reached.");
        }
    }
    public void removeproperty(int index){
    if (index >= 0 && index < count){
        properties[index] = null;
    } else {
        System.out.println("Invalid index.");
    }
    }
    
   public void displayProperties() {
    for (int i = 0; i < count; i++) {
        if (properties[i] != null) {
            properties[i].display(); 
            System.out.println();  
        }
    }
}

   
    }


