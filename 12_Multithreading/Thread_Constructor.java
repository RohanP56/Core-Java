class MyThre extends Thread{
    public MyThre(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("I am a thread");
        }
    }
}

public class Thread_Constructor {
    public static void main(String[] args) {
        MyThre th1 = new MyThre("AlienX");
        //th1.start();
        System.out.println("The ID of the thread 'th' is : " + th1.getId());
        System.out.println("The name of the thread 'th' is : " + th1.getName());
        MyThre th2 = new MyThre("Goof");
        //th1.start();
        System.out.println("The ID of the thread 'th' is : " + th2.getId());
        System.out.println("The name of the thread 'th' is : " + th2.getName());
    }
}
