package multifuncional;
import copia.Copiadora;
import impressao.Impressora;
import scanner.Digitalizadora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    @Override
    public void imprimir() {
       System.out.println("Imprimindo da multuFuncional");
    }

    @Override
    public void Digitalizar() {
        // TODO Auto-generated method stub
        System.out.println("Digitalizando da multuFuncional");
    }

    @Override
    public void copiar() {
        // TODO Auto-generated method stub
        System.out.println("Copiando da multuFuncional");
    }

    }
