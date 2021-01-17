package app;
import stack.StringStack;

public class StackDemo {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        StringStack stack = new StringStack();
        for (int i=0; i < str.length(); i++){
            String letter = str.charAt(i) +"";
            stack.push(letter);
        }
        String reversedStr = "";
        while(!stack.isEmpty()){
            String letter = stack.pop();
            reversedStr = reversedStr + letter;
        }
        System.out.println(reversedStr);
    }
}
