package pack_3d;

public class Sphere extends Forme_3D {
    public float rayon;

    /**
     * Constructeur de la classe spère
     * @param nom nom de la sphère
     * @param rayon rayon de la sphère
     */

    public Sphere(String nom, float rayon) {
        super(nom);
        this.rayon=rayon;
    }

    /**
     * Calcul du volume de la sphère
     * @return le volume de la sphère
     */

    @Override
    public double volume() {
        return(4/3*Math.PI*Math.pow(this.rayon,3));
    }

    /**
     * Calcul de la surface de la sphère
     * @return la suface de la sphère
     */

    @Override
    public double surface() {
        return(4*Math.PI*Math.pow(this.rayon,2));
    }

    /**
     * Redéfinition de la méthode equals
     * @param obj Objet dont on veut savoir s'il est égal au premier objet ou non
     * @return True si les deux objets ont les mêmes caractéristiques (nom exclu), False sinon
     */
    @Override
    public boolean equals(Object obj) {
        return(obj instanceof Sphere && this.surface()== ((Sphere) obj).surface());
    }

    /**
     * Redéfinition de la méthode toString, déjà redéfinie dans la classe mère Forme
     * @return Le nom et la nature du cercle, ses caractéristiques
     */

    @Override
    public String toString() {
        return ("Sphere " + super.toString()+", Rayon : " + this.rayon);
    }


}
