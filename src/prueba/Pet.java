
package prueba;

public abstract class Pet {
    protected String id;
    protected String name;
    protected String haircolor;
    protected String type;
     protected String fact;
     protected String idDueño; 
     protected String nameDueño;
    protected Pet(){
    }

    public Pet(String id, String name, String haircolor, String idDueño, String nameDueño) {
        this.id = id;
        this.name = name;
        this.haircolor = haircolor;
        this.type = " ";
        this.idDueño = idDueño;
        this.nameDueño = nameDueño;
   
        
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

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getIdDueño() {
        return idDueño;
    }

    public void setIdDueño(String idDueño) {
        this.idDueño = idDueño;
    }

    public String getNameDueño() {
        return nameDueño;
    }

    public void setNameDueño(String nameDueño) {
        this.nameDueño = nameDueño;
    }
    
    
    
    abstract String sound();

   
    
    
}
