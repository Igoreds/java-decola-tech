public class SmartTv {
    boolean ligado = false;
    int  canal = 1;
    int volume = 25;

    public void ligar() {
        ligado = true;
        System.out.println( "TV Ligada? " + ligado);
    }
    public void desligar() {
        ligado = false;
        System.out.println( "TV Ligada? " + ligado);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void deminiuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Mudando o Canal para: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Mudando o Canal para: " + canal);
    }
    public void mudarCanal(int a){
        canal = a;
        System.out.println("Mudando o Canal para: " + canal);
    }
 

}