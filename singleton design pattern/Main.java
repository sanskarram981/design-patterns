public class Main {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Mingleton mingleton1 = Mingleton.getInstance();
        Mingleton mingleton2 = Mingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(mingleton1.hashCode());
        System.out.println(mingleton2.hashCode());
    }
}
