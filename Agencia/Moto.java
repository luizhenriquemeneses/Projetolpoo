package Agencia;

public class Moto extends Veiculo{
    private String cilindradras;

    public Moto(String cilindradas, String Cor, String Placa, String Ano, String Chassi, String Marca, String Modelo, float Valor) {
        super(Cor, Placa, Ano, Chassi, Marca, Modelo, Valor);
        this.cilindradras = cilindradas;
    }
    
    
}
