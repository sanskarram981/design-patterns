import com.design.adapter.AdapterCharger;
import com.design.adapter.IPhone;
import com.design.adapter.IphoneCharger;
import com.design.adapter.SamsungCharger;
import com.design.iterator.User;
import com.design.iterator.UserList;
import com.design.iterator.CustomIterator;
import com.design.observer.Subscriber;
import com.design.observer.YoutubeChannel;
import com.design.solid.dependencyinversion.*;
import com.design.solid.interfacesegmented.*;
import com.design.solid.liskov.Bike;
import com.design.solid.liskov.Car;
import com.design.solid.liskov.Vehicle;
import com.design.solid.open.InvoiceDaoFTP;
import com.design.solid.open.InvoiceDaoFile;
import com.design.solid.open.InvoiceDaoSMTP;
import com.design.solid.single.Invoice;
import com.design.solid.single.InvoicePrint;
import com.design.solid.single.InvoiceToDB;
import com.design.solid.single.Marker;

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

//                   YoutubeChannel youtubeChannel = new YoutubeChannel();
//                   Subscriber s1 = new Subscriber("Shivam");
//                   Subscriber s2 = new Subscriber("Sarfaraz");
//                   Subscriber s3 = new Subscriber("Shashi");
//
//                   youtubeChannel.subscribe(s1);
//                   youtubeChannel.subscribe(s2);
//                   youtubeChannel.subscribe(s3);
//
//                   youtubeChannel.notifyChanges("Reactive Programming in Java \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80");
//                   System.out.println("================================================================================");
//                   youtubeChannel.unsubscribe(new Subscriber("Shivam"));
//                   youtubeChannel.notifyChanges("Akka Backend Development using Scala \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80");


//         =====================================  Iterator Design Pattern ================================================

//                   UserList userList = new UserList();
//                   userList.add(new User(1,"shivam"));
//                   userList.add(new User(2,"sagen"));
//                   userList.add(new User(3,"sarfaraz"));
//                   userList.add(new User(4,"deepak"));
//
//                   CustomIterator customIterator = userList.iterator();
//
//                   while(customIterator.hasNext()){
//                       System.out.println(customIterator.next());
//                   }


//          =====================================  Adapter Design Pattern ================================================

//                   IPhone iPhone1 = new IPhone(new IphoneCharger());
//                   iPhone1.chargePhone();
//
//                   IPhone iPhone2 = new IPhone(new AdapterCharger(new SamsungCharger()));
//                   iPhone2.chargePhone();


//          =================================== Solid Principle =====================================================

//                Single Responsibility Principle
                  Marker m1 = new Marker("black",20,14);
                  Invoice i1 = new Invoice(m1);
                  i1.calculatePrice();
                  InvoicePrint ip1 = new InvoicePrint(i1);
                  ip1.printInvoice();
                  InvoiceToDB idb1 = new InvoiceToDB(i1);
                  idb1.saveToDB();

//                Open/Closed Principle
                  Marker m2 = new Marker("red",15,100);
                  Invoice i2 = new Invoice(m2);
                  i2.calculatePrice();
                  InvoiceDaoFile idf1 = new InvoiceDaoFile(i2);
                  idf1.save();
                  InvoiceDaoSMTP ids1 = new InvoiceDaoSMTP(i2);
                  ids1.save();
                  InvoiceDaoFTP idp1 = new InvoiceDaoFTP(i2);
                  idp1.save();

//                Liskov Substitution Principle
                  Vehicle v1 = new Bike();
                  v1.startEngine();
                  v1.accelerate();

                  Vehicle v2 = new Car();
                  v2.startEngine();
                  v2.accelerate();

//                Interface Segmented Principle
                  ChefInterface chef1 = new Chef();
                  chef1.prepareMenu();
                  chef1.prepareOrder();

                  HelperInterface helper1 = new Helper();
                  helper1.pickPlates();
                  helper1.washPlates();

                  WaiterInterface waiter1 = new Waiter();
                  waiter1.serveOrder();
                  waiter1.takeOrder();


//                Dependency Inversion Principle

                  HpLaptop hpLaptop1 = new HpLaptop(new BTKeyBoard(),new BTMouse());
                  hpLaptop1.point();
                  hpLaptop1.type();

                  HpLaptop hpLaptop2 = new HpLaptop(new WireKeyBoard(),new WireMouse());
                  hpLaptop2.point();
                  hpLaptop2.type();

    }
}
