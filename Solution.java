public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.isPrime(2)); // true
        System.out.println(Solution.isPrime(0)); // false;
        System.out.println(Solution.isPrime(1)); // false
        System.out.println(Solution.isPrime(31)); // true



    }

    public static boolean isPrime(int num){
        boolean isPrime = true;

        if(num < 2){
            return false;
        }

        for(int i = 2 ; i < 10 ; i++){

            if(num % i == 0 && num != i){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
