
package prueba;


public class Cat extends Pet{
    private boolean isHunter;
    public Cat(boolean isHunter, String id, String name, String haircolor) {
        super(id, name, haircolor);
        this.isHunter = isHunter;
        setType("Gato");
    }

    public boolean isIsHunter() {
        return isHunter;
    }

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }

  
    
    @Override
    String sound(){
    return "miau ";}
    
}
