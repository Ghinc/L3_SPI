import java.util.ArrayList;

public class ConcreteStackList implements  AStack {
    private ArrayList<Object> monContenu;

    public ConcreteStackList(){
        monContenu= new ArrayList<Object>();
    }


    @Override
    public boolean isEmpty() {
        return(monContenu.size()==0);
    }

    @Override
    public void push(Object o) {
        monContenu.add(o);

    }

    @Override
    public Object peek() {
        int taille=monContenu.size();
        return(monContenu.get(taille-1));
    }

    @Override
    public Object pop() {
        int taille=monContenu.size();
        Object temp=monContenu.get(taille-1);
        monContenu.remove(taille-1);
        return(temp);
    }
}
