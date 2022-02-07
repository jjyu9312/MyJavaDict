package fab;

// Runnable을 implement한 Thread
public class SingleThread_Ex1 extends Thread{

    private int[] intArray;

    public SingleThread_Ex1(String threadname) {
        // Thread 클래스를 상속받음.
        super(threadname);
        intArray = new int[10];

        for(int start = 0; start < intArray.length;start++){
            intArray[start] = start;
        }
    }

    public void run(){
        for(int start : intArray){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException ie) {
                ie.printStackTrace();
                // TODO: handle exception
            }
            System.out.println("thread Name : "+currentThread().getName());
            System.out.println("intArray value : "+start);
        }
    }

    public static void main(String[] args) {
        SingleThread_Ex1 st = new SingleThread_Ex1("첫번째");
        st.start();
    }
}
