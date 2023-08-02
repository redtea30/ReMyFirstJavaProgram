# java 入门

## java技术平台

- JavaSE（Java Platform Standard Edition，java平台标准版）
- JavaEE (Java  Platform,Enterprise Edition，java平台企业版)
- JavaME (Java Platform Micro Edition，java平台微型版)。

## cmd常见命令

```shell
e: //切换到E盘
cd [目录] //进入指定的目录
cd .. //退回到上一级目录
cd / //退回到根目录
dir //显示当前目录下所有的内容
cls //清空屏幕

# shell文本注释
方式一：使用“<<! # 注释内容块 ！”注释多行代码。
方式二：在每行代码前面加上“#”注释单行代码。
```

### 拓展

```shell
# 关机、重启、注销、休眠、定时
关机：shutdown /s
重启：shutdown /r
注销：shutdown /l
休眠：shutdown /h /f
取消关机：shutdown /a
定时关机：shutdown /s /t 3600

# 目录操作
切换磁盘：d:（进入 d 盘）
切换磁盘和目录：cd /d d:/test（进入 d 盘 test 文件夹）
进入文件夹：cd \test1\test2（进入 test2 文件夹）
返回根目录：cd \
回到上级目录：cd ..
新建文件夹：md test

# 显示目录内容
显示目录中文件列表：dir
显示目录结构：tree d:\test（d 盘 test 目录）
显示当前目录位置：cd
显示指定磁盘的当前目录位置：cd d:

# 网络操作
延迟和丢包率：ping ip/域名
Ping 测试 5 次：ping ip/域名 -n 5
清除本地 DNS 缓存：ipconfig /flushdns
路由追踪：tracert ip/域名
# 进程/服务操作
进程管理：

显示当前正在运行的进程：tasklist
运行程序或命令：start 程序名
结束进程，按名称：taskkill /im notepad.exe（关闭记事本）
结束进程，按 PID：taskkill /pid 1234（关闭 PID 为 1234 的进程）
服务管理：

显示当前正在运行的服务：net start
启动指定服务：net start 服务名
停止指定服务：net stop 服务名
```

## 编写第一个java程序

第一步：新建一个后缀为`.java`的文本文件 `Helloworld.java`

```java
public class Helloworld {
public static void main(String[] args) {
System.out.println("hello world");
	}
}
```

第二步：进入 `HelloWorld.java` 文件所在目录，在地址栏输入cmd回车，即可在此处打开命令行窗口。

编译：在命令行窗口输入编译命令 `javac HelloWorld `完成编译，编译后会生成一个`HelloWorld.class` 文件。

**编译时选择输出utf-8格式代码**
```java
javac -encoding utf-8 Switch01.java
```

第三步：再接着输入 `java HelloWorld` 就可以运行了，运行结果如下。

## JDK的组成

●JVM(Java Virtual Machine):Java虚拟机，真正运行Java程序的地方。

●核心类库：Java自己写好的程序，给程序员自己的程序调用的。

●JRE(Java Runtime Environment):Java的运行环境。

● JDK(Java Development Kit):Java开发工具包(包括上面所有)。



## **javadoc** 命令的使用-文档注释转换

文档注释（Documentation Comments）是一种特殊的注释格式，用于为 Java 程序中的类、方法、字段等元素提供文档说明。文档注释以 /** 开始，以 */ 结束，可以包含多行描述性文本和标记。

| 记名        | 作用                                                  | 注意事项                                                     |
| ----------- | ----------------------------------------------------- | ------------------------------------------------------------ |
| @author     | 表名类的作者                                          | 只能用在类的标记文档中,按照时间顺序排列,即原始作者要排在前面 |
| @version    | 表名类的当前版本                                      | 只能用在类的标记文档中                                       |
| @param      | 表名方法的参数                                        | 只能用在方法标记文档中,如果方法没有输入参数,可以省略,如果有多个输入参数,要按照方法中输入参数的顺序进行排列 |
| @return     | 表名方法返回的参数                                    | 只能用在方法标记文档中,如果方法没有输出值,可以省略           |
| @throws     | 表名方法或类抛出的异常                                | 不抛出异常可以省略,抛出多个异常按照异常名称的首字母排列      |
| @see        | 引用其他类中的文档                                    |                                                              |
| @since      | 表名这个方法或类在哪个版本时添加的                    | 比@since更常用                                               |
| @deprecated | 表名这个方法已经被更新好的方法替代或被抛弃,不建议使用 | 在代码中使用被@deprecated标记的方法会收到编译器的警告        |



