package pack_3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.spi.CalendarDataProvider;

public class Employe extends Personne{
    float salaire;
    Calendar date_embauche;

    /**
     * Constructeur de la classe "Employé"
     * @param leNom Le nom de l'employé
     * @param lePrenom le prénom de l'employé
     * @param j son jour de naissance
     * @param m son mois de naissance
     * @param a son année de naissance
     * @param numero son numéro de rue
     * @param rue le nom de sa rue
     * @param code_postal son code postal
     * @param ville sa ville de résidence
     * @param salaire son salaire de base
     * @param je le jour de sa date d'embauche
     * @param me le mois de sa date d'embauche
     * @param ae l'année de sa date d'embauche
     */

    protected Employe(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville, float salaire,
                      int je, int me, int ae){
        super(leNom,lePrenom,j,m,a,numero,rue,code_postal,ville);
        this.salaire=salaire;
        setDateEmbauche(je,me,ae);
    }

    /**
     * Deuxième constructeur de la classe employé. A la différence du premier, il ne prend pas en paramètre la date d'arrivée de l'employé dans l'entreprise.
     * @param leNom le nom de l'employé
     * @param lePrenom le prénom de l'employé
     * @param j son jour de naissance
     * @param m son mois de naissance
     * @param a so année de  naissannce
     * @param numero son numùéro de rue
     * @param rue le nom de sa rue
     * @param code_postal son code postal
     * @param ville sa ville de résidence
     * @param salaire son salaire
     */

    protected Employe(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville, float salaire
                      ){
        super(leNom,lePrenom,j,m,a,numero,rue,code_postal,ville);
        this.salaire=salaire;
        this.date_embauche=Calendar.getInstance();
    }

    /**
     * Fonction permettant de rentrer une date d'embauche valide
     * @param j jour
     * @param m mois
     * @param a années
     */

    public void setDateEmbauche(int j, int m, int a){
        if((j!=0 || m!=0 || a!=0) && (new GregorianCalendar(a,m,j).compareTo(Calendar.getInstance())<0)){
            this.date_embauche = new GregorianCalendar(a, m, j);
        }else{
            this.date_embauche=Calendar.getInstance();
        }
    }

    /**
     * Fonction destinée à créer un employé. Elle appelle le constructeur après avoir fait les vérifications nécessaires.
     * @param leNom Nom de l'employé
     * @param lePrenom son prénom
     * @param j son jour de naissance
     * @param m son mois de naissance
     * @param a son année de naissance
     * @param numero son numéro de rue
     * @param rue le nom de la rue
     * @param code_postal son code postal
     * @param ville sa ville
     * @param salaire son salaire
     * @param je son jour d'embauche
     * @param me son mois d'embauche
     * @param ae son année d'embauche
     * @return l'employé ainsi créé
     */



    public static Employe createEmploye(String leNom,String lePrenom, int j, int m, int a, int numero,
                                        String rue, String code_postal, String ville, float salaire,int je,int me,int ae){
        Calendar date_naissance=new GregorianCalendar(a,m,j);
        Calendar seizan=Calendar.getInstance();
        seizan.roll(Calendar.YEAR,-16);
        Calendar papi=Calendar.getInstance();
        papi.roll(Calendar.YEAR,-65);
        if(date_naissance.compareTo(seizan)<=0 && date_naissance.compareTo(papi)>0){
            return(new Employe(leNom,lePrenom, j, m, a, numero, rue, code_postal, ville, salaire,je,me,ae));
        }else{
            System.err.println("L'employé n'a pas le bon âge !");
            return null;
        }

    }

    /**
     * Fonction utilisée pour créer un employé. Elle ne prend pas la date d'embauche ne paramètres, ce qui suggère que l'employé est embauché
     * à l'instant où l'instance est créée.
     * @param leNom nom de l'employé
     * @param lePrenom son prénom
     * @param j  son jour de naissance
     * @param m son mois de naissance
     * @param a son année de naissance
     * @param numero le  numéro de son adresse
     * @param rue son uméro de rue
     * @param code_postal son code postal
     * @param ville sa ville de naissance
     * @param salaire son salaire
     * @return l'employé ainsi créé
     */

    public static Employe createEmploye(String leNom,String lePrenom, int j, int m, int a, int numero,
                                        String rue, String code_postal, String ville, float salaire){
        Calendar date_naissance=new GregorianCalendar(a,m,j);
        Calendar seizan=Calendar.getInstance();
        seizan.roll(Calendar.YEAR,-16);
        Calendar papi=Calendar.getInstance();
        papi.roll(Calendar.YEAR,-65);
        if(date_naissance.compareTo(seizan)<=0 && date_naissance.compareTo(papi)>0){
            return(new Employe(leNom,lePrenom, j, m, a, numero, rue, code_postal, ville, salaire));
        }else{
            System.err.println("L'employé n'a pas le bon âge !");
            return null;
        }

    }

    /**
     * Fonction augmentant le salaire de l'employé d'un pourcentage donné
     * @param pourcentage le pourcentage d'augmentation désiré
     */

    public void augmenterSalaire(float pourcentage){
        if(pourcentage>0) {
            this.salaire = this.salaire + ((this.salaire / 100) * pourcentage);
        }else{
            System.err.println("Un pourcentage doit être positif !");
        }
    }

    /**
     * getter
     * @return la date d'embauche de l'employé
     */
    public Calendar getDateEmbauche(){
        return(this.date_embauche);
    }

    /**
     * getter
     * @return le salaire de l'employé
     */
    public float getSalaire(){return(this.salaire);}

    /**
     * Calcule l'ancienneté de l'employé. Chaque année entamée compte.
     * @return l'ancienneté de l'employe
     */
    public int caclculAnnuite() {
        Calendar aujd = Calendar.getInstance();
        int year = aujd.getWeekYear();
        int month = aujd.get(Calendar.MONTH);
        int day = aujd.get(Calendar.DAY_OF_MONTH);
        return(aujd.get(Calendar.YEAR)-this.getDateEmbauche().get(Calendar.YEAR)+1);
    }

}
