
# 1. 定义错误的是
```java
int a;
double b = 4.5;
boolean b = true;
float f = 9.8;//这里是float类型的，应当为9.8f
```


# 8. 下列语句序列执行后j的值是
```java
int j = 3, i = 2;
while (--i != i / j) j = j + 2；
// j = 5 
```


# 12. 以下两句话是错误的

- 数组属于原生类
	原生类就是没有对象化的类，一个类被对象化了就成了实例对象，  
	原生类有8种， int double boolean float byte short long char 


- 数组的length属性是可以赋值的
	目前来说是不对的，未来可以通过反射进行赋值


# 13. 返回值
```java
public class returnIt{
	returnType methodA(byte x,double y){
	return (short) x/y *2 }
}
```

返回值应当为double类型，(short) x / y * 2 
其中，x为short类型，y为double类型，2为int类型
x/y 时，结果自动类型提升成为double 类型，与int计算机时结果也提升为double类型


# 17. 输出结果
```java
public class Demo {
	public static void main (Stirng[] aegs){
		int a = 2;
		add(a);
		System.out.println(a);
	}
	public static void add(int a ){
		a++;
	}
}
```

a的输出结果应当为2
add()方法中拿到的是a的副本？

reference: [java对象作为方法参数传递到一个方法后，对象内容是否发生改变的相关分析_对象作为方法的参数被赋值_MariaOzawa的博客-CSDN博客](https://blog.csdn.net/MariaOzawa/article/details/108391037?ydreferer=aHR0cHM6Ly9jbi5iaW5nLmNvbS8%3D)
**问：当一个对象被当做参数传递到一个方法后，此方法可改变这个对象的属性，并返回变化后的结果，那么这里到底是值传递还是引用传递？**

答：是值传递。**在java语言中只有值传递参数**；当一个对象实例作为一个参数被传递到方法中时，**参数的值就是该对象引用的一个副本**。指向同一个对象，**对象的内容可以在被调用的方法中改变，但是对象的引用(不是引用的副本)是永远不会改变的**。

Java参数：不管是原始类型还是引用类型，传递的都是副本(有另外一种说法是传值，传值一般相对于传地址而言)

若参数类型是**基本数据类型**，那么传过来的就是这个参数的一个副本，也就是这个**原始参数的值**，这个跟之前所谈的传值是一样的。如果**在函数中改变了副本的值不会改变原始的值**

若参数类型是**引用类型**，那么传过来的就是这个引用参数的副本，这个副本存放的是**参数的地址**，如果在函数中没有改变这个副本的地址，而是改变了地址中的值，那么在函数内的改变会影响到传入的参数。如果在函数中改变了副本的地址，如new了一个，那么副本就指向了新的地址，此时传入的参数还是指向原来的地址，所以**不会改变原来的值**。


# 栈的机制
输入栈 1，2，3，4，5

不可能是 3，1，2，4，5

[数据结构：栈和队列(Stack & Queue)【详解】_UniqueUnit的博客-CSDN博客](https://blog.csdn.net/Real_Fool_/article/details/113852222)
### 1、栈的定义

**栈**（Stack）：是只允许在一端进行插入或删除的[线性表](https://so.csdn.net/so/search?q=%E7%BA%BF%E6%80%A7%E8%A1%A8&spm=1001.2101.3001.7020)。首先栈是一种[线性表](https://blog.csdn.net/Real_Fool_/article/details/113463997)，但限定这种线性表只能在某一端进行插入和删除操作。

![[Pasted image 20230812164414.png]]
**栈顶**（Top）：线性表允许进行插入删除的那一端。  
**栈底**（Bottom）：固定的，不允许进行插入和删除的另一端。  
**空栈**：不含任何元素的空表。

**栈又称为后进先出（Last In First Out）的线性表，简称LIFO结构**

# 21. continue, break, return 的定义


continue 语句可以立即结束当此循环而执行下一个循环
break 跳过本块中剩下的所有语句，转到结尾，执行其他语句
return 结束当前方法的执行，并返回到调用该方法的语句处

# 22. 方法重载的定义
方法重载指的是在一个类中定义多个同名的方法，但要求每个方法具有不同的参数类型或者参数个数或参数序列
```java
public static void work(){}
public static int work(int a ){}
```

# 23。有5位同学的姓名存储在一个一维数组 names 中，他们的三科(数学，语文，英语)成绩，存储在一个二维数组 scores 中，请根据语文成绩隆序排名并输出每个人及其各科成绩。
```java
//23。有5位同学的姓名存储在一个一维数组 names 中，他们的三科(数学，语文，英语)成绩，  
// 存储在一个二维数组 scores 中，请根据语文成绩隆序排名并输出每个人及其各科成绩。  
  
String[] names = {"one", "two", "three", "four", "five"};  
int[][] scores = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9,}, {10, 11, 12}, {13, 14, 15}};  
  
//对语文成绩进行排序，顺便把names也排序了  
for (int i = 1; i < scores.length; i++) {  
    for (int j = 0; j < scores.length - i; j++) {  
        if (scores[j][1] < scores[j + 1][1]) {  
            int temp = scores[j][1];  
            scores[j][1] = scores[j + 1][1];  
            scores[j + 1][1] = temp;  
            String temp1 = names[j];  
            names[j] = names[j + 1];  
            names[j + 1] = temp1;  
        }  
    }  
}  
System.out.println("names\tmath\tmandarin\tenglish\t");  
for (int i = 0; i < scores.length; i++) {  
    System.out.print(names[i] + "\t");  
    for (int j = 0; j < scores[i].length; j++) {  
        System.out.print(scores[i][j] + "\t");  
    }  
    System.out.println();  
}

names	math	mandarin	english	
five	1	14	3	
four	4	11	6	
three	7	8	9	
two	10	5	12	
one	13	2	15	

```


# 24。从键盘输入一个数字，设计一个方法通过二分查找返回其位置 (不存在返回 -1)
```java
public static void main(String[] args) {  
    //# 24。从键盘输入一个数字，设计一个方法通过二分查找返回其位置 (不存在返回 -1)    int[] arr = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};//binarySearch只适用于已经拍好顺序的数组（升序）  
    int key = 15;  
    System.out.println(binarySearch(arr, key));  
}  
  
public static int binarySearch(int[] arr, int key) {  
    int left = 0;  
    int right = arr.length - 1;  
    while (left <= right) {  
        int mid = (right + left) >> 1;  
        if (arr[mid] > key) {//这里的是arr[mid]，而不是mid，比较的是数组里变量的值  
            right = mid - 1;  
        } else if (arr[mid] < key) {  
            left = mid + 1;  
        } else if (key == arr[mid]) {  
            return mid;  
        }  
    }  
    return -1;  
}
```

# 25。给定一个数组，请根据输入在数组的指定位置插入指定的值。
```java
//25。给定一个数组，请根据输入在数组的指定位置插入指定的值。  
int[] arr = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};  
int[] newArr = new int[arr.length + 1];  
  
int value = 4;  
int index = 3;  
System.arraycopy(arr, 0, newArr, 0, index);//是araycopy，写的太急晕了  
newArr[index] = value;  
System.arraycopy(arr, index, newArr, index + 1, arr.length - index);  
System.out.println(Arrays.toString(newArr));
```


# 26。编写一个程序，生成一个给指行数的杨辉三角存储在二维数组并输出

```java

```






