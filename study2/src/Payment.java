//추상클래스 클래스의 설명서
abstract class Payment {
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    //생성자
    public Payment(String user) {
        this.user = user;
    }

    //해당 추상클래스를 상속받은 모든 클래스의 공통적인 기능
    public void startPayment() {
        System.out.println(user + "님 결제가 시작됩니다.");
    }

    //추상 메서드
    //해당 추상클래스를 상속받은 클래스마다 기능이 다를떄 단순 추상메서드로써 선언됨
    public abstract void pay(int amount);
}
