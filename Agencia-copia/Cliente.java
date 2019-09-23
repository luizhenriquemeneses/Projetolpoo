
package Agencia;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Cliente extends Pessoa{
    private String cnh;
    
    public Cliente(String nome, int cpf, int idade) {
       
        super(nome, cpf, idade);
    }

    public Cliente(String cnh, String nome, int cpf, int idade) {
        super(nome, cpf, idade);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    public class Pagar{
        public void formaPagamento(){
        JComboBox jcb = new JComboBox();{
        jcb.addItem("Cartão");
        jcb.addItem("Dinheiro");
        jcb.addItem("Depósito");
        jcb.addItem("Tranferencia");
        }
           JOptionPane.showMessageDialog(null, jcb, "Selecione a forma de pagamento", JOptionPane.QUESTION_MESSAGE);

            JOptionPane.showMessageDialog(null, jcb.getSelectedItem(), "Opção selecionada", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}