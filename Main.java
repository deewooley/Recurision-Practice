public class Main {
    //reverse String in java

    public static String reverseString(String original){
        if(original.length()<2){
            return original;
        }return reverseString(original.substring(1))+original.charAt(0);
    }
    public static void main(String[] args) {
        String reverse = "hello";
        //Library Method
        StringBuilder string1 = new StringBuilder(reverse).reverse();
        System.out.println(string1);


        //Iterative
        String output = "";
        for(int i = reverse.length()-1; i>=0; i--){
         output+=reverse.charAt(i);
        }
        System.out.println(output);


        //Recursion
        System.out.println(reverseString(reverse));

    }

}
