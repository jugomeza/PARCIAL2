
package prueba;

import java.util.ArrayList;

public class Person {
    private String name;
    private String id;
    ArrayList<Pet> listaPets = new ArrayList<>();

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public void showPets(){};
}
