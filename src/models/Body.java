package models;

public class Body {
    private long idNum;
    private String name;
    private Body orbits;

    public static long nextID = 0;

    //Construtores omissos

    public long getID(){return idNum;}
    public String getName(){return name;}
    public void setID(String newName){
        name = newName;
    }
    public Body getOrbits(){return orbits;}
    public void setOrbits(Body orbitsAround) {
        orbits = orbitsAround;
    }

    public void capture(Body victim) {
        victim.orbits = this;
    }
}
