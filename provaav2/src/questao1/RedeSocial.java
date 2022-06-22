package questao1;

import java.util.ArrayList;

public class RedeSocial {
	private String dateCriacao;
	private String nameUsuario;
	private String dateNascimeno;
	private String senha;
	
	public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimeno, String senha) {
		super();
		this.dateCriacao = dataCriacao;
		this.nameUsuario = nomeUsuario;
		this.dateNascimeno = dataNascimeno;
		this.senha = senha;
	}
	
	ArrayList<Publicacao> publications = new ArrayList<> ();
	
	public void inserePublicacao(Publicacao publi) {
		publications.add(publi);
	}
	
	public void imprimePublicacoes() {
		System.out.println(" Somar " + Publicacao.getContadorPublicacao());
			
		for(int j = 0; j<publications.size(); j++) {
			System.out.println("TEXT : " + publications.get(j).getTextoPublication() +"   " + " DATE: "+publications.get(j).getDatePublications() + "   " + " URL: " + publications.get(j).getLinkMidia());
				
			}
		
	}

}
