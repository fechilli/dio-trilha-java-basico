import java.text.NumberFormat;
import java.

public class ExemploDeExcecao {
    public static void main(String[] args) {
        Number valor  ;

        try{

            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        }catch(parseException e){
            e.printStackTrace();
        }

    }
}
