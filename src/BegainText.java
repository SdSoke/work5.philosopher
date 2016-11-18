/**
 * Created by admin on 2016/11/16.
 */
public class BegainText {
    public static void main(String[] args) {
        Chopsticks c1 = new Chopsticks("1号");
        Chopsticks c2 = new Chopsticks("2号");
        Chopsticks c3= new Chopsticks("3号");
        Chopsticks c4 = new Chopsticks("4号");
        Chopsticks c5 = new Chopsticks("5号");

        Philosopher p1 = new Philosopher("1", c1, c2);
        Philosopher p2 = new Philosopher("2", c2, c3);
        Philosopher p3 = new Philosopher("3", c3, c4);
        Philosopher p4 = new Philosopher("4", c4, c5);
        Philosopher p5 = new Philosopher("5", c5, c1);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        }
    }






