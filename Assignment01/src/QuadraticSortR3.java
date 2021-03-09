import java.util.Arrays;

public class QuadraticSortR3 {
    public void quadraticsort (double [] arr, int left, int right){
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
                quadraticsort(arr, left+1, right);
            }
        }
    }
    public static void main(String[] args) {
        QuadraticSortR3 qs = new QuadraticSortR3();
        double[] input= { 5, 2, 9, 12, 6, 8, 3, 7};

        qs.quadraticsort(input, 0,input.length-1);
        System.out.println(Arrays.toString(input));
    }
}
