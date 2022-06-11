public class Quick{
	int partiton(int a[], int l, int h){
		int pivot=a[h];//pivot element;
		int i= h-1;
		for(int j=l; j<h-1;j++){
			if (a[j] < pivot)  
			{  
            i++; // increment index of smaller element  
            int t = a[i];  
            a[i] = a[j];  
            a[j] = t;  
			}  
		}  
		int t = a[i+1];  
		a[i+1] = a[h];  
		a[h] = t;  
		return (i + 1);  
	}
	void quick(int a[], int l, int h){
		
		if(l<h){
			int p = partiton(a, l, h);
			 quick(a, l, p - 1);  
			 quick(a, p + 1, h);
		}
	}
	void printArr(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
    public static void main(String[] args) {  
    int a[] = { 13, 18, 27, 2, 19, 25 };  
    int n = a.length;  
    System.out.println("\nBefore sorting array elements are - ");  
    Quick q1 = new Quick();  
    q1.printArr(a, n);  
    q1.quick(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are - ");  
    q1.printArr(a, n);  
    System.out.println();  
    }  
}  