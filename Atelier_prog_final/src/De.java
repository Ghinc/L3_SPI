import java.util.*;


public class De {

    private int nbfaces;
    private String nom;
    private static Random r = new Random();
    private static int compteur;
    private final static int MAX_FACES = 120;
    private final static int MIN_FACES = 3;


    /**
     * Constructeur de la classe dé
     * @param nbfaces nombre de faces compris entre 3 et 120
     * @param nom nom du dé
     */

    public De(int nbfaces, String nom){ //nom ne bougera jamais
        compteur++;
        if(nom.length()<=0){
            this.nom="Dé n°"+compteur; //nom par défaut
        }else {
            this.nom = nom;
        }
        if(MIN_FACES<=nbfaces && nbfaces<=MAX_FACES) {
            this.nbfaces = nbfaces;
        }else{
            System.err.println("Le nombre de faces n'est pas valide !");
        }
    }

    /**
     * Constructeur quand seul le nom est renseigné. Le nombre de faces est intialisé au nombre de faces par défaut, 6.
     * @param nom nom du dé
     */

    public De(String nom){
        this(6,nom);
    }

    /**
     * Constructeur de dé qui initialise les paramètres à leurs valeurs par défaut : 6 faces, et le nom initialisé à
     * dé n° i (avec i le compteur du nombre de dés)
     */

    public De (){
        this(6,"");
    }

    /**
     * Getteur nombre de faces
     * @return le nombre de faces
     */

    public int getNbfaces(){
        return(this.nbfaces);
    }

    /**
     * Getteur
     * @return le nom du dé
     */

    public String getNom(){
        return(this.nom);
    }

    /**
     * Fonction simulant un lancer du dé
     * @return un nombre aléatoire compris entre 1 et le nombre de faces du dé
     */

    public int lancer(){
        int nbAleatoire= r.nextInt(this.nbfaces)+1;
        return(nbAleatoire);
    }

    /**
     * Redéfinition de la méthode ToString. Définit ce qui apparaît lorsqu'on utilise System.out.println(this)
     * @return le nom du dé
     */

    public String toString(){
        return(this.nom);
    }

    /**
     * Redéfinition de la méthode equals, qui dit si deux objets ont les mmêmes propriétés
     * @param obj objet que l'on souhaite comparer à False
     * @return
     */
    public boolean equals(Object obj){
        return(obj instanceof De  && this.nom==((De) obj).getNom() && this.nbfaces== ((De) obj).getNbfaces());
    }

    public int getNbDes(){
        return (compteur);
    }

    public int lancer(int nblancers){
        int[] tablo=new int[nblancers];
        int max=1;
        for(int i=0; i< nblancers; i++) {
            tablo[i] = lancer();
            if (tablo[i]>max){
                max=tablo[i];
            }
        }
        return(max);
    }


}
