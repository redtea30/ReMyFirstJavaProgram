# 运算符

## 基本算术运算符

| 符号 | 作用 | 说明                                            |
| ---- | ---- | ----------------------------------------------- |
| +    | 加   | 参考小学一年级内容                              |
| -    | 减   | 参考小学一年级内容                              |
| *    | 乘   | 参考小学二年级内容,与“x”相同                    |
| /    | 除   | 与“÷”相同,注意:再java中两个整数相除结果还是整数 |
| %    | 取余 | 获取的是两个数据做除法的余数                    |

**加法+**

```java
int a = 3 + 4; // a的值为7

String s = "Hello" + "World"; // s的值为"HelloWorld"
```

**减法-**

```java 
int b = 5 - 2; // b的值为3

double c = 10.5 - 3.2; // c的值为7.3
```

**乘法***

```java
int d = 2 * 3; // d的值为6

double e = 1.5 * 4.2; // e的值为6.3
```

**除法/**

```java
int f = 6 / 2; // f的值为3,整数相除结果是整数

double g = 5.0 / 2.0; // g的值为2.5
```

**取余%**

```java
int h = 5 % 2; // h的值为1

double i = 7.5 % 2.1; // i的值为1.3
```

#### 案例与练习

**案例1：**

```
随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：

例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1

```

```java
/**
 * @author 尚硅谷-宋红康
 * @create 12:20
 */
class ArithmeticExer1 {
	public static void main(String[] args) {
		
		int num = 187;
		
		int bai = num / 100;
		int shi = num % 100 / 10;//int shi = num / 10 % 10;
		int ge = num % 10;
		
		System.out.println("百位为：" + bai);
		System.out.println("十位为：" + shi);
		System.out.println("个位为：" + ge);

	}
}
```

拓展：获取一个四位数的个位，十位，百位，千位

```java
/**
 * @author 尚硅谷-宋红康
 * @create 12:39
 */
public class ArithmeticExer01 {
    public static void main (String [] args) {
        //1.定义一个变量，赋值为一个四位数整数，例如1234
        int num = 1234;

        //2.通过运算操作求出个位，十位，百位，千位
        int ge = num % 10;
        int shi = num /10 % 10;
        int bai = num /100 % 10;
        int qian = num / 1000 % 10;

        System.out.println("个位上的数字是：" + ge);
        System.out.println("十位上的数字是：" + shi);
        System.out.println("百位上的数字是：" + bai);
        System.out.println("千位上的数字是：" + qian);
    }
}
```

**案例2：**为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？

```java
/**
 * @author 尚硅谷-宋红康
 * @create 17:47
 */
public class ArithmeticExer2 {
    public static void main(String[] args){
        int hours = 89;
        int day = hours / 24;
        int hour = hours % 24;
        System.out.println("为抵抗洪水，战士连续作战89小时：");
        System.out.println(hours + "是" + day + "天" + hour +"小时");
    }
}
```

练习1：算术运算符：自加、自减

```java
public class ArithmeticExer3{
    public static void main(String[] args){
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i="+i); //
        System.out.println("i1="+i1);//
        i = ++i1;
        System.out.print("i="+i);//
        System.out.println("i1="+i1);//
        i = i2--;
        System.out.print("i="+i);//
        System.out.println("i2="+i2);//
        i = --i2;
        System.out.print("i="+i);//
        System.out.println("i2="+i2);//
    }
}
```

练习2：

```java
System.out.println("5+5=" + 5 + 5); //打印结果是？ 5+5=55 
```

练习3：

```java
byte bb1 = 127;
bb1++;
System.out.println("bb1 = " + bb1);//-128
```

练习4：

```java
int i = 1;
int j = i++ + ++i * i++;
System.out.println("j = " + j);
```

练习5：（企业真题）写出下列程序的输出结果

```java
int i = 2;
int j = i++;
System.out.println(j);

