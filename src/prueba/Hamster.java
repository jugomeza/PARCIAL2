
package prueba;

public class Hamster extends Pet {
    private double weight;

    public Hamster(double weight, String id, String name, String haircolor) {
        super(id, name, haircolor);
        this.weight = weight;
        setType("Hamster");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    String sound(){
    return " ";
    }
    
    
}
