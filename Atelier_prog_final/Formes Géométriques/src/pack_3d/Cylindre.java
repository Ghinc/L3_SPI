package pack_3d;

public class Cylindre extends Forme_3D {
    public float rayon;
    public float hauteur;

    /**
     * Constructeur de la classe Cylindre
     * @param nom nom que l'on va donner au cylindre
     * @param rayon rayon du cylindre
     * @param hauteur hauteur du cylindre
     */

    public Cylindre(String nom,float rayon,float hauteur) {
        super(nom);
        this.rayon=rayon;
        this.hauteur=hauteur;
    }

    /**
     * Calcule le volume du cylindre
     * @return le volume du cylindre
     */

    @Override
    public double volume() { return(hauteur*this.rayon*this.rayon*Math.PI);
    }

    /**
     * Calcule la surface du cylindre
     * @return la surface du cylindre
     */

    @Override
    public double surface() { return(2*Math.PI*this.hauteur);
    }

    /**
     * Teste l'égalité entre deux cylindres (nom exclu)
     * @param obj Objet dont on veut savoir s'il est égal au premier objet ou non
     * @return True si les deux objets sont égaux, False sinon
     */

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Cylindre && this.volume() == ((Cylindre) obj).volume());
    }

    /**
     * Redéfinition de la méthode toString redéfinie dans la classe Forme
     * @return le nom du cylindre et ses caractéristiques
     */

    @Override
    public String toString() {
        return ("Cylindre " + super.toString()+", Rayon : " + this.rayon+ ", Hauteur : "+ this.hauteur);
    }
}
