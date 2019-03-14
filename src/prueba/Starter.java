package prueba;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Starter {

    ArrayList<Person> listaPersonas = new ArrayList<>();

    public void readPets(Vet v, File file) {
        GestionArchivos.leerArchivo(v, file);
    }

    public void registrar(ArrayList lista) {
        GestionArchivos.crearArchivo(lista);

    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Starter starter = new Starter();
        File file = new File("almacen.txt");
        Vet v = new Vet();
        starter.readPets(v, file);

        boolean a = false;
        int b;

        while (a == false) {
            System.out.println("Bienvenido al administrador de la veterinaria"
                    + " \n Usted desea:\n 1)Remover una mascota de la veterinaria"
                    + "\n 2)Listar las mascotas segun su tipo"
                    + "\n 3)Finalizar y registrar la informacion actual");
            b = leer.nextInt();
            switch (b) {
                case 1:
                    System.out.println("ingrese el id de la mascota a remover");
                    String c = leer.next();
                    v.removePet(c);
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
                    starter.registrar(v.listaPets);
                    a = true;
                    break;
                default:
                    System.out.println("no es una opcion valida");

            }

        }
    }
}

