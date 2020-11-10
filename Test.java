public class Test {

    public static void main(String[] args){
        ConcreteStackList staque = new ConcreteStackList();
        System.out.println(staque.isEmpty());
        staque.push(13);
        System.out.println(staque.isEmpty());
        staque.push("pois chiche");
        System.out.println(staque.peek());
        System.out.println(staque.pop());
        System.out.println(staque.peek());


    }
}
