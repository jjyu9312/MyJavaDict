package fab;

public class SingleThread_Ex2 implements Runnable{

    private final int[] intArray;

    public SingleThread_Ex2(){
        intArray = new int[5];

        for(int start = 0; start < intArray.length;start++){
            intArray[start] = start;
        }
    }

    @Override
    public void run() {

        for(int start : intArray){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException ie) {
                ie.printStackTrace();
                // TODO: handle exception
            }

            System.out.println("thread Name : "+Thread.currentThread().getName());
            System.out.println("intArray value : "+start);
        }
    }

    public static void main(String[] args) {

        SingleThread_Ex2 ct = new SingleThread_Ex2();
        Thread t = new Thread(ct,"SingleThread");

        t.start();
    }
}
