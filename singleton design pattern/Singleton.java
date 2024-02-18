import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable,Cloneable
{
    private static Singleton instance;

    private Singleton() throws Exception{
        if(instance != null)
            throw new RuntimeException("Singleton is breaking!!");
    } 

    public static Singleton getInstance() throws Exception{
            synchronized(Singleton.class){
            if(instance == null){
            instance = new Singleton();
            return instance;
            }
         }
        return instance;
    }
    @Serial
    public Object readResolve(){
        return instance;
    }

    public Object clone() throws CloneNotSupportedException {
        //return super.clone();
        return instance;
    }

}