javadoc 命令语法格式如下：

```java
javadoc [options] [packagenames] [sourcefiles]
```

格式说明：

1）options 表示 javadoc 命令的选项；

2）packagenames 表示包名；

3）sourcefiles 表示源文件名。

在 打 开 控 制 台 后 ， 切 换 到 Calculator.java 文 件 所 在 目 录 下 ， 可 以 使 用 javadoc Calculator.java命令

## jlink命令生成JRE

众所周知，在JDK 8之后，默认不再提供单独的JRE。如果在项目中仍希望以JRE的形式发布软件，可以使用jlink命令生成自定义的JRE。jlink命令的格式如下：

```java
jlink [options] --module-path modulepath --add-modules [,module...]--output outputpath
```

参数解析：

1） modulepath：路径

2） module：模块名称

3） outputpath：输出路径

例如，可以在JDK目录下执行以下命令来使用jlink命令生成JRE：

# JAVA基础语法

```java
1.单行注释：
// 后面根解释文字
2.多行注释
/*
这里写注释文字
可以写多行
*/
3.文档注释
/**
这里写文档注释
也可以写多行，文档注释可以利用JDK的工具生成帮助文档
*/
```

快捷键

```java
Ctrl + / 单行注释（对当前行进行注释）
Ctrl + Shift + / 对选中的代码进行多行注释。
```

## 字面量

| 常用数据 | 生活中的写法 | 程序中的写法      | 说明                                  |
| -------- | ------------ | ----------------- | ------------------------------------- |
| 整数     | 666,-88      | 666,-88,0         | 写法一致                              |
| 小数     | 13.14,-5.21  | 13.14,-5.21       | 写法一致                              |
| 字符     | A,0,我       | 'A','0','我'      | 程序中必须使用单引号,有且仅能一个字符 |
| 字符串   | 开发喵       | "开发喵","0"      | 程序中必须使用双引号,内容可有可无     |
| 布尔值   | 真,假        | true\false        | 只有两个值,true表示真,false表示假     |
| 空值     | 值是null     | 一个特殊的值,空值 |                                       |



## 转义字符

## **Java转义字符**

所有的ASCII码都可以用"\"加数字(一般是8进制数字)来表示. Java语言中定义了一些字母前加"\"来表示特殊含义的字符, 如\0,\t,\n等, 称为转义字符(Escape Character).

**① 斜线与反斜线**

- / 斜线(slash), 又称为forward slash (前斜线), 原本是标点符号.

