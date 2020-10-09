package pack_2d;

import pack_1.Forme;

public abstract class Forme_2D extends Forme {

    /**
     * Constructeur des formes en 2D
     * @param nom Nom de la forme
     */

    public Forme_2D(String nom){
        super(nom);
    }

    /**
     * Calcule le périmètre de la forme
     * @return le périmètre de la forme
     */

    public abstract double perimetre();
}
