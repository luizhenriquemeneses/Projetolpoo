
package Agencia;

import java.util.Date;

public class Venda {
    private int Id;
    private Funcionario Funcionario;
    private Cliente Cliente;
    private Carro Carro;
    private Date Data;
    private float ValorVenda;

    public Venda(int Id, Funcionario Funcionario, Cliente Cliente, Carro Carro, Date Data, float ValorVenda) {
        this.Id = Id;
        this.Funcionario = Funcionario;
        this.Cliente = Cliente;
        this.Carro = Carro;
        this.Data = Data;
        this.ValorVenda = ValorVenda;
        
        
    }
    
    
}
