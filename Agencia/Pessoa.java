package Agencia;

abstract public class Pessoa {
    protected int Id;
    protected String Nome;
    protected int CPF;
    protected int Idade;
    protected String Sexo;
    protected String Endereco;
    protected String Pais;
    protected String Estado;
    protected int Telefone;

    public Pessoa(String Nome, int CPF, int Idade, String Sexo, String Endereco, String Pais, String Estado, int Telefone) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Idade = Idade;
        this.Sexo = Sexo;
        this.Endereco = Endereco;
        this.Pais = Pais;
        this.Estado = Estado;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = Nome;
    }

    public Integer getCPF() {
        return CPF;
    }

    public void setCPF(Integer CPF) {
        this.CPF = CPF;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Integer getTelefone() {
        return Telefone;
    }

    public void setTelefone(Integer Telefone) {
        this.Telefone = Telefone;
    }
    
}
