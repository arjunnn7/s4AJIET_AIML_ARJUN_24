public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 78, 30};

        int largest = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}
