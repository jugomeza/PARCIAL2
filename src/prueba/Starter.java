package prueba;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Starter {

    ArrayList<Person> listaPersonas = new ArrayList<>();

    public void readPets(Vet v, Starter s, File file) {
        GestionArchivos.leerArchivo(v,s,file);
    }

    public void registrar(ArrayList lista) {
        GestionArchivos.escribirArchivo(lista);

    }
    public void showPetByOwner(String idDueño){
        for (Person pe :listaPersonas) {
            if(idDueño.equals(pe.getId())){
                for (Pet p : pe.listaPets) {
                    System.out.println(p);
                }
                
            }
            
        }
        
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Starter starter = new Starter();
        File file = new File("almacen.txt");
        Vet v = new Vet();
        starter.readPets(v,starter,file);

        boolean a = false;
        int b;

        while (a == false) {
            System.out.println("Bienvenido al administrador de la veterinaria"
                    + " \n Usted desea:\n 1)Remover una mascota de la veterinaria"
                    + "\n 2)Listar las mascotas segun su tipo"
                    + "\n 3)Finalizar, listar las mascotas y registrar la informacion actual"
                    + "\n 4)Adscribirse como usuario"
                    + "\n 5)Agregar una mascota"
                    + "\n 6)Listar las mascotas segun dueño");
            b = leer.nextInt();
            switch (b) {
                case 1:
                    System.out.println("ingrese el id de la mascota a remover");
                    String c = leer.next();
                    v.removePet(c);
                    for (Person pe : starter.listaPersonas) {
                        pe.removePet(c);
                    }
                    break;
                case 2:
                    System.out.println("ingrese el tipo de mascotas \n 1)Dog \n 2)Cat \n 3)Hamster");
                    int d = leer.nextInt();
                    switch (d) {
                        case 1:
                            v.showPetsByType("Dog");
                            break;
                        case 2:
                            v.showPetsByType("Cat");
                            break;
                        case 3:
                            v.showPetsByType("Hamster");
                            break;
                        default:
                            System.out.println("no es una opcion valida");

                    }
                    break;
                case 3:
                    System.out.println("Tamaño de lista enviada " +v.listaPets.size());
                    starter.registrar(v.listaPets);
                    v.showPets();
                    a = true;
                    break;
                case 4:
                    System.out.println("Digite: Su nombre, un id de 4 caracteres para reconocerlo estos 2 separados con enters");
                    String x = leer.next();
                    String y = leer.next();
                    Person p = new Person(x, y);
                    starter.listaPersonas.add(p);
                    break;
                case 5:
                    boolean existeId = false;
                    String idPerson;
                    do{
                        System.out.println("Digite su id");
                        idPerson = leer.next();

                        for (Person pe : starter.listaPersonas) {
                            if(idPerson.equals(pe.getId())){
                                existeId = true;
                            }
                            
                        }
                        if(!existeId){
                            System.out.println("no se hallo el usuario");
                        }
                    }while(!existeId);
                    System.out.println("Digite el tipo de mascotas \n 1)Dog \n 2)Cat \n 3)Hamster");
                    int op = leer.nextInt();
                    switch (op) {
                        case 1:
                            for (Person pe : starter.listaPersonas) {
                                if(idPerson.equals(pe.getId())){
                                pe.listaPets.add(v.addPetD(pe.getId(),pe.getName()));
                                }
                            }
                            break;
                        case 2:
                            
                            for (Person pe : starter.listaPersonas) {
                                if(idPerson.equals(pe.getId())){
                                pe.listaPets.add(v.addPetC(pe.getId(),pe.getName()));
                                }
                            }
                            break;
                        case 3:
                        
                            for (Person pe : starter.listaPersonas) {
                                if(idPerson.equals(pe.getId())){
                                pe.listaPets.add(v.addPetC(pe.getId(),pe.getName()));
                                }
                            }
                        
                            break;
                        default:
                            System.out.println("no es una opcion valida");
                    }
                    

                case 6:
                    boolean existsId = false;
                    String idPe;
                    do{
                        System.out.println("Digite su id");
                        idPe = leer.next();

                        for (Person pe : starter.listaPersonas) {
                            if(idPe.equals(pe.getId())){
                                existsId = true;
                            }
                            
                        }
                        if(!existsId){
                            System.out.println("no se hallo el usuario");
                        }
                    }while(!existsId);
                    starter.showPetByOwner(idPe);
                            break;
                default: System.out.println("no es una opcion valida");
                    
                
                
            }
        }
    }

}
