import java.util.Random;

public class QuickSort {
    public static int partition(double arr[], int left, int right) {
        double pivot = arr[right];
        int i = (left-1); // index of smaller element
        for (int j=left; j<right; j++)
        {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;

        return i+1;
    }

    //function for quicksort
    public static void quickSort(double arr[], int left, int right) {
        if (left < right)
        {
			/* pi is partitioning index, arr[pi] is
			now at right place */
            int pi = partition(arr, left, right);

            // Recursively sort elements before partition and after partition
            quickSort(arr, left, pi-1);
            quickSort(arr, pi+1, right);
        }
    }

    public static void main(String[] args) {
        System.out.println("Running time (m/s) for Quick Sort: ");
        Random rand= new Random();
        //50k array size
        double [] arr50= new double[50000];
        for(int i=0; i<arr50.length;i++){
            arr50[i] =rand.nextDouble();
        }

        long start50k= System.currentTimeMillis();
        quickSort(arr50,0,arr50.length-1);
        long finish50k= System.currentTimeMillis();
        long time50k= finish50k-start50k;
        System.out.println("Run time of 500K: "+ time50k);

        // 100k array size
        double [] arr100= new double[100000];
        for(int i=0; i<arr100.length;i++){
            arr100[i] =rand.nextDouble();
        }
        long start100k= System.currentTimeMillis();
        quickSort(arr100,0,arr100.length-1);
        long finish100k= System.currentTimeMillis();
        long time100k= finish100k-start100k;
        System.out.println("Run time of 100K: "+ time100k);

        //150k array size
        double [] arr150= new double[150000];
        for(int i=0; i<arr150.length;i++){
            arr150[i] =rand.nextDouble();
        }
        long start150k= System.currentTimeMillis();
        quickSort(arr150, 0,arr150.length-1);
        long finish150k= System.currentTimeMillis();
        long time150k= finish150k - start150k;
        System.out.println("Run time of 150K: "+ time150k);

        //200k array size
        double [] arr200 = new double[200000];
        for (int i = 0; i < arr200.length; i++) {
            arr200[i] = rand.nextDouble();
        }
        long start200k= System.currentTimeMillis();
        quickSort(arr200,0, arr200.length-1);
        long finish200k =System.currentTimeMillis();
        long time200k =finish200k - start200k;
        System.out.println("Run time of 200K: "+ time200k);

        //250k array size
        double [] arr250 = new double[250000];
        for (int i = 0; i < arr250.length; i++) {
            arr250[i] = rand.nextDouble();
        }
        long start250k= System.currentTimeMillis();
        quickSort(arr250, 0,arr250.length-1);
        long finish250k =System.currentTimeMillis();
        long time250k =finish250k - start250k;
        System.out.println("Run time of 250K: "+ time250k);

        //300k array size   ////////////////////////////////////////////////////////////

        double [] arr300 = new double[300000];
        for (int i = 0; i < arr300.length; i++) {
            arr300[i] = rand.nextDouble();
        }
        long start300k= System.currentTimeMillis();
        quickSort(arr300, 0, arr300.length-1);
        long finish300k =System.currentTimeMillis();
        long time300k =finish300k-start300k;
        System.out.println("Run time of 300K: "+ time300k);

        //350k array size
        double [] arr350 = new double[350000];
        for (int i = 0; i < arr350.length; i++) {
            arr350[i] = rand.nextDouble();
        }
        long start350k= System.currentTimeMillis();
        quickSort(arr350,0, arr350.length-1);
        long finish350k =System.currentTimeMillis();
        long time350k =finish350k-start350k;
        System.out.println("Run time of 350K: "+ time350k);

        //400k array size
        double [] arr400 = new double[400000];
        for (int i = 0; i < arr400.length; i++) {
            arr400[i] = rand.nextDouble();
        }
        long start400k= System.currentTimeMillis();
        quickSort(arr400,0, arr400.length-1);
        long finish400k =System.currentTimeMillis();
        long time400k =finish400k-start400k;
        System.out.println("Run time of 400K: "+ time400k);

        //450k array size
        double [] arr450 = new double[450000];
        for (int i = 0; i < arr450.length; i++) {
            arr450[i] = rand.nextDouble();
        }
        long start450k= System.currentTimeMillis();
        quickSort(arr450, 0, arr450.length-1);
        long finish450k =System.currentTimeMillis();
        long time450k =finish450k-start450k;
        System.out.println("Run time of 450K: "+ time450k);

        //500k array size
        double [] arr500 = new double[500000];
        for (int i = 0; i < arr500.length; i++) {
            arr500[i] = rand.nextDouble();
        }
        long start500k= System.currentTimeMillis();
        quickSort(arr500,0, arr500.length-1);
        long finish500k =System.currentTimeMillis();
        long time500k =finish500k-start500k;
        System.out.println("Run time of 500K: "+ time500k);
    }
}
