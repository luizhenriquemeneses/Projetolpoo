
package Agencia;

public class Veiculo {
protected String Cor;
protected String Placa;
protected String Ano;
protected String Chassi;
protected String Marca;
protected String Modelo;
protected float Valor;

    public Veiculo(String Cor, String Placa, String Ano, String Chassi, String Marca, String Modelo, float Valor) {
        this.Cor = Cor;
        this.Placa = Placa;
        this.Ano = Ano;
        this.Chassi = Chassi;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Valor = Valor;
    }


    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String Chassi) {
        this.Chassi = Chassi;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

        
}
