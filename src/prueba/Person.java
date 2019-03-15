
package prueba;

import java.util.ArrayList;

public class Person {
    private String name;
    private String id;
    ArrayList<Pet> listaPets = new ArrayList<>();

    public Person(String id, String name) {
        this.name = name;
        this.id = id;
    }
public boolean removePet(String id) {
        for (Pet p : listaPets) {
                if (id.equals(p.getId())) {
                    System.out.println(p);
                    listaPets.remove(p);
                    System.out.println("\n removido de la persona");
                    return true;
                }
            }
        System.out.println("\n error al remover");
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Pet> getListaPets() {
        return listaPets;
    }

    public void setListaPets(ArrayList<Pet> listaPets) {
        this.listaPets = listaPets;
    }
    
    public void showPets(){};
}
