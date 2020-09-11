package personnages;

import java.util.List;

import personnages.stats.Arme;
import personnages.stats.Attribut;
import personnages.stats.Competence;
import personnages.stats.Familier;

public class Personnage
{
	private String nom;
	private List<Attribut> attributs;
	private List<Competence> competences;
	private List<Arme> armes;
	private List<Familier> familiers;
	
	
	public Personnage(String nom)
	{
		boolean valide = validerNom(nom);

		if (valide)
		{
			this.nom = nom;
		}
	}

	private boolean validerNom(String nom)
	{
		return nom.length() > 0 && nom.length() < 20;
	}
}
