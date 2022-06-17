import java.util.Scanner;

public class Number_avg {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=t.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter -ve, +ve or Zeros for avarage:");
        for(int i=0;i<n;i++){
            arr[i]=t.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        float pos=0;
        float neg=0;
        float zero=0;

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos++;
            }
            if(arr[i]<0){
                neg++;
            }
            if(arr[i]==0){
                zero++;
            }
        }
        /*double pos_avg=pos/arr.length;
        double neg_avg=neg/arr.length;
        double zero_avg=zero/arr.length;*/

        /*System.out.println("Count of pos: "+pos);
        System.out.println("Count of neg: "+neg);
        System.out.println("Count of zero: "+zero);
        System.out.println();*/
        System.out.printf("Avarage of Pos: %1.6f\n",pos/n);
        System.out.printf("Avarage of neg: %1.6f\n",neg/n);
        System.out.printf("Avarage of zero: %1.6f\n",zero/n);

    }
}
