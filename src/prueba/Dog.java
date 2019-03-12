/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author INTEL
 */
public class Dog extends Pet {

    private String breed;
    public Dog(){}

    public Dog(String breed, String id, String name, String haircolor) {
        super(id, name, haircolor);
        this.breed = breed;
        setType("Perro");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

   
    
    @Override 
    public String sound(){
    return "guau";}
    
    
    
}
