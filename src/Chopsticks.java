/**
 * Created by admin on 2016/11/18.
 */
public class Chopsticks {
    String name;
    public boolean flag=true;


    public Chopsticks(String name){
        this.name=name;
    }
    public synchronized void take()
    {

        this.flag =false;

    }
    public synchronized void put()
    {
        this.flag =true;
        this.notifyAll();
    }
}









