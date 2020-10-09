import pack_3.Employe;
import pack_3.Manager;
import pack_3.Personne;
import pack_3.Secretaire;
import pack_3_2.Adresse;

public class Test {

    public static void main(String[] args){
       /* Adresse adrais=new Adresse(3,"bloup","20145","Corte");
        Personne gen = new Personne("Velouté", "Titi",8,8,2000,5,"Rue des magnolias","20250","Ajaccio");
        Personne gen2=new Personne("Knor", "Toto",8,12,2005,5,"Place du diamant","20000","Corte");
        Personne gen3=new Personne("Knor", "Toto",8,12,2005,5,"Place du diamant","20000","Corte"); */
        Employe e1= Employe.createEmploye("Johanna","Fericean",
                30,9,2000,314,"Calvaire","20250","Corte",2789);
        e1.augmenterSalaire(10);
        System.out.println(e1.getSalaire());
        Secretaire s1=new Secretaire("Bonnemère","Vincent",24,6,2000,7,"perdue","20167","Volpaghja",
                1240);
        Manager m1=new Manager("Bernard","Dupont",5,8,1996,3,"des impôts","20157","Ajaccio",
                2000,s1);
        Manager m2=new Manager("Concon","Marcouille",24,12,20000,3,"des cassos","20000","Ajaccio",
                1500,s1, 8,2,1999);

        System.out.println("Le salaire du manager de 1500 " + m2.getSalaire());
        System.out.println("Le salaire de la secrétaire "+ s1.getSalaire());
        System.out.println("Les manas gérés par la secrétaire : ");
        s1.lesmana();
        Manager m3=Manager.upgradeMana(e1);



        //System.out.println(adrais);
    }

}
