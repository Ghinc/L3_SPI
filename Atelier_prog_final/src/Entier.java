public class Entier {

    private int valeur;
    private int borninf;
    private int bornesup;

    public Entier (int borninf, int bornesup, int valeur){
        this.borninf=borninf;
        this.bornesup=bornesup;
        if(borninf<=valeur && bornesup>=valeur) {
            this.valeur=valeur;
        }else{
            System.err.println("La veleur doit être comprise entre les bornes ! ");
            this.valeur=0;
        }
    }

    public Entier(int borninf, int bornesup){
        this(borninf, bornesup, 0);
    }

    public void setValeur(int valeur){
        if(borninf<=valeur && bornesup>=valeur) {
            this.valeur = valeur;
        }
    }



    public void incremente(){
        if(this.valeur+1<=bornesup) {
            this.valeur++;
        }
    }

    public void incremente(int n){
        for (int i=0;i<n;i++){
            incremente();
        }
    }

    public String toString(){
        return(Integer.toString(valeur));
    }

    public boolean equals(Entier entier){
        return(this.valeur==entier.valeur);
    }








}
