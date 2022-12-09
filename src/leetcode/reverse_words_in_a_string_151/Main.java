package leetcode.reverse_words_in_a_string_151;

public class Main {
    public String reverseWords(String s) {
        String[] arr = s.split(" +");
        String string = "";
        for (int i = arr.length - 1; i > -1; i--) {
            string = string + arr[i] + " ";
        }
        return string.trim();
    }
}
