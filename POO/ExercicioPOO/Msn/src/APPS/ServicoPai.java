package APPS;

public abstract class ServicoPai {
 
    public abstract void enviarMensagem();
    public abstract void receberMensagem();



protected void validarConectadoInternet(){
    System.out.println("Validando conexão com a internet");
}


 protected void salvarHistorico(){
    System.out.println("Salvando o histórico da conversa");
     }
}
 
 
 
 
 
 
    // public void enviarMensagem(){
        
    //     validarConectadoInternet();
    //     System.out.println("Enviando mensagem");
    //     salvarHistorico();
    // }

    // public void receberMensagem (){
    //     System.out.println("Recebendo mensagem");
    //     salvarHistorico();
    // }

    // private void validarConectadoInternet() {
    //     System.out.println("Validando conexão com a internet");
    // }

    // private void salvarHistorico(){
    //     System.out.println("Salvando o histórico da conversa");
    // }

