package assignment;

/**
 * ClassName:assignment.Heart
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/20237:58 pm
 * @Version 1.0
 */
public class Heart {
    public static void main(String[] args) {

        // 抄来的

        float x,y,a;
        for(y=1.3f;y>-1.1f;y-=0.06f){   //这里的参数皆可以调，条件就是看着顺眼
            for(x=-1.2f;x<=1.2f;x+=0.025f){
                a=x*x+y*y-1;
                System.out.print(a*a*a-x*x*y*y*y<=0.0f?'*':' ');//这里切换里面和外边显示
            }
            System.out.println();
        }
    }
}
