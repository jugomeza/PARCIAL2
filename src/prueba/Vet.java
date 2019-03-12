
package prueba;

import java.util.ArrayList;

public class Vet {

    ArrayList<Pet> listaPets = new ArrayList<>();

    public Vet() {
    }

    public void removePet(Pet p) {
        listaPets.remove(p.getId());
        GestionArchivos.aniadirArchivo(listaPets);
    }

    public void showPetsByType(String type) {
        for (int i = 0;listaPets.get(i) != null; i++) {
                if (type == listaPets.get(i).getType()) {
                    System.out.println(listaPets.get(i));
                }
            }
        
    }
    public void showPets(){
         System.out.println("Las mascotas que hay son: \n"+GestionArchivos.leerArchivo());
    }
    
}
