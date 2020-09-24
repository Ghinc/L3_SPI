import java.util.ArrayList;

public class DeFaceAutre extends De {
    private String[] nomface;

    public DeFaceAutre(int nbfaces, String nom, String[] nomface){
        super(nbfaces,nom);
        this.nomface=nomface;

    }

    public String lancement(){ //méthode de lacement de dés renvoyant les messages présents sur les faces
        int res=super.lancer();
        return(nomface[res-1]);
    }
}
