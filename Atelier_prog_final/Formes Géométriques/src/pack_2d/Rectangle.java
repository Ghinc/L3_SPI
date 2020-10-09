package pack_2d;

public class Rectangle extends Forme_2D {
    private float longueur;
    private float largeur;

    /**
     * Constrcuetur de la classe Rectangle
     * @param nom nom du rectangle
     * @param longueur longueur des côtés du rectangle
     * @param largeur largeur des côtés du  rectangle
     */

    public Rectangle(String nom, float longueur, float largeur) {
        super(nom);
        this.largeur=largeur;
        this.longueur=longueur;
    }

    /**
     * Calule le périmètre du rectangle
     * @return le périmètre du rectangle
     */

    @Override
    public double perimetre() {
        return (2*longueur+2*largeur);
    }

    /**
     * Calule la surface du rectangle
     * @return la surface du rectangle
     */


    @Override
    public double surface() {
        return (longueur*largeur);
    }

    /**
     * Teste l'égalité entre deux rectangles (nom exclu)
     * @param obj Objet dont on veut savoir s'il est égal au premier objet ou non
     * @return True si les deux objets sont égaux, False sinon
     */

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Rectangle && this.surface()==((Rectangle) obj).surface());
    }

    /**
     * Redéfinition de la méthode toString redéfinie dans la classe Forme
     * @return le nom du rectangle et ses caractéristiques
     */

    @Override
    public String toString() {
        return ("Rectangle " + super.toString()+", Longueur : " + this.longueur+ ", Largeur : "+ this.largeur);
    }
}
