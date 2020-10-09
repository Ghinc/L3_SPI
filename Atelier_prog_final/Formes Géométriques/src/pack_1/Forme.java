package pack_1;

public abstract class Forme {
    public static int compteur=0;
    protected String nom;

    /**
     * Constructeur de la classe abstraite Forme
     * @param nom : nom de la Forme
     */

    public Forme(String nom){
        compteur++;
        this.nom=nom+"_n° "+compteur;
    }

    /**
     * Méthode abstraite calculant la surface de la Forme
     * @return la surface de la forme
     */
    public abstract double surface();

    /**
     * Redéfinition de la méthode equals
     * @param obj Objet dont on veut savoir s'il est égal au premier objet ou non
     * @return True si les objets sont égaux, False sinon
     */

    public abstract boolean equals(Object obj);

    /**
     * Redéfinition de la méthode ToString
     * @return le nom de la Forme
     */

    public String toString(){
        return(this.nom);
    }

    /**
     *Compare les surfaces de deux Formes
     * @param f2 Forme à laquelle on veut comparer notre fome
     * @return True si notre forme a une plus grande surface que celle passée en paramètre, False sinon
     */

    public boolean biggerSurface(Forme f2){
        return(this.surface()>f2.surface());
    }
}
