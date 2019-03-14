
package prueba;

import java.util.ArrayList;

public class Vet {

    ArrayList<Pet> listaPets = new ArrayList<>();

    public Vet() {
    }

    public boolean removePet(String id) {
        for (int i = 0; i < listaPets.size(); i++) {
            if(listaPets.get(i)==null){
                System.out.println("no se encontro");
                return false;
            }else if(listaPets.get(i).getId() == id){
                listaPets.remove(listaPets.get(i));
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
