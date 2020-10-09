package pack_1;

import pack_2d.Rectangle;
import pack_3d.Sphere;

import java.util.ArrayList;

public class Test {

    public static void main(String[] arg){
        ArrayList<Forme> tablo= new ArrayList<Forme>();
        Sphere sph = new Sphere("sph",3);
        Rectangle carai = new Rectangle("rect", 5,5);
        tablo.add(carai);
        tablo.add(sph);
        for (int i=0;i<tablo.size();i++){
            System.out.println(tablo.get(i));
        }

    }
}
