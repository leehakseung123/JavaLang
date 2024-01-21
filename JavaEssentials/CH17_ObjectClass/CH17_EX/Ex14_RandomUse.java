package CH17_EX;

import java.util.Random;
public class Ex14_RandomUse {
    public static void main(String[] args) {
        // 1. 매번 다른 수가 나옴
        Random rand1 = new Random();

        for(int i = 0; i<10; i++)
        {
            System.out.println(rand1.nextInt(10) + " ");
        }
        System.out.println();

        // 2.매번 같은 순으로 나옴
        Random rand2 = new Random(12);

        for(int i = 0; i<10; i++)
        {
            System.out.println(rand2.nextInt(10) + " ");
        }
        System.out.println();
    }
}
