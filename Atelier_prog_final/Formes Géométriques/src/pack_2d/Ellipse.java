package pack_2d;

public class Ellipse extends Forme_2D {
    public float longueur;
    public float largeur;
    public float a;
    public float b;



    /**
     * Constructeur de la classe Ellipse
     * @param nom nom de l'ellipse
     * @param longueur longueur de l'ellipse
     * @param largeur largeur de l'ellipse
     */


    public Ellipse(String nom, float longueur, float largeur) {
        super(nom);
        this.longueur=longueur;
        this.largeur=largeur;
        this.a=longueur/2;
        this.b=largeur/2;

    }

    /**
     * Calcul du périmètre de l'ellipse
     * @return le périmètre de l'ellipse
     */

    @Override
    public double perimetre() {
        return (2*Math.PI*(Math.sqrt((a*b)/2)));
    }

    /**
     * Calcule la surface de l'ellipse
     * @return la surface de l'ellipse
     */


    @Override
    public double surface() {
        return(a*b*Math.PI);
    }

    /**
     * Teste l'égalité entre deux objets (le nom n'est pas pris en compte)
     * @param obj Objet dont on veut savoir s'il est égal au premier objet ou non
     * @return True si les deux objets sont égaux, False sinon
     */
    @Override
    public boolean equals(Object obj) {
        return(obj instanceof Ellipse && this.perimetre()==((Ellipse) obj).perimetre());
    }

    /**
     * Redéfinition de la méthode toString redéfinie dans la classe Forme
     * @return le nom de l'ellipse et ses caractéristiques
     */

    @Override
    public String toString() {
        return ("Ellipse " + super.toString()+", Longueur : " + this.longueur+ ", Largeur : "+ this.largeur);
    }

}

