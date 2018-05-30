import java.util.Random;
import java.util.Scanner;

public class Main {

    public static double test(Queue<Integer> q, int number) {
        long start = System.nanoTime();
        Random random = new Random();
        for (int i=0; i<number; i++)
            q.enquenu(random.nextInt(Integer.MAX_VALUE));
        for (int i=0; i<number; i++)
            q.dequeue();
        long end = System.nanoTime();
        return (end - start) / 1000000000.0;
    }
    public static void main(String[] args) {
        int number = 100000;
//        ArrayQueue<Integer> aq = new ArrayQueue<>();
//        double time1 = test(aq, number);
//        System.out.println(time1);

        LoopQueue<Integer> lq = new LoopQueue<>();
        double time2 = test(lq, number);
        System.out.println(time2);


    }
}
