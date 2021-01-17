package app;

import stack.StringStack;

public class CheckBrackets {
    //TODO rozszerz funkcję o sprawdzenie pozostałych rodzajów nawiasów:{} i []
    public static boolean checkBrackets(String s) {
        StringStack stack = new StringStack();
        for (int i = 0; i < s.length(); i++) {
            String letter = s.charAt(i) + "";
            switch (letter) {
                case "(":
                    stack.push("(");
                    break;
                case ")":
                    if (stack.isEmpty()){
                        return false;
                    }
                    stack.pop();
                    break;
                default:
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String str = "(A+B)-45*(V-a/6)/6+7)";
        System.out.println(checkBrackets(str));
    }
}
