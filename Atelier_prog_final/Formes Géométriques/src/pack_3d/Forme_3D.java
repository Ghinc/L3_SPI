package pack_3d;

import pack_1.Forme;

public abstract class Forme_3D extends Forme {

    /**
     * Constructeur des Formes en 3D
     * @param nom le nom que l'on souhaite donner à la Forme
     */

    public Forme_3D(String nom) {
        super(nom);
    }

    /**
     * Calcule le volume de la Forme
     * @return le volume de la forme
     */

    public abstract double volume();
}
