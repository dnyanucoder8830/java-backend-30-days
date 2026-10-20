public class Payment {
    public void pay(){
        System.out.println("payment done by upi Method");
    }
}
class card extends Payment{
    public void pay(){
        System.out.println("Payment done by card method");
    }
}
class Poly{
    public static void main(String[] args) {
        Payment obj=new card();
        obj.pay();
    }
}
