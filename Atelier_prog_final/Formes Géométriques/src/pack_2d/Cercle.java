package pack_2d;

public class Cercle extends Forme_2D {
    public float rayon;

    /**
     * Constructeur de la classe Cercle
     * @param nom le nom que l'on donne au cercle
     * @param rayon le rayou du cercle
     */

    public Cercle(String nom, float rayon) {
        super(nom);
        this.rayon=rayon;
    }

    /**
     * Calule le périmètre du cercle
     * @return le périmètre du cercle
     */

    @Override
    public double perimetre() {
        return (2*rayon*Math.PI);
    }

    /**
     * Calcule la surface du cercle
     * @return la surface du cercle
     */

    @Override
    public double surface() {
        return (Math.PI*Math.pow(rayon,2));
    }

    /**
     * Teste l'égalité entre deux cercles (excepté le nom)
     * @param obj Objet dont on veut savoir s'il est égal au premier objet ou non
     * @return True si les deux objets sont égaux, False sinon
     */

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Cercle && this.surface()==((Cercle) obj).surface());
    }

    /**
     * Redéfinition de la méthode toString, déjà redéfinie dans la classe mère Forme
     * @return Le nom et la nature du cercle, ses caractéristiques
     */

    @Override
    public String toString() {
        return ("Cercle " + super.toString()+", Rayon : " + this.rayon);
    }
}
