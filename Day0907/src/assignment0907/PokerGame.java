package assignment0907;

import java.util.*;

/**
 * ClassName:PokerGame
 * Package: assignment0907
 * Description:
 *
 * @Author Neko
 * @Create 7/9/20237:35 pm
 * @Version 1.0
 */
public class PokerGame {
    private List playerList1 = new ArrayList();
    private List playerList2 = new ArrayList();
    private List playerList3 = new ArrayList();
    private List cardList = new ArrayList();

    public PokerGame() {
        String[] colors = {"♣", "♦", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (int i = 0; i < 4; i++) {
            String color = colors[i];
            for (int j = 0; j < 13; j++) {
                Poker poker = new Poker(numbers[j], color, j + 1);
                cardList.add(poker);
            }
        }
        Poker card1 = new Poker("", "🤡", 50);
        Poker card2 = new Poker("", "🃏", 100);

        Collections.addAll(cardList, card1, card2);
        Collections.shuffle(cardList);
    }

    public static void main(String[] args) {
        PokerGame game = new PokerGame();
        game.dealCards();
        game.orderCard();


    }


    /**
     * 发牌
     */
    private void dealCards() {
        System.out.println(" Deal Card ");
        for (int i = 0; i < 3; i++) {
            //Object 接受不正常，使用List就没问题
            List temp = cardList.subList(0 + (i * 18), 18 + (18 * i));
            switch (i) {
                case 0 -> playerList1 = temp;
                case 1 -> playerList2 = temp;
                case 2 -> playerList3 = temp;
            }
        }
        System.out.println(playerList1.toString());
        System.out.println(playerList2.toString());
        System.out.println(playerList3.toString());
        System.out.println("剩下的三张");
        System.out.println(cardList.subList(51, 54).toString());
    }

    private void orderCard() {
        System.out.println("TreeSet ");
        TreeSet player1 = new TreeSet(playerList1);
        TreeSet player2 = new TreeSet(playerList2);
        TreeSet player3 = new TreeSet(playerList3);
        System.out.println(player1.toString());
        System.out.println(player2.toString());
        System.out.println(player3.toString());

        System.out.println(" Collections Sort Card ");
        Collections.sort(playerList1);
        Collections.sort(playerList2);
        Collections.sort(playerList3);
        System.out.println(playerList1.toString());
        System.out.println(playerList2.toString());
        System.out.println(playerList3.toString());

    }


}
