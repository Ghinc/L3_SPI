public class Test {

    public static void main (String[] args){
        String[] tablo={"perdu","gagné","passe ton tour","tu pues"};
        DeFaceAutre leface=new DeFaceAutre(4,"ledé",tablo);
        System.out.println(leface.lancement());


    }
}
