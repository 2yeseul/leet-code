public class Palindrome {
    public static boolean isPalindrome(int x) {
        String input = Integer.toString(x);
        int length = input.length();
        String front;
        String back;

        front = input.substring(0, length / 2);
        // 1001 1221
        if (length % 2 == 0) {
            back = input.substring((length / 2));
        }

        // 101
        else {
            back = input.substring((length / 2) + 1);
        }

        return front.equals(new StringBuffer(back).reverse()
                .toString());
    }

    public static void main(String[] args) {
        boolean result = isPalindrome(20023);
        System.out.println(result);
    }
}
