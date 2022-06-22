package questao1;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		String dataCriada = JOptionPane.showInputDialog("Insira aqui a Data  de Criação: ");
		String nomeUser= JOptionPane.showInputDialog(" Insira aqui o Nome de usuario");
		String dataNasci = JOptionPane.showInputDialog("Insira aqui a sua Data de Nascimento ");
		String password = JOptionPane.showInputDialog(" Insira aqui a sua Senha ");
		
		RedeSocial pagina = new RedeSocial(dataCriada, nomeUser, dataNasci, password);
		
		String datePublication= JOptionPane.showInputDialog(" A Data Publicao é ");
		String textoPublications = JOptionPane.showInputDialog(" O texto da Publicação é ");
		String linkMidia = JOptionPane.showInputDialog(" O Link da Midia é ");
		
		Publicacao primeiraPubli = new Publicacao(datePublication, textoPublications, linkMidia);
		pagina.inserePublicacao(primeiraPubli);
		
		datePublication= JOptionPane.showInputDialog("A Data da segunda Publicacao é ");
		textoPublications = JOptionPane.showInputDialog("O texto desta Publicacao é  ");
		linkMidia = JOptionPane.showInputDialog(" O Link da Midia ");
		
		Publicacao segundaPubli = new Publicacao(datePublication, textoPublications, linkMidia);
		pagina.inserePublicacao(segundaPubli);
		
		pagina.imprimePublicacoes();
		
		
	}

		
	}


