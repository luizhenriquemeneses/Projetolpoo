package Agencia;

public class Home {
    
    public static void main(String[] args) {
        
        String Nome = "Luiz";
        System.out.println(Nome);
        
        Funcionario vendedor = new Funcionario (1, "Joao", 0, 2, "Masculino", "brasil" , "brasilia", "df", 6);
    
        System.out.println(vendedor.getNome());
        System.out.println(vendedor.getSexo());
        
        Cliente comprador = new Cliente ("Luiz", 1, 0, "Masculino", "Colonia agricola samambaia", "Brasilia", "DF", 3);
        
        System.out.println(comprador.getNome());
    }
    
}
