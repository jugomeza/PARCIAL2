package prueba;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionArchivos {

    public static void escribirArchivo(ArrayList<Pet> lista) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter("almacen.txt");
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (Pet p : lista) {
    
                switch (p.getType()) {
                    case "Cat":
                        bfwriter.write(p.getType()+", "+ p.getId() + ", " + p.getName() + ", " + p.getHaircolor() + ", " + String.valueOf(p.getFact())+", "+p.getIdDueño()+", "+p.getNameDueño()+"\n");
                        break;
                    case "Dog":
                        bfwriter.write(p.getType()+", "+ p.getId() + ", " + p.getName() + ", " + p.getHaircolor() + ", " + String.valueOf(p.getFact())+", "+p.getIdDueño()+", "+p.getNameDueño()+"\n");
                        break;
                    
                    case "Hamster":
                       bfwriter.write(p.getType()+", "+ p.getId() + ", " + p.getName() + ", " + p.getHaircolor() + ", " + String.valueOf(p.getFact())+", "+p.getIdDueño()+", "+p.getNameDueño()+"\n");
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

    public static ArrayList leerArchivo(Vet v,Starter s,File f) {
        Scanner scanner;
        try {
            scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter(", ");
//                System.out.println(delimitar.next());
                String aux = "";
                try{
                   aux = delimitar.next();
                }catch(Exception e){
                    
                }
                
                switch (aux) {
                    case "Cat":
                        Cat c = new Cat(delimitar.next(),delimitar.next(),delimitar.next(),Boolean.valueOf(delimitar.next()),delimitar.next(),delimitar.next());
                       Person p1 = new Person(c.getIdDueño(),c.getNameDueño());
                       s.listaPersonas.add(p1);
                       p1.listaPets.add(c);
                        v.listaPets.add(c);
                        break;
                    case "Dog":
                        Dog b = new Dog(delimitar.next(), delimitar.next(), delimitar.next(), delimitar.next(),delimitar.next(),delimitar.next());
                       Person p2 = new Person(b.getIdDueño(),b.getNameDueño());
                       s.listaPersonas.add(p2);
                       p2.listaPets.add(b);
                        v.listaPets.add(b);
                        break;
                    
                    case "Hamster":
                        Hamster h = new Hamster(delimitar.next(), delimitar.next(), delimitar.next(), Double.parseDouble(delimitar.next()),delimitar.next(),delimitar.next());
                       Person p3 = new Person(h.getIdDueño(),h.getNameDueño());
                       s.listaPersonas.add(p3);
                       p3.listaPets.add(h);
                        v.listaPets.add(h);
                        break;
                    default:
                        break;
                }

            }
            scanner.close();
        } catch (FileNotFoundException e) {
          //  e.printStackTrace();
        }
        return v.listaPets;
    }
}

