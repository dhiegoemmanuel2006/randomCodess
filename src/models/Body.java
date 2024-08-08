package models;

public class Body {
    public long idNum;
    public String name;
    public Body orbits;

    public static long nextID = 0;

    //Construtor básico que já recebe um novo id e é "vazio"
    public Body() {
        idNum = nextID++;
    }
    //Constructor que chama o construtor 1 e ocorre quando já sabemos o que orbita e seu nome

    public Body(String name, Body orbits) {
        this();
        this.name = name;
        this.orbits = orbits;
    }

}
