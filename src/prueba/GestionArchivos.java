
package prueba;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionArchivos {

   /* public static void crearArchivo(ArrayList lista) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter("C:\\Users\\INTEL\\Documents\\NetBeansProjects\\Parcial2");
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (Pet mascota : lista) {
                bfwriter.write(mascota.getId() + ", " + mascota.getName() + ", " + mascota.getHaircolor() + "\n");
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
    }*/

    public static ArrayList leerArchivo() {
        File file = new File("C:\\Users\\INTEL\\Documents\\NetBeansProjects\\Parcial2");
        ArrayList listaMascotas = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter("\\s*,\\s*");
                Pet e = new Dog();
                e.setId(delimitar.next());
                e.setName(delimitar.next());
                e.setHaircolor(delimitar.next());
                listaMascotas.add(e);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listaMascotas;
    }}
	
	/*public static void aniadirArchivo(ArrayList lista) {
		FileWriter flwriter = null;
		try {
			flwriter = new FileWriter("C:\\Users\\INTEL\\Documents\\NetBeansProjects\\Parcial2", true);
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
   */ 

