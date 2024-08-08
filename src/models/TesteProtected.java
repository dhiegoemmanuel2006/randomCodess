package models;

public class TesteProtected {
    protected long idUser;


    public void AddUserId(long idUser) {
        TesteProtected.this.idUser = idUser;
    }

    public void printId(){
        System.out.println(TesteProtected.this.idUser);
    }

}
