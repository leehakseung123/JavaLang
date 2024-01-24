package CH19_Project;

public class InsertSort {
    public static void insertSort(int[] num)
    {
        int size = num.length;
        int temp = 0;
        int j = 0;

        for(int i=1; i<size; i++)
        {
            temp = num[i];
            for (j=i-1; j>=0 && temp<num[j]; j--)
            {
                num[j+1] = num[j];
            }
            num[j+1] = temp;
        }

    }
    public static void main(String[] args) {

    }
}
