import java.util.ArrayList;
import java.util.Random;

public class DeMemoire extends De {

    private static int compteur;
    private int precedent;

    public DeMemoire(int nbfaces, String nom){
        super(nbfaces,nom);
        precedent=0;
    }

    public int lancer() {
        int sortie=super.lancer();
        compteur++;

         if(compteur!=0) {
            while (sortie == precedent) {
                sortie = super.lancer();
            }
        }

         precedent=sortie;
         return(sortie);
    }

    }

