public class Carro extends Veiculo {
   

    public void ligar(){
        conferindoCambio();
        conferindoCombustivo();
        System.out.println("carro ligado");

    }
    private void conferindoCombustivo(){
        System.out.println("conferindo Combustivel");

    }
    private void conferindoCambio(){
        System.out.println("cambio p");

    }
}

// aqui encapsulamos os metodos que nao devem ser publicos que são de conferencia e chamamos ele
//no propio metodo que está publico sendo assim nao possibilita ninguem mexer no que deve ser restrito