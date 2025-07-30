package Synchronization;

public class MyThread1 extends Thread {
    // this code is for method synchronization
//    TablePrntWithMethod t;
//    MyThread1(TablePrntWithMethod t)
//    {
//        this.t=t;
//    }

    // this block is for block synchronization
    TablePrintWithBlock t;
    MyThread1(TablePrintWithBlock t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}