int m = 2;
m = m++; //(1)先取b的值“2”放操作数栈 (2)m再自增,m=3 (3)再把操作数栈中的"2"赋值给m,m=2
System.out.println(m);
```



## 自增自减运算符

| 符号      | 作用                                         |
| --------- | -------------------------------------------- |
| 自增：++  | 放在某个变量前面或者后面，对变量自身的值加1  |
| 自减： -- | 放在某个变量前面或者后面，对变量自身的值减一 |

- `前++`,先自增1，后运算
- `后++`，先运算，后自增1



## 赋值运算符

| 符号 | 用法 | 作用       | 底层代码形式          |
| ---- | ---- | ---------- | --------------------- |
| +=   | a+=b | 加后赋值   | a = (a的类型)(a + b); |
| -=   | a-=b | 减后赋值   | a = (a的类型)(a - b); |
| *=   | a*=b | 乘后赋值   | a = (a的类型)(a * b); |
| /=   | a/=b | 除后赋值   | a = (a的类型)(a / b); |
| %=   | a%=b | 取余后赋值 | a = (a的类型)(a % b); |

**加后赋值+=**

```java
int a = 3;
a += 5; //相当于 a = a + 5; a的值变为8
```

**减后赋值-=**

```java
double b = 10.5; 
b -= 3.5; //相当于 b = b - 3.5; b的值变为7.0
```

**乘后赋值\*=** 

```java
int c = 4;
c *= 3; //相当于 c = c * 3; c的值变为12
```

**除后赋值/=**

```java
int d = 8;
d /= 2; //相当于 d = d / 2; d的值变为4
```

**取余后赋值%=**

```java
int e = 7;
e %= 2; //相当于 e = e % 2; e的值变为1
```







## 关系运算符

下图是每一种关系运算符的符号及作用，每一个关系运算符的结果都是boolean值（true、false）

| 符号 | 例子   | 作用               | 结果                         |
| ---- | ------ | ------------------ | ---------------------------- |
| >    | a > b  | 判断a是否大于b     | 成立返回true,不成立返回false |
| >=   | a >= b | 判断a是否大于等于b | 成立返回true,不成立返回false |
| <    | a < b  | 判断a是否小于b     | 成立返回true,不成立返回false |
| <=   | a <= b | 判断a是否小于等于b | 成立返回true,不成立返回false |
| ==   | a == b | 判断a是否等于b     | 成立返回true,不成立返回false |
| !=   | a != b | 判断a是否不等于b   | 成立返回true,不成立返回false |



演示：

```java
public class OperatorDemo4 {
public static void main(String[] args) {
// 目标：掌握关系运算符的基本使用。
int a = 10;
int b = 5;
boolean rs = a > b;
System.out.println(rs); // true
System.out.println(a >= b); // true
System.out.println(2 >= 2); // true
System.out.println(a < b); // false
System.out.println(a <= b); // false
System.out.println(2 <= 2); // true
System.out.println(a == b); // false
System.out.println(5 == 5); // true
// 注意了：判断是否相等一定是用 == ，=是用来赋值的。
System.out.println(a = b); // 5 报错
System.out.println(a != b); // true
System.out.println(10 != 10); // false
}
}
```



## 逻辑运算符

逻辑运算符是用来将多个条件放在一起运算，最终结果是true或者false

| 符号 | 称呼     | 例子             | 运算逻辑                                                     |                                        |
| ---- | -------- | ---------------- | ------------------------------------------------------------ | -------------------------------------- |
| &    | 逻辑与   | 2 > 1 & 3 < 2    | 多个条件必须是true,结果才是true;有一个是false,结果就是false  |                                        |
| \|   | 逻辑或   | 2 > 1 \| 3 > 5   | 多个条件中主要有一个是true。结果就是true                     |                                        |
| !    | 逻辑非   | !(2 > 1)         | 就是取反:你真我假,你假我真。                                 |                                        |
| ^    | 逻辑异或 | 2 > 1 ^ 3 > 1    | 前后条件的结果相同,就直接返回false,前后条件的结果不同,才返回true |                                        |
| &&   | 短路与   | 2 > 10 && 3 > 2  | 判断结果与"&"一样,过程不同:左边为false,右边就不执行          |                                        |
| \|\| | 短路或   | 2 > 1 \|\| 3 < 5 | 判断结果与"                                                  | "一样,过程不同:左边为true,右边就不执行 |

- 逻辑运算符，操作的都是boolean类型的变量或常量，而且运算得结果也是boolean类型的值。

- 运算符说明：
  - & 和 &&：表示"且"关系，当符号左右两边布尔值都是true时，结果才能为true。否则，为false。
  - | 和 || ：表示"或"关系，当符号两边布尔值有一边为true时，结果为true。当两边都为false时，结果为false
  - ! ：表示"非"关系，当变量布尔值为true时，结果为false。当变量布尔值为false时，结果为true。
  - ^ ：当符号左右两边布尔值不同时，结果为true。当两边布尔值相同时，结果为false。
    - 理解：`异或，追求的是“异”！`

- 逻辑运算符用于连接布尔型表达式，在Java中不可以写成 3 < x < 6，应该写成x > 3 & x < 6 。


- **区分“&”和“&&”：**

  - 相同点：如果符号左边是true，则二者都执行符号右边的操作

  - 不同点：& ： 如果符号左边是false,则继续执行符号右边的操作

  ​                     && ：如果符号左边是false,则不再继续执行符号右边的操作

  - 建议：开发中，推荐使用 && 

- **区分“|”和“||”：**


  - 相同点：如果符号左边是false，则二者都执行符号右边的操作

  - 不同点：| ： 如果符号左边是true，则继续执行符号右边的操作

    ​               || ：如果符号左边是true，则不再继续执行符号右边的操作

  - 建议：开发中，推荐使用 ||

 代码举例：

```java
public class LoginTest {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;

