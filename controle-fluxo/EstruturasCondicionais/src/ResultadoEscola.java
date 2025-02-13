public class ResultadoEscola {
    public static void main(String[] args) {
    // estrutura de condicional composta
    int nota = 5;

    if (nota >= 7 ) {
        System.out.println("Aprovado!");
    } else {
        System.out.println("Reprovado!");
    }

    int nota2 = 5;
// conficional encadeada 
    if (nota2 >= 7) {
        System.out.println("Aprovado");
    } else if (nota2 >= 5 && nota2 < 7) {
        System.out.println("Recuperação");
    } else {
        System.out.println("Reprovado!");
    }
    // condicional ternária 
    int nota3 = 6;
     String resultado = nota3 >=7 ? "Aprovado" : "reprovado";
     System.out.println(resultado);
// exemplo ternário e encadeado 
    int nota4 = 5;
   String resultado1 = nota4 >= 7 ? "aprovado" : nota4 >= 5 && nota4 < 7 ? "Recuperação" : "Reprovado";
   System.out.println(resultado1);
    }
   
        


    }


