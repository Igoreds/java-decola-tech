
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligado);
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);

        smartTv.ligar();
       
        
        smartTv.desligar();
        

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();


        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        smartTv.mudarCanal(13);
      

    }
    

}

