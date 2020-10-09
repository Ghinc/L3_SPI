package pack_3;

public class Manager extends Employe {

    private Secretaire secretaire;

    /**
     * Constructeur de la classe manager
     * @param leNom son nom
     * @param lePrenom son prénom
     * @param j son jour de naissance
     * @param m son mois de naissance
     * @param a son année de naissance
     * @param numero le numéro de son adresse
     * @param rue sa rue
     * @param code_postal son code postal
     * @param ville sa ville
     * @param salaire son salaire
     * @param secretaire son/sa secrétaire
     * @param je son jour d'embauche
     * @param me son mois d'embauche
     * @param ae son année d'embauche
     */

    public Manager(String leNom, String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville, float salaire,
                   Secretaire secretaire,int je, int me, int ae) {
        super(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville, salaire, je, me, ae);
        int annee = this.caclculAnnuite();
        this.setDateEmbauche(je,me,ae);
        for (int i = 0; i <= annee; i++) {
            this.augmenterSalaire((float) 0.5);
        }
       this.setSecretaire(secretaire);
        secretaire.addMana(this);
    }

    /**
     * Constructeur de manager. Celui-ci ne prend pas de date d'embauche ne paramètres; elle est donc initialisée au moment auqule l'objet est créée.
     * @param leNom son nom
     * @param lePrenom son prénom
     * @param j son jour de naissance
     * @param m son mois de naissance
     * @param a son année de naissance
     * @param numero le numéro de son adresse
     * @param rue le nom de sa rue
     * @param code_postal son code postal
     * @param ville sa ville
     * @param salaire son salaire
     * @param secretaire son/sa secrétaire
     */
    public Manager(String leNom, String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville, float salaire,
                   Secretaire secretaire) {
        this(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville, salaire,secretaire,0,0,0);

    }

    /**
     * Assigne un(e) secrétaire à un manager
     * @param s secrétaire à assigner
     */

    public void setSecretaire(Secretaire s){
        this.secretaire=s;
        s.mana.add(this);
        s.augmenterSalaire((float)0.1);
    }


}
