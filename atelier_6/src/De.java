import java.util.*;


public class De {

    private int nbfaces;
    private String nom;
    private static Random r = new Random();
    private static int compteur;
    private final static int MAX_FACES = 3;
    private final static int MIN_FACES = 120;


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

    public De(String nom){
        this(6,nom);
    }

    public De (){
        this(6,"");
    }

    public int getNbfaces(){
        return(this.nbfaces);
    }

    public String getNom(){
        return(this.nom);
    }

    public int lancer(){
        int nbAleatoire= r.nextInt(this.nbfaces)+1;
        return(nbAleatoire);
    }

    public String toString(){
        return(this.nom);
    }

    public boolean equals(De de){
        return(this.nom==de.nom && this.nbfaces==de.nbfaces);
    }

    public int lancer(int nblancers){
        int[] tablo=new int[nblancers];
        int max=1;
        for(int i=0; i< nblancers; i++) {
            tablo[i] = lancer();
            System.out.println("lancer n° " + (i+1) + " : " + tablo[i] );
            if (tablo[i]>max){
                max=tablo[i];
            }
        }
        return(max);
    }


}
