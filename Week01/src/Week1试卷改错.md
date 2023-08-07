



## 1. 编译一个已经完成的java源代码，需要哪些指令



```shell
javac test.java
# 源文件转字节码文件

java test.class
# 执行字节码文件
```

## 2. java关键字



| abstract | assert | boolean | break | byte |
| -------- | ------ | ------- | ----- | ---- |
| case | catch | char | class | countinue |
| default | do | double | else | enum |
| extends | final | float | for | if |
| implements | import | int | interface | instanceof |
| long | native | new | package | private |
| protected | public | return | short | static |
| stricfp | super | switch | sychronized | this |
| thow | throws | transient | try | void |
| volatile | while |  |  |  |
| 保留字 | goto | const |  |  |
| 特殊直接量 | true | false | null | |



## 6. 浮点数运算

```java
float x = 10 / 4;
# 缺少强转
x = 2.0;

```

## 7. (byte)131

转换机制没搞明白，老师的原话是 127 +1 变成-128

然后在-128~127之间循环


--------------------------------
负数运算相关
byte的取值范围-128~127
取值为-128时二进制表示为

```
127
0111,1111 +1
=
-128
1000，0000(原码)
1111，1111(反码)
1000，0000（补码+1）
```

（byte）131的数字为-128+3,复数的运算通过补码进行运算
```
1000，0000 +
0000,0011
----------------------------------------------------------------
1000,0011(补码)
1000，0010（反码-1）
1111，1101（原码）
----------------------------------------------------------------

```

## 11. 计算（-3|2）&（-2>>3）的结果

涉及负数运算，位运算
```
知识点
负数的运算通过其补码进行运算
>> 右移 左侧空位补最高位，即符号位
<< 左移 右侧空位补0。
```

```java
-3
1000,0011原
1111，1100反        
1111，1101补        
2
0000,0010
|
1111，1111补
1111，1110反
1000，0001原
-1

-2
1000,0010原
1111，1101反
1111，1110补
>>3  //右移时最高位补充符号位
1111，1111补
1111，1110反
1000，0001原
-1

-1
1111，1111补
&
-1
1111，1111补
=
1111，1111补
1111，1110反
1000，0001原
-1
```

## 12. char ch1 ='A' , ch2 ='W';
if (ch1 +2 < ch2)) ++ch1;
ch1的值是多少

ch1 ='B"


## 16. int i =2, j = 3;
if (j % i < j)i++;
else j++;

执行完之后i的值是，3

MD，if条件里的比较就是表达式，不是运算顺序

## 17、下列语句序列执行后，k的值是B
```java
int i゠1,j゠2, k゠3
switch (i «‹ j){
    case 2:
        K++;
        break;
    default:
        K+=K++;
    case 3:
        ++K;
        break;
}        
A. 4
B. 5
C. 6
D. 7
```
虽然执行的是defalut，但是default里面没有break,所以还会继续执行case3

## 21、请解释&和&&，|和 ||的区别?

& 和 &&,| 和 || 这两个操作符组合分别表示逻辑与、逻辑或运算,但有一点细微的差别:

1. & 和 | 是位运算符,操作的是两个整数的二进制形式。

- & 按位与,两个位都为1才为1。

- | 按位或,两个位有一个为1就为1。

2. && 和 || 是逻辑运算符,操作的是两个布尔值。

- && 逻辑与,两个值都为true才为true。

- || 逻辑或,两个值有一个为true就为true。

3. 位运算符是按位比较,逻辑运算符是整体判断。

4. 位运算符更底层,直接操作位。逻辑运算符更高层,操作值。

5. & 和 | 两边可以是整数,&& 和 || 两边必须是布尔型。

6. & 和 | 的优先级低于 && 和 ||。

总结:

- & 和 | 是位运算符,&& 和 || 是逻辑运算符。

- 位运算符操作位,逻辑运算符操作值。

- 位运算符更底层,但优先级更低。

- 在使用上要明确两者的区别。



## 22. switch 语句表达式支持的数据类型
在 Java 中,switch 语句的表达式支持以下几种数据类型:

- byte
- short
- char
- int
- 枚举类型(enum)
- String 类型(从 Java 7 开始)

从 Java 5 开始,switch 支持 String 类型之前,表达式数据类型仅限于 byte、short、char、int这些基本数据类型和 enum 枚举类型。

switch 表达式的结果会和 case 语句进行匹配,匹配之后执行相应的代码块。匹配使用的是“==”比较,字节码指令为 tableswitch 和 lookupswitch。

所以 switch 语句对数据类型是有要求的,表达式结果必须能够进行比较匹配。值得注意的是,switch 不支持 long 类型,因为 long 的值范围太大,无法建立查找表进行快速匹配。

总结一下,switch 表达式支持:

- byte、short、char、int基本数据类型
- 枚举 enum 类型
- String 字符串类型(Java 7及以上)

这几种类型可以直接进行相等匹配,从而进行条件判断。


## 23. java的基本数据类型

全小写
byte short int long 
char
boolean 
float double 

## 24. java中的break,continue 分别有什么意义？

在 Java 中,break 和 continue 都是循环控制语句,用于跳出或继续当前循环。

break 的作用是 完全跳出当前所在的循环,循环结束。

例如在一个 for 循环中:

```java
for (int i = 0; i < 10; i++) {
  if (i == 5) { 
    break; // 跳出循环
  }
  System.out.println(i);
}
```

当i等于5时,执行break语句,会完全跳出for循环,循环结束。

continue 的作用是 跳过当前循环中的剩余语句,继续下一次循环。

例如:

```java 
for (int i = 0; i < 10; i++) {
  if (i == 5) {
    continue; // 跳过当前循环继续下次循环
  }
  System.out.println(i); 
}
```

当i等于5时,执行continue语句,会跳过当前循环中剩余语句,直接继续下一次循环。

所以:

- break会完全结束循环
- continue会跳过当前循环的后续语句

它们在循环中控制程序流程非常有用。break常用于判断提前退出循环,continue常用于跳过满足某条件的迭代。








