import java.util.ArrayList;

public class ConcreteStack implements AStack{

    public Object[] contenu;
    public int size;
    public static int compteur=-1;

    public ConcreteStack(int size){
        this.size=size;
        contenu= new Object[size];

    }



    @Override
    public boolean isEmpty() {
        return(compteur==-1);
    }

    @Override
    public void push(Object o) {
        compteur ++;
        contenu[compteur]=o;

    }

    @Override
    public Object peek() {
        if (compteur>-1){
            return contenu[compteur];
        }
        return null;


    }

    @Override
    public Object pop() {
        Object temp=null;
        if(compteur>-1){
            temp=contenu[compteur];
            contenu[compteur]=null;
            compteur --;

        }
        return temp;

    }
}
