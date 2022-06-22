package questao1;


public class Publicacao {
	
	private String datePublications;
	private String textoPublication;
	private String linkMidia;
	
	public static double contadorPublicacao;

	public Publicacao(String datePublications, String textoPublication, String linkMidia) {
		this.datePublications = datePublications;
		this.textoPublication = textoPublication;
		this.linkMidia = linkMidia;
		int contPublicacao = 0;
		contPublicacao++;
		
	}

	public String getTextoPublication() {
		return textoPublication;
	}

	public void setTextoPublicacao(String textoPublication) {
		this.textoPublication = textoPublication;
	}

	public String getLinkMidia() {
		return linkMidia;
	}

	public void setLinkMidia(String linkMidia) {
		this.linkMidia = linkMidia;
	}

	public String getDatePublications() {
		return datePublications;
	}

	public static double getContadorPublicacao() {
		return contadorPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.datePublications = datePublications;
	}

	public static void setContadorPublicacao(double contadorPublicacao) {
		Publicacao.contadorPublicacao = contadorPublicacao;
	}
				

}
