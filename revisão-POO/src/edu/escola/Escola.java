package edu.escola;

public class Escola {
    public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
        aluno1.setNome("Felipe");
        aluno1.setIdade(25);
		
		System.out.println("O aluno " + aluno1.getNome() + " tem " + aluno1.getIdade() + " anos ");
		//RESULTADO NO CONSOLE
		//O aluno Felipe tem 8 anos 		
	}
}

