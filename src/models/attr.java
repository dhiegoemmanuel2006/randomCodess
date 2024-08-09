package models;

public class attr {
    private final String name;
    private Object value = null;

    public attr(String name, Object value) {this.name = name;this.value = value;} // constructor quando sabemos o value e o nome
    public attr(String name) {this.name = name;} //constructor quando só sabemos o nome

    public String getName() {return this.name;}
    public Object getValue() {return this.value;}

    public Object setValue (Object newValue) {
        Object oldValue = this.value;
        this.value = newValue;
        return oldValue;
    }

    public String toString() {
        return name + ": " + value;
    }
}
