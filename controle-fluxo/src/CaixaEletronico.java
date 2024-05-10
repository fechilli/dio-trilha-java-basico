public class CaixaEletronico{

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        System.out.println("O saldo atual e de: R$"+ saldo); // condição simples onde so temos uma condição

    }
}