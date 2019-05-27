package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	//Constantes
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	//Atributos
	private Date moment;
	private String tituloPost;
	private String post;
	private Integer likes;
	
	// Associação
	private List<Comentario> comentarios = new ArrayList<>();
	
	// Contrutores
	public Post() {
	}

	public Post(Date moment, String tituloPost, String post, Integer likes) {
		this.moment = moment;
		this.tituloPost = tituloPost;
		this.post = post;
		this.likes = likes;
	}
	
	// Getters e Setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTituloPost() {
		return tituloPost;
	}

	public void setTituloPost(String tituloPost) {
		this.tituloPost = tituloPost;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	// metodos 
	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removeComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	// toString
	// uso da classe StringBuilder
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(tituloPost + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(post + "\n");
		sb.append("Comentários:\n");
		for (Comentario c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		
		return sb.toString();
	}

}
