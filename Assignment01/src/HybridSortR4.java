import java.util.Arrays;
import java.util.Random;

public class HybridSortR4{
    public static int THRESHOLD= 10;
    public void hybridSort (double [] arr, int left, int right){
    if(right-left <= THRESHOLD){
        System.out.println("Uses quadratic");
        quadraticSort(arr, left,right);

    }
    else{
        System.out.println("Uses quick");
        quickSort(arr, left,right);
    }
    }

    public static int partition(double[] arr, int left, int right) {
        //create random pivot
        int pivotI = new Random().nextInt(right-left)+ left;
        double pivotElement= arr[pivotI];

        //print the pivot
        System.out.println("The pivot is:" + pivotElement);

        double temp= pivotElement;
        arr[pivotI]= arr[right];
        arr[right]=temp;
        int j = (right-1);
        int i=left;
        while (i <= j) {
            while (i <= right && arr[i] < pivotElement)
                i++;
            while (j >= left && arr[j] >= pivotElement)
                j--;
            if(i > j)
                break;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        if (i > j) {
            temp = arr[i];
            arr[i] = arr[right];
            arr[right] = temp;
        }
        // replace i with right
        return i;
    }

    public void quickSort(double[] arr, int left, int right) {
        if (left < right)
        {
            int pi = partition(arr, left, right);

            // Recursively sort elements before partition and after partition
            quickSort(arr, left, pi-1);
            quickSort(arr, pi+1, right);
        }
    }
    public void quadraticSort (double [] arr, int left, int right){
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) { //0(n)
            int minElement = i; //find minimum element
            for (int j = i + 1; j < arr.length; j++) { //0(n)
                if (arr[j] < arr[minElement]) {
                    minElement = j;
                }
            }
            //swapping
            double k = arr[minElement];
            arr[minElement] = arr[i];
            arr[i] = k;

            if(left +1< right){
                quadraticSort(arr, left+1, right);
            }
        }
    }

    public static void main(String[] args) {
        HybridSortR4 hs = new HybridSortR4();
        double[] input= { 5, 2, 9, 12, 6, 8, 3, 7};
        hs.hybridSort(input, 0,input.length-1);
       System.out.println(Arrays.toString(input));
    }
}