		// & 与，且；有false则false
		System.out.println((a > b) & (a > c)); 
		System.out.println((a > b) & (a < c)); 
		System.out.println((a < b) & (a > c)); 
		System.out.println((a < b) & (a < c)); 
		System.out.println("===============");
		// | 或；有true则true
		System.out.println((a > b) | (a > c)); 
		System.out.println((a > b) | (a < c)); 
		System.out.println((a < b) | (a > c));
		System.out.println((a < b) | (a < c));
		System.out.println("===============");
		// ^ 异或；相同为false，不同为true
		System.out.println((a > b) ^ (a > c));
		System.out.println((a > b) ^ (a < c)); 
		System.out.println((a < b) ^ (a > c)); 
		System.out.println((a < b) ^ (a < c)); 
		System.out.println("===============");
		// ! 非；非false则true，非true则false
		System.out.println(!false);
		System.out.println(!true);
        
        //&和&&的区别
        System.out.println((a > b) & (a++ > c)); 
        System.out.println("a = " + a);
        System.out.println((a > b) && (a++ > c)); 
        System.out.println("a = " + a);
        System.out.println((a == b) && (a++ > c)); 
        System.out.println("a = " + a);
        
        //|和||的区别
        System.out.println((a > b) | (a++ > c)); 
        System.out.println("a = " + a);
        System.out.println((a > b) || (a++ > c)); 
        System.out.println("a = " + a);
        System.out.println((a == b) || (a++ > c)); 
        System.out.println("a = " + a);
	}
}
```

### 案例与练习

**案例：**

```
1. 定义类 CompareLogicExer
2. 定义 main方法
3. 定义一个int类型变量a,变量b,都赋值为20
4. 定义boolean类型变量bo1 , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo1
5. 输出a的值,bo1的值
6. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
7. 输出b的值,bo2的值
```

```java
/**
 * @author 尚硅谷-宋红康
 * @create 12:42
 */
public class CompareLogicExer {
    public static void main(String[] args){
        int a = 20;
        int b = 20;
        boolean bo1 = ((++a % 3) == 0) && ((a++ % 7) == 0);
        System.out.println("bo1的值：" + bo1);
        System.out.println("a的值：" + a);
        System.out.println("----------------------------");
        
        boolean bo2 = ((b++ % 3) == 0) && ((++b % 7) == 0); 
        System.out.println("bo2的值：" + bo2);
        System.out.println("b的值：" + b);
    }
}
```

**练习1：**区分 & 和 && 

```java
int x = 1;
int y = 1;

