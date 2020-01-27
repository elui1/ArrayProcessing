public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        double mean;

        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }

        mean = sum / array1.length;
        System.out.println(sum);
        System.out.printf("%.2f", mean);
    }
}
