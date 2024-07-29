package javaPrigrams;
public class Main {
    public static void main(String[] args) {
        // Create an instance of MyTask
        MyTask task = new MyTask();
        
        // Create a Thread and pass the task to it
        Thread thread = new Thread(task);
        
        // Start the thread
        thread.start();
        
        System.out.println("hai");
    }
}
 class MyTask implements Runnable {
    public void run() {
        // Code to be executed concurrently
        System.out.println("Executing my task...");
    }
}
