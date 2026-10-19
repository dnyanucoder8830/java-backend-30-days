public class LargestNum {
    public static void main(String[] args) {

        int a = 15;
        int b = 28;
        int c = 19;

        if (a > b) {
            if (a > c) {
                System.out.println("The Largest number is"+a);
            }
        } else if (b>a) {
            if(b>c){
                System.out.println("The Largest number is"+b);
            }
        } else if (c>a) {
            if(c>b){
                System.out.println("TheLargest number is"+c);
            }

        }
    }
}
