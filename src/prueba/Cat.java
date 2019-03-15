
package prueba;


public class Cat extends Pet{
    private boolean isHunter;
    public Cat(String id, String name, String haircolor,boolean isHunter, String idDueño,String nameDueño) {
        super(id, name, haircolor, idDueño,nameDueño);
        this.isHunter = isHunter;
        this.type="Cat";
        this.fact = String.valueOf(isHunter);
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
    
    @Override
    public String toString() {
        return "type: " + type + ", id: " + id + ", name: " + name + ", haircolor: " + haircolor + ", isHunter: " + isHunter ;
    }
    
}
