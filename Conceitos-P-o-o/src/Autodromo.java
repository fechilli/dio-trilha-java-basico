public class Autodromo{
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("55589");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.ligar();
        z400.setChassi("566999");
    }


}