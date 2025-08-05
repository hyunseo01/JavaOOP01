import java.util.ArrayList;

public class Library {
    public String name;
    public ArrayList<Book> books = new ArrayList<>();

    //생성자
    public Library(String name) {
        this.name = name;
    }

    // 책 추가
    // add()
    public void addBook(Book book) {
        books.add(book);
        System.out.println("책 " + book.getTitle() + " 이" + name + " 도서관에 등록됨");
    }

    // 책 목록 출력
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("도서관에 책이 없습니다");
        } else {
            System.out.println("보유중인 책 목록");
            for (int i = 0; i < books.size(); i++) {
                books.get(i).showBook();
            }
        }
    }

    // 책 대여
    public void borrowBook(String title) {
        boolean found = false; // 책을 찾았는지 여부
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                found = true;
                if (!book.isBorrowed()) {
                    book.setBorrowed(false);
                    System.out.println("책 \"" + title + "\"가 대여됨");
                } else {
                    System.out.println("책 \"" + title + "\"가 이미 대여 중");
                }
                break; // 책 찾았으니 반복문 종료
            }
        }
        if (!found) {
            System.out.println("책 \"" + title + "\"가 " + name + " 도서관에 없음");
        }
    }

    // 책 반납
    public void returnBook(String title) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                found = true;
                if (book.isBorrowed()) {
                    book.setBorrowed(false);
                    System.out.println("책 \"" + title + "\"가 반납됨");
                } else {
                    System.out.println("책 \"" + title + "\"는 대여 중이 아님");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("책 \"" + title + "\"가 " + name + " 도서관에 없음");
        }
    }
}
