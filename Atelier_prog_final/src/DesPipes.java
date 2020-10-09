public class DesPipes extends De {
    private int valmin;

    public DesPipes(int nbfaces, String nom, int valmin){
        super(nbfaces,nom);
        if(valmin<=nbfaces){
            this.valmin=valmin;
        }else {
            this.valmin = 0;
        }
    }

    public DesPipes(int valmin){
        this(6,"",valmin);
    }

    public int lancer(){
        return (super.lancer()+valmin-(getNbfaces()-valmin));
    }


}
