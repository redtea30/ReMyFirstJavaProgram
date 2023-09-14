package assignment0914;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class NorthernExpeditionMemorial {
    public static void main(String[] args) {
        String path = "Day0914/src/assignment0914/cbs.txt";
        String dest1 = "Day0914/src/assignment0914/resorted.txt";
        NorthernExpeditionMemorial nem = new NorthernExpeditionMemorial();
        nem.readerWriterSort(path, dest1);


    }

    private void readerWriterSort(String src1, String dest1) {
        File path = new File(src1);
        File dest = new File(dest1);
        if (!path.exists()) {
            throw new IllegalStateException();
        } else if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }

        ArrayList<String> list = new ArrayList<String>();
        try (FileReader reader = new FileReader(path);
             BufferedReader br = new BufferedReader(reader);) {
            String temp = "";
            //循环写入list
            while ((temp = br.readLine()) != null) {
                if (temp != null) {
                    list.add(temp);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //对字符串排序
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int int1 = Integer.parseInt(String.valueOf(o1.charAt(0)));
                int int2 = Integer.parseInt(String.valueOf(o2.charAt(0)));
                return int1 - int2;
            }
        });

        list.trimToSize();
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        try (FileWriter fw = new FileWriter(dest);
             BufferedWriter bw = new BufferedWriter(fw);
        ) {
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i));
                bw.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