起源于古罗马,中世纪时用作逗号(而当时的双斜线//是被当作连接号的,后来演化成等号=). Linux系统文件路径使用.

- \ 反斜线(backslash), Windows系统文件路径, 程序编码转义, Unicode编码等都使用.

**② 转义字符表**

斜杠:"/" 与 反斜杠:"\" ,此处不可互换

Java中转义字符, 用单引号标识, 是char类型.

### 1.八进制转义序列: 

\ + 1到3位5数字；范围'\000'~'\377'

\0:空字符

### 2.Unicode转义字符:

\u + 四个十六进制数字；0~65535

\u0000:空字符

常用Unicode字符对照表

- 点的转义:. -> u002E
- 美元符号的转义:$ -> u0024
- 乘方符号的转义:^ -> u005E
- 左大括号的转义:{ -> u007B
- 左方括号的转义:[ -> u005B
- 左圆括号的转义:( -> u0028
- 竖线的转义:| -> u007C
- 右圆括号的转义:) -> u0029
- 星号的转义:* -> u002A
- 加号的转义:+ -> u002B
- 问号的转义:? -> u003F
- 反斜杠的转义: -> u005C

### 3.特殊字符

- \" : 双引号
- \' : 单引号
- \\ : 反斜线
- \' : 单引号

### 4.控制字符

- \r 回车
- \n 换行
- \f 走纸换页
- \t 横向跳格
- \b 退格

转义字符表转义字符意义ASCII码值(十进制)

![img](https://pic3.zhimg.com/80/v2-187f4f87a8b8fabe29e4ef2c0b6004a6_1440w.webp)



在网上其他的一些资料中提到了\?和\x转义字符.

**然而Java中并没有这两个转义字符.\x`为C++语言中的16进制转义字符.**

附带真相的代码:

```java
package com.dashidan.lesson17;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 17.Java转义字符
 * 转义字符/?和/x
 */
public class Demo2 {
    public static void main(String[] args) {
        /** 定义以下变量都是错误的*/
//        char c = '\?';
//        char f = '\x01';
    }
}
```

示例代码:

```java
package com.dashidan.lesson17;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 17.Java转义字符
 */
public class Demo1 {
    public static void main(String[] args) {
        char a = '\\';
        char b = '\"';
        /** 这个会报错，Java中无法转义\? */
        char d = '\'';
        /** 8进制整数*/
        char e = '\100';
        /** unicode变化转义*/
        char g = '\u1111';
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("g: " + g);
    }
}
```

输出:

```text
a: \
b: "
d: '
e: @
g: ᄑ
```



## 变量

数据类型	变量名称 = 数据；

int 				age         =  18;

## 标志符

在Java中，标识符用来为程序中的常量、变量、方法、类、接口和包命名。标识符的

命名需要遵循一定的规则，包括以下四个规则：

1）标识符由字母（ A~Z 和 a~z ）、数字（0~9）、下划线（_）、美元符号（$）以及部分Unicode字符集（各符号之间没有空格）组成。

2）标识符的首字母以字母、下划线或美元符号开头，后面可以是任何字母、数字、美元符号或下划线，但不能以数字开头。

3）标识符的命名不能是关键字、布尔值（true、false）和null。

4）标识符区分大小写，没有长度限制。

```java
$name、_name、name、1name、@name、null
```

## 关键字

什么是关键字？

关键字是java语言中有特殊含义的单词。比如用int表示整数，用double表示小数，等等！

关键字有哪些？

我们学习Java的语法其本质就是学习这些关键字的含义，一共有51个关键字，



> 写代码时参考 阿里的《java开发手册》

# 数据类型详解

## 整数在计算机中的存储原理

其实任何数据在计算机中都是以二进制表示的。那这里肯定有人问，什么是二进制啊？

所谓二进制其实就是一种数据的表示形式，它的特点是逢2进1。

数据的表示形式除了二进制（逢2进1），八进制（逢8进1）、还有十进制（逢10进1）、十六进制（逢10进1）等。

### 计算机的最小存储单位

计算机中最小的存储单位是字节（**Byte**），一个字节占**8**位（**bit**）

**即使这个数据不足8位也需要用8位来存储**

| Byte  (1字节=8bit) | 2^8=256  -128（-2^7）~127（2^7-1）                           |
| ------------------ | ------------------------------------------------------------ |
| Short  (2字节)     | 2^16 = 65,536 -32768（-2^15）~32767（2^15  - 1）             |
| Int  (4字节)       | -2,147,483,648（-2^31）~2,147,483,647（2^31  - 1）           |
| Long  (8字节)      | -9,223,372,036,854,775,808（-2^63）~   9,223,372,036,854,775,807（2^63  -1） |

| float 4字节32位  | 1.4E-45~3.4028235E38            | 精度低 |
| ---------------- | ------------------------------- | ------ |
| double 8字节64位 | 4.9E-324~1.7976931348623157E308 | 精度高 |
| Char 2字节 16位  | 0-65535                         |        |
| boolean 1字节    | true false                      |        |

## 5.1 自动类型提升

**规则：将取值范围小（或容量小）的类型自动提升为取值范围大（或容量大）的类型 。**

基本数据类型的转换规则如图所示：

![image-20230801123837437](https://s2.loli.net/2023/08/01/cs9nFHjXVLUJelz.png)

（1）当把存储范围小的值（常量值、变量的值、表达式计算的结果值）赋值给了存储范围大的变量时

```java
int i = 'A';//char自动升级为int，其实就是把字符的编码值赋值给i变量了
double d = 10;//int自动升级为double
long num = 1234567; //右边的整数常量值如果在int范围呢，编译和运行都可以通过，这里涉及到数据类型转换

//byte bigB = 130;//错误，右边的整数常量值超过byte范围
long bigNum = 12345678912L;//右边的整数常量值如果超过int范围，必须加L，显式表示long类型。否则编译不通过
```

（2）当存储范围小的数据类型与存储范围大的数据类型变量一起混合运算时，会按照其中最大的类型运算。

```java
int i = 1;
byte b = 1;
double d = 1.0;

double sum = i + b + d;//混合运算，升级为double
```

（3）当byte,short,char数据类型的变量进行算术运算时，按照int类型处理。

```java
byte b1 = 1;
byte b2 = 2;
byte b3 = b1 + b2;//编译报错，b1 + b2自动升级为int

char c1 = '0';
char c2 = 'A';
int i = c1 + c2;//至少需要使用int类型来接收
System.out.println(c1 + c2);//113 
```

**练习：**

```
设 x 为float型变量，y为double型变量，a为int型变量，b为long型变量，c为char型变量，则表达式
x + y * a / x + b / y + c的值类型为：

A. int   B. long  C. double  D. char
```

## 5.2 强制类型转换

将`3.14` 赋值到`int` 类型变量会发生什么？产生编译失败，肯定无法赋值。

```java
int i = 3.14; // 编译报错
```

想要赋值成功，只有通过`强制类型转换`，将`double` 类型强制转换成`int` 类型才能赋值。

![image-20230801123907573](https://s2.loli.net/2023/08/01/I4iJSl7E3AneXYb.png)

**规则：将取值范围大（或容量大）的类型强制转换成取值范围小（或容量小）的类型。**

> 自动类型提升是Java自动执行的，而强制类型转换是自动类型提升的逆运算，需要我们自己手动执行。

**转换格式：**

```java
数据类型1 变量名 = (数据类型1)被强转数据值;  //()中的数据类型必须<=变量值的数据类型
```

（1）当把存储范围大的值（常量值、变量的值、表达式计算的结果值）强制转换为存储范围小的变量时，可能会`损失精度`或`溢出`。

```java
int i = (int)3.14;//损失精度

double d = 1.2;
int num = (int)d;//损失精度

int i = 200;
byte b = (byte)i;//溢出
```

（2）当某个值想要提升数据类型时，也可以使用强制类型转换。这种情况的强制类型转换是`没有风险`的，通常省略。

```java
int i = 1;
int j = 2;
double bigger = (double)(i/j);
```

（3）声明long类型变量时，可以出现省略后缀的情况。float则不同。

```java
long l1 = 123L;
long l2 = 123;//如何理解呢？ 此时可以看做是int类型的123自动类型提升为long类型

//long l3 = 123123123123; //报错，因为123123123123超出了int的范围。
long l4 = 123123123123L;


//float f1 = 12.3; //报错，因为12.3看做是double，不能自动转换为float类型
float f2 = 12.3F;
float f3 = (float)12.3;
```

**练习：判断是否能通过编译**

```java
1）short  s = 5;
   s = s-2;                     //判断：no
2） byte b = 3;
    b = b + 4;                  //判断：no
    b = (byte)(b+4);            //判断：yes
3）char c = ‘a’;
   int  i = 5;
   float d = .314F;
   double result = c+i+d;       //判断：yes
4） byte b = 5;
    short s = 3;
    short t = s + b;            //判断：no

```

**问答：为什么标识符的声明规则里要求不能数字开头？**

```java
//如果允许数字开头，则如下的声明编译就可以通过：
int 123L = 12;
//进而，如下的声明中l的值到底是123？还是变量123L对应的取值12呢？ 出现歧义了。
long l = 123L;
```

### 

## 字符在计算机中的存储原理

其实字符并不是直接存储的，而是把每一个字符编为一个整数，存储的是字符对应整数的二进制形式。美国人搞了一套字符和整数的对应关系表，叫做ASCII编码表。

```java
ASCII编码表中字符编码的规律：
1.字符0对应48，后面的1,2,3,4...9 对应的十进制整数依次往后顺延
2.字符a对应97，后面的b,c,d,e...z 对应的十进制整数依次往后顺延
3.字符A对应65，后面的B,C,D,E...Z 对应的十进制整数依次往后顺延
```

**在ASCII编码表中是不包含汉字的**

# 获取用户键盘输入的数据

```java
【第1步】：在class类上导包：一般不需要我们自己做，ide工具会自动帮助我们导包
的。
import java.util.Scanner;
【第2步】：得到一个用于键盘扫描器对象（照抄代码就行，固定格式）
// Scanner是键盘扫描器对象(你就把它理解成一个东西)，这个东西有录入的功
能
// sc是给这个东西取的名字
Scanner sc = new Scanner(System.in);
【第3步】：开始调用sc的功能，来接收用户键盘输入的数据。
// sc这个东西有键盘录入整数的功能，这个功能的名字叫nextInt()
// .表示表示调用的意思
int age = sc.nextInt();
System.out.println("我的年龄是:"+age);
// sc这个东西还有键盘录入字符串的功能，这个功能的名字叫next
String name = sc.next();
System.out.println("我的姓名是:"+name);
```











# CMD快捷操作

Tab：自动输入当前文件夹的子文件夹名。可按下多次选择文件夹，与cd命令配合使用可快速进入子文件夹。

Esc：清除当前命令行

Ctrl+C 强行中止命令执行

Ctrl+H 删除光标左边的一个字符

Ctrl+M 表示回车确认键

输入 exit 退出窗口

小技巧：

\2. 复制粘贴

在命令提示符中，是无法使用Ctrl+C和Ctrl+V的快捷键来完成复制粘贴操作的。要复制的话，需要用鼠标选择需要复制的部分，右键选中则会自动复制。同时，如果需要使用快捷键，也可以在属性中勾选“快速编辑模式”来实现。

\3. 快速输入文件路径

在很多与命令提示符相关的优化和设置操作中，都需要输入完整的文件路径，这样的情况下，我们可以通过拖拽的方式来实现。拖拽文件到命令提示符中，完整的文件路径也就输入了。

\4. 文件路径自动完成

在输入文件路径时，我们可以只输入文件路径的前一部分，比如E:，然后按Tab键就可以在可选的文件之间切换了。

\5. 快速查看历史记录　

想要快速选择上一次输入的命令，只需要按下“↑”即可，随后下一个命令可以用“↓”来选择。完整的历史记录可以通过按下F7来查看。　

常用命令：

计算器 calc

剪贴簿查看器 clipbrd

设备管理器 devmgmt.msc

显示属性 control desktop (desk.cpl)

Internet属性 inetcpl.cpl



**ipconfig /all IP配置实用程序(显示DNS缓存内容)** 

ipconfig /displaydns IP配置实用程序(删除DNS缓存内容) 

ipconfig /flushdns IP配置实用程序(释放全部(或指定)适配器的由DHCP分配的动态IP地址)

ipconfig /release IP配置实用程序(为全部适配器重新分配IP地址) 

ipconfig /renew IP配置实用程序(刷新DHCP并重新注册DNS) 

ipconfig /registerdns IP配置实用程序(显示DHCP Class ID) 

ipconfig /showclassid IP配置实用程序(修改DHCP Class ID) 

Java控制面板(如果已经安装) jpicpl32.cpl

本地安全设置 secpol.msc

从Windows注销 logoff

网络连接 control netconnections (ncpa.cpl)

记事本 notepad

远程桌面 mstsc

Windows安全中心 wscui.cpl 服务 services.msc 共享文件夹 fsmgmt.msc

声音和音频设备属性 mmsys.cpl

系统配置实用程序 msconfig

任务管理器 taskmgr

# 拓展

linux中使用java环境



