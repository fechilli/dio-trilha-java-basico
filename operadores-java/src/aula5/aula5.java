import javax.lang.model.util.ElementScanner6;

//package aula5;


public class aula5 {
    public static void main(String[] args) {
    
    
        // == simbolo de igaldade
        // != compara se são diferentes
        //> maior
        //< menor
    
        int numero1 = 1;
        int numero2 = 2; 
    
        boolean simNao = numero1 == numero2;

        if (simNao == false)
            return simNao =   "Falso"
        else
            return simNao = "Verdadeiro"; 
        System.out.println("Numero 1 é diferente do numeor 2? " + simNao);
    }
}
