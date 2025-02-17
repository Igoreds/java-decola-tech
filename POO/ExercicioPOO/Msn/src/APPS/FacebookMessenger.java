package APPS;

public class FacebookMessenger extends ServicoPai {
         public void enviarMensagem(){
        
           validarConectadoInternet();
             System.out.println("Enviando mensagem pelo Facebook");
             salvarHistorico();
        }
    
        public void receberMensagem (){
            System.out.println("Recebendo mensagem pelo Facebook");
     
         }
}
