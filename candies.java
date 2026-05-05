public class Main {
    public static void main(String[] args) {
        int n = 10;
        int k = 5;  
        int order = 3;
        if (order>0 &&order<=n) {
            System.out.println("Number of Candies Sold:"+order);
            n=n-order;
            if(n<=k) {
                n = 10;
            }
            System.out.println("Number of Candies available:"+n);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
