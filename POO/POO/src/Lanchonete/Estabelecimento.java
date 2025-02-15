package Lanchonete;

import Lanchonete.area.cliente.Cliente;
import Lanchonete.atendimento.Atentente;
import Lanchonete.atendimento.cozinha.Almoxarife;
import Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();


        // ações que estabelecimento precisa ter ciencia
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        // cozinheiro.pedirIngredientes(null);
    
        Almoxarife almox = new Almoxarife();

        // //ações que não precisam estarem disponiveis para toda a aplicação
        // almox.controlarEntrada();
        // almox.controlarSainda();

        Atentente atentende = new Atentente();
        // atentende.pagarLancheCozinha();
        atentende.pegarPedidoBalcao();
        atentende.receberPagamento();

        Cliente cliente = new Cliente();

        /*Não deveria, mas o estabelecimento ainda não definiu normas de atendimento */
        // cliente.pegarPedidoBalcao();

        // // ação sigilosa, precisa ser privada 
        // cliente.consultarSaldoAplicativo();

        // // ja pensou nos cliente ouvindo que o gas acabou?
        // cozinheiro.pedirParaTrocarGas(atentende);
        // cozinheiro.pedirParaTrocarGas(atentende);
        
    
    }
}
