
package prueba;

public abstract class Pet {
    protected String id;
    protected String name;
    protected String haircolor;
    protected String type;
    protected Pet(){
    }

    public Pet(String id, String name, String haircolor) {
        this.id = id;
        this.name = name;
        this.haircolor = haircolor;
        this.type = " ";
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    abstract String sound();

   
    
    
}
