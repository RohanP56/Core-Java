//creating thread using runnable interface

//          Thread-1
class ThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        int i= 0;
        while(i<5000){
            System.out.println("This is thread-1");
            i++;
        }
        
    }
}

//          Thread-2
class ThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        int i= 0;
        while(i<5000){
            System.out.println("This is thread-2");
            i++;
        }
        
    }
}


public class Runnable_Interface {
    public static void main(String[] args) {

        ThreadRunnable1 t1 = new ThreadRunnable1();   //creating object of runnable interface class
        Thread g1 = new Thread(t1);   //creating a thread and start thread

        ThreadRunnable2 t2 = new ThreadRunnable2();
        Thread g2 = new Thread(t2);

        g1.start();
        g2.start();
    }
    
}
/* When we implement runnable interface we can't call directly "start" method*/
