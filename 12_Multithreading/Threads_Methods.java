class MyThrea1 extends Thread{
    public void run(){
        //int i= 0;
        while(true){
            System.out.println("It's thread t1");
            try{
                Thread.sleep(455);   //this thread will sleep for 455 milisecond
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            //i++;
        }
    }
}

class MyThrea2 extends Thread{
    public void run(){
        while(true){
            System.out.println("It's thread t2");
        }
    }
}

public class Threads_Methods {
    public static void main(String[] args) {
        MyThrea1 t1 = new MyThrea1();
        MyThrea2 t2 = new MyThrea2();
        t1.start();
        /* 
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        */
        t2.start();
    }
    
}

/*Using      t1.join we can define after the t1 will stop running then t2 will start */