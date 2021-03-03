import java.util.Random;

public class MergeSort {

    public static void mergeSort(double[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        double[] left_side = new double[mid];
        double[] right_side = new double[n - mid];

        for (int i = 0; i < mid; i++) {
            left_side[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            right_side[i - mid] = a[i];
        }
        mergeSort(left_side, mid);
        mergeSort(right_side, n - mid);

        merge(a, left_side, right_side, mid, n - mid);
    }
    public static void merge(
            double[] a, double[] left_side, double[] right_side, int left_index, int right_index) {

        int i = 0;
        int j= 0;
        int k = 0;
        while (i < left_index && j < right_index) {
            if (left_side[i] <= right_side[j]) {
                a[k++] = left_side[i++];
            }
            else {
                a[k++] = right_side[j++];
            }
        }
        while (i < left_index) {
            a[k++] = left_side[i++];
        }
        while (j < right_index) {
            a[k++] = right_side[j++];
        }
    }

    public static void main(String[] args) {
        System.out.println("Running time (m/s) for Merge Sort: ");
        Random rand= new Random();
    //50k array size
        double [] arr50= new double[50000];
        for(int i=0; i<arr50.length;i++){
            arr50[i] =rand.nextDouble();
        }

        long start50k= System.currentTimeMillis();
        mergeSort(arr50, arr50.length);
        long finish50k= System.currentTimeMillis();
        long time50k= finish50k-start50k;
        System.out.println(" Run time of 500K: "+ time50k);

    // 100k array size
        double [] arr100= new double[100000];
        for(int i=0; i<arr100.length;i++){
            arr100[i] =rand.nextDouble();
        }
        long start100k= System.currentTimeMillis();
        mergeSort(arr100, arr100.length);
        long finish100k= System.currentTimeMillis();
        long time100k= finish100k-start100k;
        System.out.println(" Run time of 100K: "+ time100k);

    //150k array size
        double [] arr150= new double[150000];
        for(int i=0; i<arr150.length;i++){
            arr150[i] =rand.nextDouble();
        }
        long start150k= System.currentTimeMillis();
        mergeSort(arr150, arr150.length);
        long finish150k= System.currentTimeMillis();
        long time150k= finish150k - start150k;
        System.out.println(" Run time of 150K: "+ time150k);

    //200k array size
        double [] arr200 = new double[200000];
        for (int i = 0; i < arr200.length; i++) {
            arr200[i] = rand.nextDouble();
        }
        long start200k= System.currentTimeMillis();
        mergeSort(arr200, arr200.length);
        long finish200k =System.currentTimeMillis();
        long time200k =finish200k - start200k;
        System.out.println("Run time of 200K: "+ time200k);

    //250k array size
        double [] arr250 = new double[250000];
        for (int i = 0; i < arr250.length; i++) {
            arr250[i] = rand.nextDouble();
        }
        long start250k= System.currentTimeMillis();

        mergeSort(arr250, arr250.length);
        long finish250k =System.currentTimeMillis();
        long time250k =finish250k - start250k;
        System.out.println("Run time of 250K: "+ time250k);

    //300k array size   ////////////////////////////////////////////////////////////

        double [] arr300 = new double[300000];
        for (int i = 0; i < arr300.length; i++) {
            arr300[i] = rand.nextDouble();
        }
        long start300k= System.currentTimeMillis();

        mergeSort(arr300, arr300.length);
        long finish300k =System.currentTimeMillis();
        long time300k =finish300k-start300k;
        System.out.println("Run time of 300K: "+ time300k);

    //350k array size
        double [] arr350 = new double[350000];
        for (int i = 0; i < arr350.length; i++) {
            arr350[i] = rand.nextDouble();
        }
        long start350k= System.currentTimeMillis();
        mergeSort(arr350, arr350.length);
        long finish350k =System.currentTimeMillis();
        long time350k =finish350k-start350k;
        System.out.println("Run time of 350K: "+ time350k);

    //400k array size
        double [] arr400 = new double[400000];
        for (int i = 0; i < arr400.length; i++) {
            arr400[i] = rand.nextDouble();
        }
        long start400k= System.currentTimeMillis();

        mergeSort(arr400, arr400.length);
        long finish400k =System.currentTimeMillis();
        long time400k =finish400k-start400k;
        System.out.println("Run time of 400K: "+ time400k);

    //450k array size
        double [] arr450 = new double[450000];
        for (int i = 0; i < arr450.length; i++) {
            arr450[i] = rand.nextDouble();
        }
        long start450k= System.currentTimeMillis();
        mergeSort(arr450, arr450.length);
        long finish450k =System.currentTimeMillis();
        long time450k =finish450k-start450k;
        System.out.println("Run time of 450K: "+ time450k);

    //500k array size
        double [] arr500 = new double[500000];
        for (int i = 0; i < arr500.length; i++) {
            arr500[i] = rand.nextDouble();
        }
        long start500k= System.currentTimeMillis();

        mergeSort(arr500, arr500.length);
        long finish500k =System.currentTimeMillis();
        long time500k =finish500k-start500k;
        System.out.println("Run time of 500K: "+ time500k);
    }
}
