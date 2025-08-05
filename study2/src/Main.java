public class Main {
    public static void main(String[] args) {
        //업캐스팅
        Payment p1 = new Card("alice");
        //다운캐스팅
        Bank p2 = new Bank("bob");

        p1.startPayment();
        p1.pay(2000);

        p2.startPayment();
        p2.pay(1000);
    }
}
