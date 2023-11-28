package Ex06_EX;

public class Ex03_SwithchNoneBreak {
    public static void main(String [] args)
    {
        int n = 6;

        switch (n % 7)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("주중");
                break;
            case 6:
            default:
                System.out.println("주말");
        }
    }
}
