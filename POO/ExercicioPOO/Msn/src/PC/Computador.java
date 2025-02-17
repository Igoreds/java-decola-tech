package PC;

import APPS.FacebookMessenger;
import APPS.MSNMessenger;
import APPS.ServicoPai;
import APPS.TelegramMessenger;

public class Computador {
    public static void main(String[] args) {
        ServicoPai smi = null;
        /*
         * não se sabe qual app mas qualquer um deverá enviar e receber mensagem
         */
        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        } else if(appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")){
            smi = new TelegramMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
