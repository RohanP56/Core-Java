//creating thread extending thread class

//Thread - 1
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<5000){
            System.out.println("This thread-1 is running");
            System.out.println("I am happy");
            i++;
        }
        
    }
}

//thread = 2
class MyThread2 extends Thread{
    @Override
    public void run(){
        int j = 0;
        while(j<5000){
            System.out.println("This thread-2 is running");
            System.out.println("I am sad!");
            j++;
        }
        
    }
}


public class Extending_Thread_Class {
    public static void main(String[] args){

        MyThread1 t1 = new MyThread1();  //creating object
        MyThread2 t2 = new MyThread2();

        t1.start();   //thread is starting this start method will call run method internally
        t2.start();   //thread is starting this start method will call run method internally
    }
    
}
