package Synchronization;

public class TablePrintWithBlock {
    public  void printTable(int n)
    {
        synchronized(this) // ye block pe muje lock chahiye
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(Thread.currentThread().getName()+ " : "+(n * i));
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }

    }
}
