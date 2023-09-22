/**
 * ClassName:ReversePrint
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 10/8/202310:52 am
 * @Version 1.0
 */
public class ReverseArrayPrint {
    public static void main(String[] args) {
        char[][] poem = {
                {'十', '年', '生', '死', '两', '茫', '茫', ',', '不', '思', '量', ',', '自', '难', '忘', '。'},
                {'千', '里', '孤', '坟', ',', '无', '处', '话', '凄', '凉', '。'},
                {'纵', '使', '相', '逢', '应', '不', '识', ',', '尘', '满', '面', ',', '鬓', '如', '霜', '。'},
                {'夜', '来', '幽', '梦', '忽', '还', '乡', ',', '小', '轩', '窗', ',', '正', '梳', '妆', '。'},
                {'相', '顾', '无', '言', ',', '惟', '有', '泪', '千', '行', '。'},
                {'料', '得', '年', '年', '肠', '断', '处', ',', '明', '月', '夜', ',', '短', '松', '冈', '。'}
        };

        int maxLength = 0;
        for (int i = 0; i < poem.length; i++) {
            if (poem[i].length > maxLength) ;
            maxLength = poem[i].length;
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = poem.length - 1; j >= 0; j--) {//注意数组的取值范围
                if (i < poem[j].length) {
                    System.out.print(poem[j][i] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
