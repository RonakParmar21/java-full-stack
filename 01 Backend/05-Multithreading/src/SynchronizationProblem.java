class Addition
{
    int sum=0;
    synchronized public void add()
    {
        sum=sum+1;
    }
}
class MyThreadThree extends Thread{

    Addition add;
    MyThreadThree(Addition add)
    {
        this.add=add;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
        {
            add.add();
        }
    }
}

class MyThreadFour extends Thread{

    Addition add;
    MyThreadFour(Addition add)
    {
        this.add=add;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000;i++) //1->100
        {
            add.add();
        }
    }
}
public class SynchronizationProblem {
    public static void main(String[] args) throws InterruptedException {
        Addition addition=new Addition();
        MyThreadThree t3=new MyThreadThree(addition);
        MyThreadFour t4=new MyThreadFour(addition);

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("final sum : "+addition.sum);
    }
}
