package models;

public class Veiculo {
    private double velocidadeAtual; // velocidade em que o carro está
    private double direcaoAtual; // armazena a direção em graus que o carro seguirá
    private String nomeDono;  //armazena o nome do carro

    private static long idNextCarro = 1; // número de id que ficará armazenado a classe que será único para cada objeto criado

    private long idCarro; // id do carro que irá receber do idNextCarro

    //Constructor vazio que incrementa armazena o próximo id do carro
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

    //Método que printa todos dados do carro inserido, estático pq será utilizado somente pela classe Veiculo
    public static void listAllData(Veiculo printVeiculo){
        System.out.println("Id do veiculo: " + printVeiculo.idCarro
        + "\nNome do dono: " + printVeiculo.nomeDono);
    }

    public void setName(String name) {this.nomeDono = name;}
    public String getNomeDono() {return nomeDono;}
    public long getIdCarro() {return idCarro;}
    public void setVelocidadeAtual(double velocidadeAtual) {this.velocidadeAtual = velocidadeAtual;}
    public void stopCar(){this.velocidadeAtual = 0;}
}
