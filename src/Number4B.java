public class Number4B {
    public static void main(String[] args) {
        // Using bubble sorrting algorithm
        int[] mybox={4, 3, 8, 5, 7, 2, 11, 3, 15, 1, 9};
        for (int i = 0; i < mybox.length - 1; i++) {
            for (int j = 0; j < mybox.length - 1 - i; j++) {
                if (mybox[j] < mybox[j + 1]) {
                    int temp = mybox[j];
                    mybox[j] = mybox[j + 1];
                    mybox[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Arrays in descending order:");
        System.out.print('{');
        for(int num:mybox){
            System.out.printf("%d ", num);
        }
        System.out.print("}\n");
    }
}
