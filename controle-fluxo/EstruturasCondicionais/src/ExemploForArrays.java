public class ExemploForArrays {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "jonas", "Igor", "Mykael", "Roberta"};

        // for (int i = 0; i<alunos.length; i++){
        //     System.out.println("O Aluno do indice i= " + i + " é " + alunos[i]);
        // }
//uma forma mais simples de fazer a mesma coisa:
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
