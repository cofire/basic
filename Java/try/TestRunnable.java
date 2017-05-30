/**
 * @Author:      liying
 * @DateTime:    2017-05-30 22:03:32
 * @Description: Description
 */

class RunnableDemo implements Runnable {
    private Thread t;
    private String ThreadName;

    RunnableDemo(String ThreadName){
        this.ThreadName = ThreadName;
        System.out.println("Creating " + ThreadName);
    }

    public void run(){
        System.out.println("Running " + ThreadName);
        try{
            for (int i = 4; i>0; i--) {
                System.out.println("Thread: " + ThreadName + "," + i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println("Thread: " + ThreadName + "interrupted.");
        }
        System.out.println("ThreadName: " + ThreadName + "exiting.");
    }

    public void start(){
        System.out.println("Starting " + ThreadName);
        if (t == null) {
            t = new Thread(this, ThreadName);
            t.start();
        }
    }
}

public class TestRunnable {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();
        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();
    }
}