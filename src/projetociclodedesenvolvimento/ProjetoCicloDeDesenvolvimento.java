package projetociclodedesenvolvimento;

import javax.swing.JOptionPane;

public class ProjetoCicloDeDesenvolvimento {
    public static void main(String[] args) {
       
        Pessoa cliente = new Pessoa("João", "404joaohbatista@gmail.com", "12345", "02088284885", "M", "Rua pão", "Abacoros", "Sp");
        
        cliente.setNome(cliente.getNome());
        cliente.setEmail(cliente.getEmail());
        cliente.setSenha(cliente.getSenha());
        cliente.setCpf(cliente.getCpf());
        cliente.setSexo(cliente.getSexo());
        cliente.setEndereco(cliente.getEndereco());
        cliente.setCidade(cliente.getCidade());
        cliente.setEstado(cliente.getEstado());
        
    }   
}//final do public class
