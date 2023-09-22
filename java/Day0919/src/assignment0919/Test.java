package assignment0919;

public class Test {

    public static void main(String[] args) {
        Share share = new Share();

        Thread num = new Thread(() -> {
            while (true) {
                share.makeNum();
            }
        });

        Thread letter = new Thread(() -> {
            while (true) {
                share.makeLetter();
            }
        });

        letter.start();
        num.start();


    }
}
