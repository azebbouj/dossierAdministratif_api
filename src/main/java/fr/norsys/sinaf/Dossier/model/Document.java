package fr.norsys.sinaf.Dossier.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor 
public class Document {

	private int idPiece;
	private String libelle;
	private TypeDocument typeDocument;
	private Demande demande;
	
}
