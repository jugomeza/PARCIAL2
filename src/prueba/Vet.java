
package prueba;

import java.util.ArrayList;
import java.util.Scanner;
public class Vet {

    ArrayList<Pet> listaPets = new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    public Vet() {
    }

    public boolean removePet(String id) {
        for (Pet p : listaPets) {
                if (id.equals(p.getId())) {
                    System.out.println(p);
                    listaPets.remove(p);
                    System.out.println("\n removido de la veterinaria");
                    return true;
                }
            }
        System.out.println("\n error al remover");
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
        for (Pet p : listaPets) {
            System.out.println(p);
            
        }
    }
    
    public Pet addPetD(String idDueño,String nameDueño){
        System.out.println("Digite: un id de cuatro caracteres, nombre, color de pelo, raza");
        String w = leer.next();
        for (Pet p:listaPets) {
            if(w.equals(p.getId())){
                System.out.println("el id ya existe, porfavor digite uno diferente");
                w=leer.next();
            }
        }
        String x = leer.next();
        String y = leer.next();
        String z = leer.next();
        Dog p = new Dog(w,x,y,z,idDueño,nameDueño);
        listaPets.add(p);
        return p;
    }
    
    public Pet addPetC(String idDueño,String nameDueño){
        System.out.println("Digite: un id de cuatro caracteres, nombre, color de pelo y si es cazador");
        String w = leer.next();
        for (Pet p:listaPets) {
            if(w.equals(p.getId())){
                System.out.println("el id ya existe, porfavor digite uno diferente");
                w=leer.next();
            }
        }
        String x = leer.next();
        String y= leer.next();
        boolean z = leer.nextBoolean();
        Cat p = new Cat(w,x,y,z,idDueño,nameDueño);
        listaPets.add(p);
        return p;
    }
    
    public Pet addPetH(String idDueño,String nameDueño){
        System.out.println("Digite: un id de cuatro caracteres, nombre, color de pelo y el peso");
        String w = leer.next();
        for (Pet p:listaPets) {
            if(w.equals(p.getId())){
                System.out.println("el id ya existe, porfavor digite uno diferente");
                w=leer.next();
            }
        }
        String x = leer.next();
        String y = leer.next();
        double z = leer.nextDouble();
        Hamster p = new Hamster(w,x,y,z,idDueño,nameDueño);
        listaPets.add(p);
        return p;
    }
}
