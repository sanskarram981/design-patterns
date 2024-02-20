import com.design.abstractfactory.*;
import com.design.builder.User;
import com.design.factory.Engineer;
import com.design.factory.EngineerFactory;
import com.design.observer.Subscriber;
import com.design.observer.YoutubeChannel;
import com.design.prototype.DBConnection;
import com.design.singleton.Singleton;
import org.w3c.dom.ls.LSOutput;

import java.util.function.DoubleBinaryOperator;

public class Main {
    public static void main(String[] args) throws Exception {
// =================================== Singleton Design Pattern =============================================

//        /*
//        * com.design.singleton.Singleton design pattern using lazy loading
//        */
//        com.design.singleton.Singleton singleton1 = com.design.singleton.Singleton.getInstance();
//        com.design.singleton.Singleton singleton2 = com.design.singleton.Singleton.getInstance();
//        System.out.println(singleton1.hashCode());
//        System.out.println(singleton2.hashCode());

//        /*
//        *  com.design.singleton.Singleton design pattern using eager loading
//        */
//        com.design.singleton.Mingleton mingleton1 = com.design.singleton.Mingleton.getInstance();
//        com.design.singleton.Mingleton mingleton2 = com.design.singleton.Mingleton.getInstance();
//        System.out.println(mingleton1.hashCode());
//        System.out.println(mingleton2.hashCode());

//        /*
//        * Breaking singleton design pattern with the help of reflection api by changing access specifier of
//        * constructor from private to public.
//        */
//        com.design.singleton.Singleton singleton3 = com.design.singleton.Singleton.getInstance();
//        Constructor<com.design.singleton.Singleton> constructor = com.design.singleton.Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        com.design.singleton.Singleton singleton4 = constructor.newInstance();
//        System.out.println(singleton3.hashCode());
//        System.out.println(singleton4.hashCode());

//         /*
//         * Breaking singleton design pattern with the help of deserialization and serialization of the object.
//         */
//          com.design.singleton.Singleton singleton5 = com.design.singleton.Singleton.getInstance();
//          ObjectOutputStream oost = new ObjectOutputStream(new FileOutputStream("singleton.ob"));
//          oost.writeObject(singleton5);
//          System.out.println("serialization of object");
//          ObjectInputStream oist = new ObjectInputStream(new FileInputStream("singleton.ob"));
//          com.design.singleton.Singleton singleton6 = (com.design.singleton.Singleton) oist.readObject();
//          System.out.println(singleton5.hashCode());
//          System.out.println(singleton6.hashCode());

//            /*
//            * Breaking singleton design pattern with the help of cloning of objects.
//            */
//            Singleton singleton7 = Singleton.getInstance();
//            Singleton singleton8 = (Singleton) singleton7.clone();
//            System.out.println(singleton7.hashCode());
//            System.out.println(singleton8.hashCode());


//        ========================================= Factory Design Pattern ===============================================

//               Engineer e1 = EngineerFactory.getEngineer("DATA ENGINEER");
//               System.out.println(e1);
//               e1.getSalary();
//               Engineer e2 = EngineerFactory.getEngineer(("ml Engineer"));
//               System.out.println(e2);
//               e2.getSalary();
//               Engineer e3 = EngineerFactory.getEngineer("nlp");
//               System.out.println(e3);
//               if(e3 != null)
//               e3.getSalary();

//               ========================================= Abstract Factory Design Pattern ===============================================

//                 Employee emp1 = EmployeeFactory.getEmployee(new JavaDeveloperFactory());
//                 System.out.println(emp1.getName());
//                 System.out.println(emp1.getSalary());
//
//                 Employee emp2 = EmployeeFactory.getEmployee(new PythonDeveloperFactory());
//                 System.out.println(emp2.getName());
//                 System.out.println(emp2.getSalary());
//
//                 Employee emp3 = EmployeeFactory.getEmployee(new ScalaDeveloperFactory());
//                 System.out.println(emp3.getName());
//                 System.out.println(emp3.getSalary());

//        ============================================= Builder Design Pattern ===========================================

//                   User user1 = new User.UserBuilder()
//                           .setUserId(123)
//                           .setUserName("shivam sahu")
//                           .setUserAddress("ranchi")
//                           .build();
//                   System.out.println(user1);
//
//                   User user2 = User.getBuilder()
//                           .setUserId(124)
//                           .setUserName("shivam sunderam")
//                           .setUserAddress("ranchi")
//                           .build();
//                   System.out.println(user2);

//        =====================================  Prototype Design Pattern ================================================

//                 System.out.println("making db connection-1");
//                 DBConnection dbConnection1 = new DBConnection("www.jpmcftp.com",8080);
//                 System.out.println("connected successfully-1");
//
//                 System.out.println("making db connection-2");
//                 DBConnection dbConnection2 = (DBConnection) dbConnection1.clone();
//                 System.out.println("connected successfully-2");
//
//                 System.out.println(dbConnection1);
//                 System.out.println(dbConnection2);
//
//                 System.out.println(dbConnection1 == dbConnection2);
//
//                 System.out.println(dbConnection2.getHostname() == dbConnection1.getHostname());
//
//                 System.out.println(dbConnection1.getData() == dbConnection2.getData());
//
//                 System.out.println(dbConnection1.getPort() == dbConnection2.getPort());
//
//                 System.out.println(dbConnection1.getDomains() == dbConnection2.getDomains());


//        =====================================  Observer Design Pattern ================================================

                   YoutubeChannel youtubeChannel = new YoutubeChannel();
                   Subscriber s1 = new Subscriber("Shivam");
                   Subscriber s2 = new Subscriber("Sarfaraz");
                   Subscriber s3 = new Subscriber("Shashi");

                   youtubeChannel.subscribe(s1);
                   youtubeChannel.subscribe(s2);
                   youtubeChannel.subscribe(s3);

                   youtubeChannel.notifyChanges("Reactive Programming in Java \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80");
                   System.out.println("================================================================================");
                   youtubeChannel.unsubscribe(new Subscriber("Shivam"));
                   youtubeChannel.notifyChanges("Akka Backend Development using Scala \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80");


    }
}
