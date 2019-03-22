package fr.norsys.sinaf.Dossier.model;

public enum Etat {
	
	EN_COURS {
		@Override
		public String toString() {
			return "En cours";
		}
	},
	TRAITE {
		@Override
		public String toString() {
			return "Traite";
		}
	}

}
