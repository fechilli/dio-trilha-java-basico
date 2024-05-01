public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV tá ligada? " + smartTv.ligada);
        System.out.println( "Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("------------------------------------------------------------");
        smartTv.ligar();
        System.out.println("novo status > TV ta ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("novo status > TV ta ligada? " + smartTv.ligada);
       
        System.out.println("------------------------------------------------------------");

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("------------------------------------------------------------");


        smartTv.diminuirVolume();
        System.out.println("Volume atual : " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("------------------------------------------------------------");

        smartTv.mudarCanal(5);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(28);
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("------------------------------------------------------------");


        smartTv.aumentaCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentaCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentaCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        
        System.out.println("------------------------------------------------------------");

        smartTv.diminuiCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuiCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuiCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}

