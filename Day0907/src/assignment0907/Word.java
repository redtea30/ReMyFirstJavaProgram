package assignment0907;

import java.util.Collections;
import java.util.HashSet;

/**
 * ClassName:Word
 * Package: assignment0907
 * Description:
 *
 * @Author Neko
 * @Create 7/9/20239:10 pm
 * @Version 1.0
 */
public class Word implements Comparable {
    String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(Object o) {
        Word word1 = (Word) this;
        Word word2 = (Word) o;
        if (word1.word.length() == word2.word.length()) return -1;
        return word1.word.length() - word2.word.length();
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Word word1 = new Word("congratulations");
        Word word2 = new Word("rambus");
        Word word3 = new Word("lancer");
        Word word4 = new Word("caster");
        Word word5 = new Word("caber");
        Word word6 = new Word("june");

        HashSet hs= new HashSet();
        hs.add(word1);
        hs.add(word2);
        hs.add(word3);
        hs.add(word4);
        hs.add(word5);
        hs.add(word6);
        System.out.println(hs.size());

        System.out.println(Collections.max(hs).toString());

    }


}

