import java.util.Random;
import java.util.Arrays;
public class QuickSort2 {

    public static int partition(double[] arr, int left, int right) {
        //create random pivot
        int pivotI = new Random().nextInt(right-left)+ left;
        double pivotElement= arr[pivotI];

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
            System.out.println("The index is:" + pi);
        }
    }


    public static void main(String[] args) {
        QuickSort2 qs= new QuickSort2();
        double[] input= new double[]{ 5, 2, 9, 12, 6, 8, 3, 7};
        qs.quickSort(input, 0,input.length-1);
        System.out.println(Arrays.toString(input));
    }

}
