
package Agencia;

public class Funcionario extends Pessoa {
    private boolean PIS;

    public Funcionario(int Id,String Nome, int CPF, int Idade, String Sexo, String Endereco, String Pais, String Estado, int Telefone) {
        super(Nome, CPF, Idade, Sexo, Endereco, Pais, Estado, Telefone);
        this.PIS = PIS;
    }

    public Boolean getPIS() {
        return PIS;
    }

    public void setPIS(Boolean PIS) {
        this.PIS = PIS;
    }
    
    
}
