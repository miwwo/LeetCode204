 class Solution{
    public static int countPrimes(int n){
        if (n<=2) return 0;
        int count = 1; // 2 is a prime number
        boolean[] isNotPrime = new boolean[n];
        int middle = (int) Math.sqrt(n);
        for (int i = 3; i < n; i = i+2) {
            if (isNotPrime[i])
                continue;
            count++;
            if (i > middle) continue;
            for (int j = i * i; j < n; j = j + 2 * i) {
                isNotPrime[j] = true;
            }
        }

        return count;
    }

}


public class Main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Solution.countPrimes(n));
    }
}