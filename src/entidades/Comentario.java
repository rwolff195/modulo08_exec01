package entidades;

public class Comentario {
	
	private String  texto;
	
	// Contrutores
	public Comentario() {
	}

	public Comentario(String texto) {
		this.texto = texto;
	}

	// Getters e Setters
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}
