public class Fabonacci {
    public static void main(String[] args) {
        int numbers= 200; //200 numbers.
        fibo(numbers);
    }

    private static void fibo(int number){
        long series[]= new long[number];
        series[0] = 0;
        series[1] = 1;

        for (int i = 2; i < number; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        System.out.println("******************************************************************************************************************************");
        System.out.println("************************************************ Fibonanci Series *************************************************************");
        for (int i = 0; i < series.length; i++) {
            System.out.printf("No.%3d: %-22d".trim(), i + 1, series[i]);//Displays the fibonacci series without whitspace

            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n******************************************************************************************************************************");

    }
}