package Bai12.palinrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalinromeCheck {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";

        System.out.println("String ban đầu: " + str);

        if (isPalindrome(str)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }
    }
    public static boolean isPalindrome(String string){
        string=string.replaceAll("[^a-zA-Z]", "").toLowerCase();
        Stack<Character> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.offer(string.charAt(i));
        }
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false; // Nếu có bất kỳ cặp nào khác nhau, trả về false
            }
        }

        return true;
    }
}
