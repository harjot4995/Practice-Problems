import java.util.Scanner;

class Grabit{
 int t;
 
 public static void main(String[] args){
   Scanner in=new Scanner(System.in);
   int t=in.nextInt();
    while(t!=0){
     int ans=0;
     int n=in.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<n;++i){
       arr[i]=in.nextInt();
     }
     quickSortInAscendingOrder(arr,0,n-1);
     for(int i=1;i<n-1;++i){
          ans+=((arr[i]*arr[i-(arr[i]-1)])+(arr[i]*arr[i+1])-(arr[i+1]*arr[i-(arr[i]-1)]));

     }
      System.out.println(ans);
      t=t-1;
    }
 }
 static void quickSortInAscendingOrder (int[] numbers, int low, int high)
    {

        int i=low;
        int j=high;
        int temp;
        int middle=numbers[(low+high)/2];
 
        while (i<j)
        {
            while (numbers[i]<middle)
            {
                i++;
            }
            while (numbers[j]>middle)
            {
                j--;
            }
            if (i<=j)
            {
                temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
                i++;
                j--;
            }
        }
 
 
        if (low<j)
        {
            quickSortInAscendingOrder(numbers, low, j);
        }
        if (i<high)
        {
            quickSortInAscendingOrder(numbers, i, high);
        }
    }
 
}
