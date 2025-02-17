package APPS;

public class TelegramMessenger extends ServicoPai {
    public void enviarMensagem(){
        
         validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
           salvarHistorico();
         }
    
         public void receberMensagem (){
             System.out.println("Recebendo mensagem pelo Telegram");

         }
}
