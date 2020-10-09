public class Test {

    //pour l'invocation de méthodes, c'est le type réel à l'exécution qui importe (méthodes spécifiques, etc.)

    public static void main (String[] args){
        String[] tablo={"perdu","gagné","passe ton tour","tu pues"};
        DesPipes dem=new DesPipes(6,"jean-eude", 3);
        System.out.println(dem.lancer());
        System.out.println(dem.lancer());
        System.out.println(dem.lancer());
        System.out.println(dem.lancer());
        System.out.println(dem.lancer());
        System.out.println(dem.lancer());
        System.out.println(dem.lancer());
        System.out.println(dem.lancer());


    }
}
