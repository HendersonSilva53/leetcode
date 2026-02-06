public class PalindromeNumber {
    public static boolean palindromeNumber(int x){
        if(x < 0){
            return false;
        }
        int cheq = 0;
        int num = x;

        while(num != 0){
            cheq = (cheq * 10) + (num % 10);
            num = (num / 10);
        }
        return (cheq == x);
    }

    public static void main(String[] args) {
        int x = 2;
        System.out.println(palindromeNumber(x));
    }
}
