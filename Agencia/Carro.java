
package Agencia;
    
public class Carro extends Veiculo{
    private Boolean cavalos;
    private Boolean portas;      

    public Carro(Boolean cavalos, Boolean portas, String Cor, String Placa, String Ano, String Chassi, String Marca, String Modelo, float Valor) {
        super(Cor, Placa, Ano, Chassi, Marca, Modelo, Valor);
        this.cavalos = cavalos;
        this.portas = portas;
    }
    
    public Boolean getCavalos() {
        return cavalos;
    }

    public void setCavalos(Boolean cavalos) {
        this.cavalos = cavalos;
    }

    public Boolean getPortas() {
        return portas;
    }

    public void setPortas(Boolean portas) {
        this.portas = portas;
    }
    
    
}    