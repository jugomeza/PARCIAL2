package prueba;

import java.io.File;
import java.util.ArrayList;


public class Starter {

    ArrayList<Person> listaPersonas = new ArrayList<>();

    public void readPets() { 
        GestionArchivos.leerArchivo();
        
        
    }

    public void manageVer(Vet v, String action) {
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\INTEL\\Documents\\NetBeansProjects\\Parcial2");
        GestionArchivos.leerArchivo();
        
        

    }
}
