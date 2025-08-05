public class Card extends Payment {
    public Card(String user) {
        super(user);
    }
    
    @Override
    public void pay(int amount){
        System.out.println("카드결제로" + amount + "원 결제 완료");
    }
}
