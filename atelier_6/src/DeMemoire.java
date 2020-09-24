import java.util.ArrayList;
import java.util.Random;

public class DeMemoire extends De {

    public ArrayList<Integer> precedents;
    private static int compteur;

    public DeMemoire(int nbfaces, String nom){
        super(nbfaces,nom);
        precedents=new ArrayList();
        precedents.add(0);
    }

    public int lancer() {
        int res = super.lancer();
        int sortie=res;
        compteur++;

         if(compteur!=0) {
            if (res == precedents.get(compteur - 1)) {
                sortie = super.lancer();
            }
        }
         precedents.add(sortie);
        return(sortie);
    }

    }

