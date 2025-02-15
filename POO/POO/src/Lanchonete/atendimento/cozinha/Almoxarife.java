package Lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos itens");
    }
    private void controlarSainda(){
        System.out.println("Controlando a saida dos itens");
    }
     void entrgarIngredientes(){
        System.out.println("entregando ingredientes");
        controlarSainda();
    }
     void trocargas(){
        System.out.println("Almoxarife trocando o gás");
    }
}
