 class ThreadDemo implements Runnable{
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("child thread "+i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        Thread t = new Thread(t1);
        t.start();
        for (int i=1; i<5; i++) {
            System.out.println("main thread "+i);

        }
    }
}