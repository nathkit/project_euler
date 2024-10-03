public class Problem_2 {

    // Calculate the sum of even Fibonacci numbers up to the limit n
    public static int fiboEvenSum(int n) {
        int a = 1, b = 2, sum = 0;

        while (b <= n) {
            if (b%2 == 0) {
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fiboEvenSum(10));       // Output: 10 (2 + 8)
        System.out.println(fiboEvenSum(34));       // Output: 44 (2 + 8 + 34)
        System.out.println(fiboEvenSum(60));       // Output: 44 (2 + 8 + 34)
        System.out.println(fiboEvenSum(1000));     // Output: 798 (2 + 8 + 34 + 144 + 610)
        System.out.println(fiboEvenSum(100000));   // Output: 60696
        System.out.println(fiboEvenSum(4000000));  // Output: 4613732
    }
}
