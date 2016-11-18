import static java.lang.Thread.sleep;

/**
 * Created by admin on 2016/11/15.
 */
public class Philosopher extends Thread {


    public void eat(){

        System.out.println("eating");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void think() {
        System.out.println("thinking");
        try {
            sleep(1000);

    } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }public Chopsticks left;
    public Chopsticks right;
    private String name;
    private Chopsticks[] chopsticks;
    public Philosopher(String name, Chopsticks a,Chopsticks b){
        super(name);

        this.name=name;
        this.chopsticks=chopsticks;


    }

        @Override
    public void run() {
            if(left.flag)
            {
                left.take();
            }
            else
            {
                while(!left.flag)
                {
                    try
                    {
                        think();
                        Thread.sleep(500);
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }



            try
            {
                Thread.sleep(500);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            if(right.flag)
            {
                right.take();
            }
            else
            {
                while (!left.flag)
                {
                    try
                    {
                       think();
                        Thread.sleep(500);
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

            }


            eat();

            try
            {
                Thread.sleep(2000);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            left.put();
            right.put();
        }
}








