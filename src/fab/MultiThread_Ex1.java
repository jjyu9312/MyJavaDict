package fab;

class Main {
    public static void main(String[] args) {
        MultiThread_Ex1 threadex = new MultiThread_Ex1();
        MultiThread_Ex1 threadex2 = new MultiThread_Ex1();
        Thread thread1 = new Thread(threadex,"A");
        Thread thread2 = new Thread(threadex2,"B");

        thread1.start();
        System.out.println("======================");
        thread2.start();

        Thread.currentThread().getName();
    }
}

public class MultiThread_Ex1 implements Runnable{

    int TestNum = 0;

    @Override
    public void run() {

        for(int i = 0; i < 5; i++){
            if(Thread.currentThread().getName().equals("A")){
                System.out.println("=======================");
                TestNum++;
            }
            System.out.println("ThreadName = "+Thread.currentThread().getName()+"TestNum = "+TestNum);

            try {
                System.out.println("thread sleep");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
