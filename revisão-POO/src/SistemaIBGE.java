

public class SistemaIBGE {
    public static void main(String[] args) {
        for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
            System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
         }
         
         //selecionando um estado a partir das opções disponíveis
         EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;
         
         System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
         System.out.println("A sigla do estado selecionado foi: " + ufSelecionado.getSigla());
         System.out.println("O estado em maiusculo selecionado foi: " + ufSelecionado.getNomeMaiusculo());
         System.out.println("O codigo ibge é " + ufSelecionado.getIbge());
     
    }
}
