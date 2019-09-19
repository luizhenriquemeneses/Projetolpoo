
package Agencia;

public class Cliente extends Pessoa{
    private String Email;
    
    public Cliente(String Nome, int CPF, int Idade, String Sexo, String Endereco, String Pais, String Estado, int Telefone) {
        super(Nome, CPF, Idade, Sexo, Endereco, Pais, Estado, Telefone);
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
