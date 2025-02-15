package Lanchonete.atendimento;

public class Atentente {
    public void servindoMesa(){
        pagarLancheCozinha();
        System.out.println("Servindo mesa");
    }
    private void pagarLancheCozinha(){
        System.out.println("Pegando o lanche na cozinha");
    }
    public void receberPagamento() {
        System.out.println("Recebendo pagamento");
    } 
   void trocargas(){
        System.out.println("Atendente trocando gás");
    }
    public void pegarPedidoBalcao() {
        System.out.println("Pegando o pedido no balcão");
    }





}


