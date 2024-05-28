package fabrica;

import impressao.Deskjet;
import impressao.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
        impressora.imprimir();
    }
}
