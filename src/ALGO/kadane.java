package ALGO;


public class kadane {

    public static void main(String[] args)
    {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is "
                + maxSubArraySum(a));
    }


    static int maxSubArraySum(int a[])
    {


        int max= Integer.MIN_VALUE;
        int sum=0;

        for (int i = 0; i < a.length; i++) {
          sum=sum+a[i];

          max=Math.max(sum,max);

          if (sum<0)
              sum=0;
        }
        return max;
    }
}



