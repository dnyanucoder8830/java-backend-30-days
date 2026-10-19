public class EvenOdd {
        public void Test(int a){
            if(a%2==0){
                System.out.println("the given number is  even");
            }else{
                System.out.println("the given number is odd");
            }
        }
    }
    class A {
        public static void main(String[] args) {
            EvenOdd obj = new EvenOdd();
            obj.Test(11);
        }
    }
