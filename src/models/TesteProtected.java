package models;

public class TesteProtected {
    private long idUser; //id do usuário

    //Método para passar o id do usuário
    public void AddUserId(long idUser) {
        TesteProtected.this.idUser = idUser;
    }

    //Método para printar o id do usuário
    public void printId(){
        System.out.println(TesteProtected.this.idUser);
    }

}
