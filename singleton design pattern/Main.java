import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws Exception {

//        /*
//        * Singleton design pattern using lazy loading
//        */
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        System.out.println(singleton1.hashCode());
//        System.out.println(singleton2.hashCode());

//        /*
//        *  Singleton design pattern using eager loading
//        */
//        Mingleton mingleton1 = Mingleton.getInstance();
//        Mingleton mingleton2 = Mingleton.getInstance();
//        System.out.println(mingleton1.hashCode());
//        System.out.println(mingleton2.hashCode());

//        /*
//        * Breaking singleton design pattern with the help of reflection api by changing access specifier of
//        * constructor from private to public.
//        */
//        Singleton singleton3 = Singleton.getInstance();
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton singleton4 = constructor.newInstance();
//        System.out.println(singleton3.hashCode());
//        System.out.println(singleton4.hashCode());

//         /*
//         * Breaking singleton design pattern with the help of deserialization and serialization of the object.
//         */
//          Singleton singleton5 = Singleton.getInstance();
//          ObjectOutputStream oost = new ObjectOutputStream(new FileOutputStream("singleton.ob"));
//          oost.writeObject(singleton5);
//          System.out.println("serialization of object");
//          ObjectInputStream oist = new ObjectInputStream(new FileInputStream("singleton.ob"));
//          Singleton singleton6 = (Singleton) oist.readObject();
//          System.out.println(singleton5.hashCode());
//          System.out.println(singleton6.hashCode());

            Singleton singleton7 = Singleton.getInstance();
            Singleton singleton8 = (Singleton) singleton7.clone();
            System.out.println(singleton7.hashCode());
            System.out.println(singleton8.hashCode());
    }
}
