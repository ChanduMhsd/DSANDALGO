package ALGO;

public class Binarysearch {
    public static void main(String[] args) {
        int[] a={1,4,5,6};
        int target=6;
        System.out.println(search(a,target));

    }

    public static int search(int[] a,int tar)
    {
        int s=0,e=a.length-1;

        while (e>=s){
            int mid=s+(e-s)/2;

            if (a[mid]==tar)
                return mid;

            if (tar>a[mid])
            {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }

        return -1;
    }
}
