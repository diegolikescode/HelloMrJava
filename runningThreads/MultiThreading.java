package runningThreads;

public class MultiThreading implements Runnable {
  MultiThreading2 myThread = new MultiThreading2();

  public void xama() {
    MultiThreading obj = new MultiThreading();
    Thread t = new Thread(obj);

    t.start();
    System.out.println("in da middle");
    for (int a = 0; a < 10; a++) {
      System.out.println("AGAIN N AGAIN");
      t.run();
    }
    System.out.println("in da END END END");
  }

  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("XQDLZADA");
      myThread.run();
    }
  }
}
