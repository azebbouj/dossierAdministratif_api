package fr.norsys.sinaf.Dossier.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor 
public class Demande {

	private int idDemande;
	private String motif;
	private Date dateDemande;
	
}
