import java.util.Scanner;
public class SecondLargest {
    public static int findsl(int[] arr,int n){
           if (n<2)
               return -1;
           int largest=0;
           int secondlargest=-1;
           for(int i=1;i<n;i++){
                if(arr[i]>=arr[largest]){
                     secondlargest=largest;
                     largest=i;
                  }
             else if (arr[i] < arr[largest]) {
                if (secondlargest == -1 || arr[i] > arr[secondlargest]) {
                    secondlargest = i;
                }
              }
            }
            if (secondlargest == -1)
                return -1;
             return arr[secondlargest];
      }
    public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            int n =sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
               }
             System.out.println(findsl(arr,n));
}
}
