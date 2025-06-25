import java.util.*;
public class Sortingg {

    public static void printArray(int arr[]){
        System.out.println(" SORTED NUMBERS ARE  :   ");
        for(int i=0;i<arr.length;i++)
        {
            
            System.out.println(arr[i]);;
      }

    }

    public static void main(String []args){
        int arr[]={7,4,6,5,9};

        for(int i=0;i<arr.length-1;i++){       // loop for going from first index to last index
            for(int j=0;j<arr.length-i-1;j++){      // as elemts will be sorted from last position we do not compare with it so remove the last elemnt as (-i)
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        
        
        }
               printArray(arr);


        }  
}