package treads;

public class TreadExamples {

    public static void main(String[] args) {
        Thread myThread = new Thread(new SomeThing());

        Thread myTread2 = new Thread(() -> System.out.println("third thread"));
        myThread.start();
        myTread2.start();
        System.out.println("main thread");
        ExtendsThread extendsThread = new ExtendsThread();
        extendsThread.start();

    }


}
class SomeThing implements Runnable {
    @Override
    public void run() {
        System.out.println("i study runing threads");
    }
}

class ExtendsThread extends Thread{
    @Override
    public void run(){
        System.out.println("extends thread");
    }
}
