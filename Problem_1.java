public class Problem_1 {
    // Problem 1: Multiples of 3 or 5

    public static int multiplesOf3Or5(int numbers) {
        int sum = 0;
        for (int i = 3; i <= numbers; i++) {
            if (i%3 == 0 || i%5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(multiplesOf3Or5(10));
        System.out.println(multiplesOf3Or5(49));
        System.out.println(multiplesOf3Or5(1000));
        System.out.println(multiplesOf3Or5(8456));
        System.out.println(multiplesOf3Or5(19564));
    }
    
}
