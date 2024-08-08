package models;

public class Veiculo {
    public double velocidadeAtual;
    public double direcaoAtual;
    public String nomeDono;

    public static long idNextCarro = 1;

    public long idCarro;

    //Constructor vazio
    public Veiculo() {
    idCarro = idNextCarro++;
    }
    // Constructor que recebe o nome do dono como argumento

    public Veiculo (String nomeDono) {
        this();
        this.nomeDono = nomeDono;
    }

    //Método estático que retorna o maior iD
    public static void moreID(){
        System.out.println(idNextCarro-1);
    }

    public static void listAllData(Veiculo printVeiculo){
        System.out.println("Id do veiculo: " + printVeiculo.idCarro
        + "\nNome do dono: " + printVeiculo.nomeDono);
    }
}
