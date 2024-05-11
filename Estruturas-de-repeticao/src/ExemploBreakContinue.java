public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 5) break;
            System.out.println(i); // exemplo para quando chega na condição
        }

        for(int a = 0; a < 10; a++) {
            if(a == 5) continue;
            System.out.println(a); // exemplo pula a condição
        }

    }
}
