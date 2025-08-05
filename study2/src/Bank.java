public class Bank extends Payment {
    public Bank(String user) {
        super(user);
    }

    @Override
    public void pay(int amount){
        System.out.println("계좌이체로" + amount + "원 결제 완료");
    }
}
