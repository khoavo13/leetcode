public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args){
        String[] testCase = {"ABCCBA", "a", ""};

        for (int k = 0; k < testCase.length; k++) {
            System.out.println("Test Case: " + (k + 1));
            System.out.println("\tThe input string is '" + testCase[k] + "' and the length of the string is " + testCase[k].length() + ".");
            System.out.println("\nIs it a palindrome?..... " + isPalindrome(testCase[k]));
        }
    }
}
