# Day03

## 前一天记录

### 两个数字交换

- way1 使用temp进行交换
```java 
int a = 23;
int b = 78;
int temp = a;
a = b;
b = temp; 
```

- way2 使用按位异或进行交换
```java
// 通过位运算(异或运算)交换两个变量的值
// 按位异或： 两个操作数相同结果是0 不同是 1
int a = 23;
int b = 25;
// a ^ a = 0;
// a ^ 0 = a;
a = a ^ b;
b = a ^ b;  // a ^ b ^ b = a ^ 0 = a
a = a ^ b;  // a ^ b ^ a = 0 ^ b = b
```
- way3 
```java
int a = 23;
int b = 45;
a = a + b;
b = a - b;  // a + b - b = a
a = a - b;  // a + b - a = b
```
## intellij快捷键
psvm
```java
public static void main(String[] args){}
```
sout
```java
System.out.println();
```
# 程序流程控制

## 顺序结构
就是不加任何控制，代码从main方法开始自上而下执行
## 分支结构
根据条件判断是true还是false
Java语言中提供了两个格式if 、 switch

### if分支
if它的作用，是用于对条件进行判断，判断的结果只可能有两个值true或者false，然后 根据条件判断的结果来决定执行那段代码。
- 单分支if结构
```java
public static void main(String[] args) {
    double temp = 36;
    if (temp > 37) {
    System.out.println("枪毙");
    }
    System.out.println("继续执行代码");
    }
```
- 双分支if结构
```java
public static void main(String[] args) {
    double temp = 36;
    if (temp > 37) {
    System.out.println("枪毙");
    } else {
    System.out.println("隔离28天");
    }
    System.out.println("语句执行完毕");
    }
```
- 双分支if结构
```java
Scanner sc = new Scanner(System.in);
System.out.println("请输入员工打分成绩");
double score = sc.nextDouble();
if (score >= 0 && score < 60) {
    System.out.println("员工绩效级别：D");
} else if (score < 80) {
    System.out.println("员工绩效级别：C");
} else if (score < 90) {
    System.out.println("员工绩效级别：B");
} else if (score <= 100) {
    System.out.println("员工绩效级别：A");
} else {
    System.out.println("你输入的成绩不合理");
}
System.out.println("绩效评定完毕");
```

### switch分支
- switch分支的执行流程: switch 分支的作用，是通过比较值来决定执行哪条分支代码。先看一下switch分支的格式和执行流程
```java
switch(表达式){
    case1:执行代码1;
        break;
    case2:执行代码2；
        break;
    default:默认情况，与上述条件都不匹配的时候；
}
```
![img.png](img.png)
```java
javac -encoding utf-8 Switch01.java
//输出utf-8代码
```

#### switch 注意事项
各位同学，接下来我们学习switch的注意事项。同学们掌握这些注意事项之后，就可 以避免入坑了，也可以应对一些面试笔试题。
- 表达式类型只能是byte、short、int、char；JDK5开始支持枚举，JDK7开始支持String，不支持double、float, long等 
- case给出的值不允许重复，且只能是字面量，不能是变量。 
- 正常使用switch的时候，不要忘记写break，否则会出现穿透现象。
 
switch语句匹配的数据类型
- 可以自己分别用变量a、b放在switch语句中匹配试一试，如果遇到不支持的写法，编译会报错
![img_1.png](img_1.png)

case后面的值，只能是字面量不能是变量
```java
int i = 20;
int d = 20;
switch(i) {
case 10:
// 省略部分代码
break;
case d: ---- `d`不可用
// 省略部分代码
break;
```


case穿透现象
- 当switch语句中没有遇到break，就会直接穿透到下一个case语句执行，直到遇到break 为止
```java
//案例3：使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
int score = 59;
switch (score / 10) {
    case 10:
    case 9:
    case 8:
    case 7:
    case 6:
        System.out.println("及格");
        break;
    case 5:
    case 4:
    case 3:
    case 2:
    case 1:
    case 0:
        System.out.println("不及格");
    default:
        break;
```

case匹配多个值

当多个case语句想要执行同一段代码时，可以利用
```java
switch (month) {
    case 1, 3, 5, 7, 8, 10, 12:
        System.out.println("31天");
        break;
    case 4, 6, 9, 11:
        System.out.println("30天");
        break;
    case 2:
        System.out.println(feb + "天");
        break;
    default:
        System.out.println("输入错误");
        break;
}
```

switch分支新特性

- 箭头表达式
- 特性2：yield
```java
// 先输入年份，在输入一个月份，返回这个月多少天
// 31 30 29 2831 1,3,5,7,8,10,12 30 4，6 ，9，11 2 年29天 平年 28天

Scanner scanner = new Scanner(System.in);
System.out.println("请输入一个年份");
int year = scanner.nextInt();

int days = 0;
System.out.println("请输入一个月份");
int month = scanner.nextInt();
days = switch (month) {
    case 1, 3, 5, 7, 8, 10, 12 -> 31;
    case 4, 6, 9, 11 -> 30;
    case 2 -> {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            yield 29;
        } else {
            yield 28;
        }
    }
    default -> -1;
    //default 不能忘记加
};
if (days == -1) {
    System.out.println("你输入的有误");
}
else {
    System.out.println(year+"年 "+month+"月 有"+days+"天");

}

```





## 循环结构
在Java语言中提供了三种格式，
for、while、do-while还有1.5新增的for-each循环

# 杂项
## asci码




