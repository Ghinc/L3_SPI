package pack_3;
import java.util.ArrayList;

public class Secretaire extends Employe{
    public static final int  MAX_MANA=1;
    public ArrayList<Manager> mana  = new ArrayList<Manager>();

    /**
     * constructeur de la classe secrétaire
     * @param leNom nom de la secrétaire
     * @param lePrenom prénom
     * @param j jour de naissance
     * @param m moi de naissance
     * @param a années de naissance
     * @param numero de rue
     * @param rue nom de rue
     * @param code_postal son code postal
     * @param ville sa ville
     * @param salaire son salaire
     * @param je son jour d'embauche
     * @param me son mois d'embauche
     * @param ae son année d'embauche
     */
    public Secretaire(String leNom, String lePrenom, int j, int m, int a, int numero, String rue, String code_postal,
                      String ville,
                      float salaire, int je, int me, int ae) {
        super(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville, salaire, je, me, ae);

    }
    /**
     * constructeur de la classe secrétaire. Date d'embauche intialisée à la date du jour où l'objet est créé.
     * @param leNom nom de la secrétaire
     * @param lePrenom prénom
     * @param j jour de naissance
     * @param m moi de naissance
     * @param a années de naissance
     * @param numero de rue
     * @param rue nom de rue
     * @param code_postal son code postal
     * @param ville sa ville
     * @param salaire son salaire
     */
    public Secretaire(String leNom, String lePrenom, int j, int m, int a, int numero, String rue, String code_postal,
                      String ville, float salaire) {
        super(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville, salaire);
    }

    /**
     * Supprime le manager présent à l'index donné dans l'arraylist des manas
     * @param i index du manager à supprimer
     */

    public void supmana(int i){
        this.mana.remove(i);
    }

    /**
     * Affiche la liste des managers de la secrétaire
     */

    public void lesmana(){
        for(int i=0; i<mana.size();i++){
            System.out.println(mana.get(i));
        }
        System.out.println("La fonction a été exécutée");
    }

    /**
     * Ajoute un manager aux managers gérés par la secrétaire
     * @param m manager à ajouter
     */
    public void addMana(Manager m){
        if(this.mana.size()<=MAX_MANA) {
            this.mana.add(m);
        }else{
            System.out.println("Cette secrétaire a déjà assez de managers à gérer ! ");
        }
    }


}
