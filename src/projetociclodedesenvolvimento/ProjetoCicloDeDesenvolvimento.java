package projetociclodedesenvolvimento;

import javax.swing.JOptionPane;

public class ProjetoCicloDeDesenvolvimento {
    public static void main(String[] args) {
       
        TelaCadastro formularioCadastro = new TelaCadastro();
        Pessoa cliente = new Pessoa(formularioCadastro.nome, 
                formularioCadastro.email, "12345", formularioCadastro.cpf, "Masculino", 
                formularioCadastro.endereco, formularioCadastro.cidade, "SP");
        
        
        
    }   
}//final do public class
