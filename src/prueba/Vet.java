
package prueba;

import java.util.ArrayList;

public class Vet {

    ArrayList<Pet> listaPets = new ArrayList<>();

    public Vet() {
    }

    public boolean removePet(String id) {
        for (Pet p : listaPets) {
            if (id == p.getId()) {
                listaPets.remove(p);
                System.out.println("se elimino correctamente");
                return true;
            }
        }
        System.out.println("no se elimino");
        return false;

    }

    public void showPetsByType(String type) {
        for (Pet p : listaPets) {
                if (type == p.getType()) {
                    System.out.println(p);
                }
            }
        
    }
    public void showPets(){
         System.out.println();
    }
    
}
