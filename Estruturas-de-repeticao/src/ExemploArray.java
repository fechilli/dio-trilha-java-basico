public class ExemploArray {
    public static void main(String[] args) {
        
        String alunos [] = {"Felipe" , "andre", "amanda", "marcos"};
        
        for( int i = 0; i < alunos.length; i++ ){
    
            System.out.println("o aluno no indice " + i + " e " +  alunos[i]);
        }

        String carros [] = {"Gol", "golf", "jeep"};

            for(String carro : carros){
                System.out.println("Carro " + carro);
            }
    }
}
