package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Post;

public class ProgPrincipal {

	public static void main(String[] args) throws ParseException {
		/*
		Instancie manualmente (hard code) os objetos Post e Comentários e mostre-os na tela do terminal.
		*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// Instanciando a classe Comentario
		Comentario c1 = new Comentario("Have a nice trip!");
		Comentario c2 = new Comentario("Wow that's awesome!");
		
		// Instanciando a classe Post
		Post p1 = new Post(
							sdf.parse("21/06/2018 13:05:44"), 
							"Traveling to New Zealand",
							"I'm going to visit this wonderful country!",
							12
							);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Have a nice trip!");
		Comentario c4 = new Comentario("Wow that's awesome!");
		
		Post p2 = new Post(
							sdf.parse("28/07/2018 23:14:19"), 
							"Good night guy",
							"See you tomorrow",
							5
							);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
