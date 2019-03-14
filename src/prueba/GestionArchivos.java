package prueba;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionArchivos {

    public static void crearArchivo(ArrayList<Pet> lista) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter("almacen.txt");
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (Pet p : lista) {
                switch (p.getType()) {
                    case "Cat":
                        bfwriter.write(p.getType()+", "+ p.getId() + ", " + p.getName() + ", " + p.getHaircolor() + ", " + String.valueOf(p.getFact())+"\n");
                        break;
                    case "Dog":
                        bfwriter.write(p.getType()+", "+ p.getId() + ", " + p.getName() + ", " + p.getHaircolor() + ", " + String.valueOf(p.getFact())+"\n");
                        break;
                    
                    case "Hamster":
                       bfwriter.write(p.getType()+", "+ p.getId() + ", " + p.getName() + ", " + p.getHaircolor() + ", " + String.valueOf(p.getFact())+"\n");
                        break;
                    default:
                        break;
                }
                
            }
            bfwriter.close();
            System.out.println("Archivo creado ok");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static ArrayList leerArchivo(Vet v,File f) {
        Scanner scanner;
        try {
            scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter(", ");
                switch (delimitar.next()) {
                    case "Cat":
                        Cat a = new Cat(delimitar.next(), delimitar.next(), delimitar.next(), Boolean.parseBoolean(delimitar.next()));
                        v.listaPets.add(a);
                        break;
                    case "Dog":
                        Dog b = new Dog(delimitar.next(), delimitar.next(), delimitar.next(), delimitar.next());
                        v.listaPets.add(b);
                        break;
                    
                    case "Hamster":
                        Hamster c = new Hamster(delimitar.next(), delimitar.next(), delimitar.next(), Double.parseDouble(delimitar.next()));
                        v.listaPets.add(c);
                        break;
                    default:
                        break;
                }

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return v.listaPets;
    }

    public static void aniadirArchivo(ArrayList<Pet> lista) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter("almacen.txt", true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (Pet mascota : lista) {
                bfwriter.write("Codigo: " + mascota.getId() + ", nombre: " + mascota.getName() + ", color de pelo: " + mascota.getHaircolor() + "\n");
            }
            bfwriter.close();
            System.out.println("Archivo modificado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
