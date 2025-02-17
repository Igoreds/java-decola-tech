package APPS;

public class MSNMessenger  extends ServicoPai{
    public void enviarMensagem(){
        
            validarConectadoInternet();
             System.out.println("Enviando mensagem pelo MSN");
             salvarHistorico();
        }
    
         public void receberMensagem (){
             System.out.println("Recebendo mensagem pelo MSN");
    
        }

}
