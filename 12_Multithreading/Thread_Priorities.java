class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        //int i = 34;
        while(true){
            //System.out.println("I am a thread");
            System.out.println("Thank You : "+this.getName());
        }
    }
}


public class Thread_Priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Humungousour");
        MyThr1 t2 = new MyThr1("Fourarms");
        MyThr1 t3 = new MyThr1("Echo-Echo");
        MyThr1 t4 = new MyThr1("Wildmutt");
        MyThr1 t5 = new MyThr1("Z-Ray");    // lets, this is most important thread we want to run it first

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

/*In JVM there a ready queue inside the ready queue theres all the threads present which are ready to run 


But, in maximum case thread priority depends on OS, if there sufficient CPU, that also provide low priority task   if it's possible
*/