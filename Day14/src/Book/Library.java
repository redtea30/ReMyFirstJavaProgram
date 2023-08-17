package Book;

/**
 * ClassName:Library
 * Package: Book
 * Description:
 *
 * @Author Neko
 * @Create 17/8/202311:33 am
 * @Version 1.0
 */
public class Library {
    private Book[] book;
    private int count;//计数，当前本数


    public Library() {
        this.count = 2;
        book = new Book[count];
        book[0] = new Book("大王的奋斗", "大王", 2020, 120);//这里创建对象
        book[1] = new Book("一阳指", "乌龟大师", 1999, 999);
    }

    public boolean addBook(Book book) {
        if(book == null)return false;

        int theLast = this.book.length - 1;

        //扩容+10
        if (this.book[theLast] != null) {
            Book[] temp = new Book[theLast + 1 + 1];
            for (int i = 0; i < theLast + 1; i++) {
                temp[i] = this.book[i];
            }
            this.book = temp;
        }


        //存书
        this.book[count++] = book;
        return true;
    }

    public Book searchBook(String title) {
        if (title != null) {
            for (int i = 0; i < count; i++) {
                boolean isTrue = title.equals(book[i].getTitle());
                if (isTrue) {
                    return book[i];
                }
            }
        }
        return null;
    }

    public void showAll() {
        System.out.println("title\tauthor\tyear\tprice");
        for (int i = 0; i < count; i++) {
            System.out.println(book[i].info());
        }
    }


}
