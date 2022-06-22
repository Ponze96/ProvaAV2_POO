package questao2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		int idAluno = Integer.parseInt(JOptionPane.showInputDialog(" Insira aqui seu Id: "));
		String nome = JOptionPane.showInputDialog(" Insira aqui seu nome: ");
		int ano = Integer.parseInt(JOptionPane.showInputDialog(" Insira aqui Ano: "));
		
		alunoEnem AlunoEnem = new alunoEnem(idAluno, nome, ano);
		
		
		
		ArrayList<provaEnem>provas = new ArrayList<> ();
		
		double resultadoFinal=0;
		for(int j=0; j<=5; j++) {
			int idProva = Integer.parseInt(JOptionPane.showInputDialog("O ID da Prova sera: "));
			String titulo = JOptionPane.showInputDialog("O titulo sera: ");
			int nota = Integer.parseInt(JOptionPane.showInputDialog(" A nota sera: "));
			
			provaEnem prova = new provaEnem (idProva, titulo, nota);
			provas.add(prova);
			resultadoFinal += prova.getNota();
		}
		
	
		JOptionPane.showMessageDialog(null, " O resultado da sua nota Nota final é: "+ resultadoFinal);
		
		
	}
}