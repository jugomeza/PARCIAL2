
package prueba;

public class Hamster extends Pet {
    private double weight;

    public Hamster(String id, String name, String haircolor,double weight) {
        super(id, name, haircolor);
        this.weight = weight;
        this.type = "Hamster";
        this.fact = String.valueOf(weight);
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

     @Override
    public String toString() {
        return "type: " + type + ", id: " + id + ", name: " + name + ", haircolor: " + haircolor + ", weight: " + weight;
    }
    
}
