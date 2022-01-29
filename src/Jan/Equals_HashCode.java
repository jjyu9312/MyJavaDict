package Jan;

public class Equals_HashCode {
    public static void main(String[] args) {

        Book book_1 = new Book();
        book_1.setBookName("불편한 편의점");
        book_1.setBookPrice(15000);

        Book book_2 = new Book();
        book_2.setBookName("불편한 편의점");
        book_2.setBookPrice(15000);

        System.out.println("book_1.equals(book_2) : " + book_1.equals(book_2)); // false
        // euqals는 단순히 참조 값 즉, 객체의 주소 값이 같은 지 확인

        System.out.println("book_1.hashCode : " + book_1.hashCode());
        System.out.println("book_2.hashCode : " + book_2.hashCode());
        // hashCode는 객체의 메모리 주소를 이용해서 해시코드를 만들어 리턴

        book_1.setBookName("달러구트 꿈 백화점");
        book_1.setBookPrice(20000);

        System.out.println("=========== 값이 변경된 book_1 =============");
        System.out.println("book_1.hashCode : " + book_1.hashCode());
        // book_1의 값이 변경되어도 hashCode 값은 동일 ==> 결국 같은 객체의 book_1 주소를 리턴하기 때문에
    }
}
