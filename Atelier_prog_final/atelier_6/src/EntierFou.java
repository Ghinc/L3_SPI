public class EntierFou extends Entier {

    private int niveauDeFolie;

    public EntierFou(int borninf, int bornesup, int valeur, int niveauDeFolie){
        super(borninf,bornesup,valeur);
        if(valeur+niveauDeFolie<=bornesup){
            this.niveauDeFolie=niveauDeFolie;
        }else{
            System.err.println("L'entier est trop fou !");
            this.niveauDeFolie=1;
        }
    }

    public void incremente(){
        super.incremente(niveauDeFolie);
    }
}
