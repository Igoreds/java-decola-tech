package exemplopagotes;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("70661814416", "Igor silva", "Recife");
        System.out.println("O aluno " + marcos.getNome() + " do CPF " + marcos.getCpf() + " e endereço " + marcos.getEndereco());
    
    }
    
    
    
}
