import java.util.Scanner;

class MidElementArray{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array");
            int n=sc.nextInt();
            int[] a=new int[n];
            System.out.println("\nEnter element of array");
            for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
            }
            int low=0;
            int high=a.length;
            int mid=(low+high)/2;
            int b=a[mid];

            System.out.println("\nMid element is:\n");

            System.out.println(b);
        }

    }
}