if(x++ == 2 & ++y == 2){
	x = 7;
}
System.out.println("x=" + x + ",y=" + y);

```

```java
int x = 1,y = 1;

if(x++ == 2 && ++y == 2){
	x =7;
}
System.out.println("x="+x+",y="+y);

```

**练习2：**区分 | 和 ||

```java
int x = 1,y = 1;

if(x++==1 | ++y==1){
	x =7;
}
System.out.println("x="+x+",y="+y);

```

```java
int x = 1,y = 1;

if(x++==1 || ++y==1){
	x =7;
}
System.out.println("x="+x+",y="+y);

```

**练习3：**程序输出

```java
class  Test  {
	public static void main (String []  args)  {
		boolean x = true;
        boolean y = false;
        short z = 42;
        
        if ((z++ == 42) && (y = true)) {
            z++;
        }
        if ((x = false) || (++z == 45)) {
            z++;
        }

        System.out.println("z=" + z);
	}
}
```

```java
//结果为：
//z= 46
```

案例1：选手机

```java
public class Demo05 {
	public static void main(String[] args) {
		double size = 6.99;
		double neicun = 7;
		// 需求1:要求手机必须满足尺寸大于等于6.95，且内存必须大于等于8.
		boolean res1 = size >= 6.95 && neicun >= 8;
		System.out.println("当前手机是否满足需求1：" + res1);
		
		// 需求2:要求手机要么满足尺寸大于等于6.95，要么内存必须大于等于8.
		boolean res2 = size >= 6.95 || neicun >= 8;
		System.out.println("当前手机是否满足需求2：" + res2);
	}
}
```

案例2：	是闰年（is leap year?）

```java
import java.util.Scanner;
public class IsHeap {
	public static void main(String[] args) {
		// 能被4整除但不能被100整除，或者被400整除
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份");
		int year = sc.nextInt();
		// 能被4整除  year % 4 == 0
		// 不能被100 整除  year % 100 != 0
		// 能被400整除  year % 400 == 0
		boolean res = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println("你输入的" + year + "年是否是闰年呢？" + res);
	}
}
```





## 位运算符

**1.** 原码

原码是一种最简单的机器数表示法，其中最高位表示符号位，其余位表示该数的二进制的绝对值。

**2.** 反码

正数的反码与原码相同，而负数的反码是其原码除符号位外，按位取反的结果。

**3.** 补码

正数的补码等于其原码，而负数的补码等于其反码加1



| 符号 | 运算名称   | 运算规则                                        |
| ---- | ---------- | ----------------------------------------------- |
| &    | 按位与     | 两个操作数都是1,结果才是1。                     |
| \|   | 按位或     | 两个操作数任意一个是1,结果就是1。               |
| ^    | 按位异或   | 两个操作数相同,结果为0;两个操作数不同,结果为1。 |
| ~    | 按位非     | 操作数为1,结果为0;操作数为0,结果为1。           |
| <<   | 左移       | 右侧空位补0。                                   |
| >>   | 右移       | 左侧空位补最高位,即符号位。                     |
| >>>  | 无符号右移 | 左侧空位补0。                                   |

![Weixin Image_20230801193506](C:/Users/jksps/Pictures/Saved%20Pictures/Weixin%20Image_20230801193506.jpg)





## 三元运算符（条件运算符）

```java
condition ? exprIfTrue : exprIfFalse
//condition为真执行左边，反之
数据类型 变量名 = 关系表达式 ? 值1 : 值2; 1    
```

### 格式演示

```java
public class OperatorDemo6 {
public static void main(String[] args) {
// 目标：掌握三元运算符的基本使用。
double score = 58.5;
String rs = score >= 60 ? "成绩及格" : "成绩不及格";
System.out.println(rs);
// 需求2：找出2个整数中的较大值，并输出。
int a = 99;
int b = 69;
int max = a > b ? a : b;
System.out.println(max);
// 需求3：找3个整数中的较大值。
int i = 10;
int j = 45;
int k = 34;
// 找出2个整数中的较大值。
int temp = i > j ? i : j;
// 找出temp与k中的较大值。
int max2 = temp > k ? temp : k;
System.out.println(max2);
}
}
```

## 运算优先级

运算符有不同的优先级，所谓优先级就是在表达式运算中的运算符顺序。

上一行中的运算符总是优先于下一行的。

| 优先级 |    运算符说明    |             Java运算符             |
| ------ | :--------------: | :--------------------------------: |
| 1      |       括号       |          `()`、`[]`、`{}`          |
| 2      |      正负号      |              `+`、`-`              |
| 3      |    单元运算符    |       `++`、`--`、`~`、`！`        |
| 4      | 乘法、除法、求余 |           `*`、`/`、`%`            |
| 5      |    加法、减法    |              `+`、`-`              |
| 6      |    移位运算符    |         `<<`、`>>`、`>>>`          |
| 7      |    关系运算符    | `<`、`<=`、`>=`、`>`、`instanceof` |
| 8      |    等价运算符    |             `==`、`!=`             |
| 9      |      按位与      |                `&`                 |
| 10     |     按位异或     |                `^`                 |
| 11     |      按位或      |                `|`                 |
| 12     |      条件与      |                `&&`                |
| 13     |      条件或      |                `||`                |
| 14     |    三元运算符    |               `? :`                |
| 15     |    赋值运算符    | `=`、`+=`、`-=`、`*=`、`/=`、`%=`  |
| 16     |   位赋值运算符   |  `&=`、`|=`、`<<=`、`>>=`、`>>>=`  |

> 开发建议：
>
> 1. 不要过多的依赖运算的优先级来控制表达式的执行顺序，这样可读性太差，尽量`使用()来控制`表达式的执行顺序。
> 2. 不要把一个表达式写得过于复杂，如果一个表达式过于复杂，则把它`分成几步`来完成。例如：
>    ​ (num1 + num2) * 2 > num3 && num2 > num3 ? num3 : num1 + num2;

从图中我们发现，&&运算比||运算的优先级高，所以&&和||同时存在时，是先算&& 再算||；

比如下面的代码

```java
// 这里&&先算 相当于 true || false 结果为true
System.out.println(10 > 3 || 10 > 3 && 10 < 3); // true
```

最后给大家说一下，在实际开发中，其实我们很少考虑运算优先级， 因为如果你想让某些数据先运算，其实加 () 就可以了，这样阅读性更高。

```java
//有括号先算 相当于 true && false 结果为false
System.out.println((10 > 3 || 10 > 3) && 10 < 3); //false
```







## 补充

### 单目运算符

## 单目运算符

单目运算符是指只接受一个操作数的操作符，包括[赋值运算符](https://so.csdn.net/so/search?q=赋值运算符&spm=1001.2101.3001.7020)（=）、算术运算符（+ 、-、*、/）、逻辑运算符（|| 、&& 、！）、位逻辑运算符（& 、| 、^ 、~）、位移运算符（>>、<<）、关系运算符（> 、< 、==）、自增自减运算符（++ 、–）。

# 杂项

## 为什么2%3=2

[取模运算](https://zhidao.baidu.com/search?word=取模运算&fr=iknow_pc_qb_highlight)，又称求余运算或者模除运算。其[运算符](https://zhidao.baidu.com/search?word=运算符&fr=iknow_pc_qb_highlight)为%，形式为
a%b，其中a和b都是整数。
计算规则为，计算a除以b，得到的[余数](https://zhidao.baidu.com/search?word=余数&fr=iknow_pc_qb_highlight)就是取模的结果。
比如
100%17
100 = 17*5+15。
于是100%17 = 15。

类似的，
2÷3 = 0 …… 2。
即2 = 3*0+2。
于是 2%3=2。

**这里有一个规律，如果b>a>0，那么a%b=a。**



## Class Scanner

[java.lang.Object](../lang/Object.html)

java.util.Scanner

- All Implemented Interfaces:

  `Closeable`, `AutoCloseable`, `Iterator<String>`

------

public final class **Scanner** extends [Object](../lang/Object.html) implements [Iterator](Iterator.html)<[String](../lang/String.html)>, [Closeable](../io/Closeable.html)

A simple text scanner which can parse primitive types and strings using regular expressions.

A `Scanner` breaks its input into tokens using a delimiter pattern, which by default matches whitespace. The resulting tokens may then be converted into values of different types using the various `next` methods.

For example, this code allows a user to read a number from `System.in`:

> ```
>      Scanner sc = new Scanner(System.in);
>      int i = sc.nextInt();
>  
> ```

As another example, this code allows `long` types to be assigned from entries in a file `myNumbers`:

> ```
>       Scanner sc = new Scanner(new File("myNumbers"));
>       while (sc.hasNextLong()) {
>           long aLong = sc.nextLong();
>       }
>  
> ```

The scanner can also use delimiters other than whitespace. This example reads several items in from a string:

> ```
>      String input = "1 fish 2 fish red fish blue fish";
>      Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
>      System.out.println(s.nextInt());
>      System.out.println(s.nextInt());
>      System.out.println(s.next());
>      System.out.println(s.next());
>      s.close();
>  
> ```

prints the following output:

> ```
>      1
>      2
>      red
>      blue
>  
> ```

The same output can be generated with this code, which uses a regular expression to parse all four tokens at once:

> ```
>      String input = "1 fish 2 fish red fish blue fish";
>      Scanner s = new Scanner(input);
>      s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
>      MatchResult result = s.match();
>      for (int i=1; i<=result.groupCount(); i++)
>          System.out.println(result.group(i));
>      s.close();
>  
> ```

The default whitespace delimiter used by a scanner is as recognized by [`Character.isWhitespace()`](../lang/Character.html#isWhitespace(int)). The [`reset()`](#reset()) method will reset the value of the scanner's delimiter to the default whitespace delimiter regardless of whether it was previously changed.

A scanning operation may block waiting for input.

The [`next()`](#next()) and [`hasNext()`](#hasNext()) methods and their companion methods (such as [`nextInt()`](#nextInt()) and [`hasNextInt()`](#hasNextInt())) first skip any input that matches the delimiter pattern, and then attempt to return the next token. Both `hasNext()` and `next()` methods may block waiting for further input. Whether a `hasNext()` method blocks has no connection to whether or not its associated `next()` method will block. The [`tokens()`](#tokens()) method may also block waiting for input.

The [`findInLine()`](#findInLine(java.lang.String)), [`findWithinHorizon()`](#findWithinHorizon(java.lang.String,int)), [`skip()`](#skip(java.util.regex.Pattern)), and [`findAll()`](#findAll(java.util.regex.Pattern)) methods operate independently of the delimiter pattern. These methods will attempt to match the specified pattern with no regard to delimiters in the input and thus can be used in special circumstances where delimiters are not relevant. These methods may block waiting for more input.

When a scanner throws an [`InputMismatchException`](InputMismatchException.html), the scanner will not pass the token that caused the exception, so that it may be retrieved or skipped via some other method.

Depending upon the type of delimiting pattern, empty tokens may be returned. For example, the pattern `"\\s+"` will return no empty tokens since it matches multiple instances of the delimiter. The delimiting pattern `"\\s"` could return empty tokens since it only passes one space at a time.

A scanner can read text from any object which implements the [`Readable`](../lang/Readable.html) interface. If an invocation of the underlying readable's [`read()`](../lang/Readable.html#read(java.nio.CharBuffer)) method throws an [`IOException`](../io/IOException.html) then the scanner assumes that the end of the input has been reached. The most recent `IOException` thrown by the underlying readable can be retrieved via the [`ioException()`](#ioException()) method.

When a `Scanner` is closed, it will close its input source if the source implements the [`Closeable`](../io/Closeable.html) interface.

A `Scanner` is not safe for multithreaded use without external synchronization.

Unless otherwise mentioned, passing a `null` parameter into any method of a `Scanner` will cause a `NullPointerException` to be thrown.

A scanner will default to interpreting numbers as decimal unless a different radix has been set by using the [`useRadix(int)`](#useRadix(int)) method. The [`reset()`](#reset()) method will reset the value of the scanner's radix to `10` regardless of whether it was previously changed.
