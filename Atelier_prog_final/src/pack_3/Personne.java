package pack_3;

import java.util.*;

import pack_3_2.Adresse;
import pack_3_2.Adresse.*;


public class Personne{
	private static int compteur=0;
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private final GregorianCalendar dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
		compteur++;
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'ann�e de naissance
	 * @param numero le n� de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
	}

	/**
	 *
	 * @return le nombre de Personnes créées
	 */

	public static int getnombre(){
		return compteur;
	}

	/**
	 * Fonction dit quelle personne est la plus âgée
	 * @param gen une autre instance de Personne
	 * @return True si la personne passée en paramètre est plus jeune, faux sinon
	 */

	public boolean plusAgeQue(Personne gen){
		return(this.getDateNaissance().compareTo(gen.getDateNaissance())<0);
	}

	/**
	 * Compare l'âge de deux personnes et détermine qui est la plus âgée
	 * @param gen1 Première personne
	 * @param gen2 Deuxième perosonne
	 * @return True si la première personne est plus âgée, faux sinon
	 */

	public static boolean plusage(Personne gen1, Personne gen2){
		return(gen1.getDateNaissance().compareTo(gen2.getDateNaissance())<0);
	}

	/**
	 * Redéfinition de equals
	 * @param obj Objet passé en paramètres
	 * @return
	 */

	public boolean equals(Object obj){

		return(obj instanceof Personne && this.getNom().equalsIgnoreCase (((Personne) obj).getNom()) &&
				this.getDateNaissance().compareTo(((Personne) obj).getDateNaissance())==0
		&& this.getPrenom().equalsIgnoreCase(((Personne) obj).getPrenom()));
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le pr�nom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * param retourne l'adresse
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"Pr�nom : "+prenom+"\n"+
		"N�(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}
}

    
   
   