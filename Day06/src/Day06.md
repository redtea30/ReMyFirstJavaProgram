# 一维数组



## 增强for循环

```java
int[] arr = new int[] {1, 2, 3, 4};
for (int i : arr){ sout（i） }
```

无法赋值

无法拿到元素的下标


## 初始值

| 数组元素类型           | 默认初始值         |
| ---------------------- | ------------------ |
| byte，short，int，long | 0                  |
| float，double          | 0.0                |
| char                   | '\u0000'（空字符） |
| boolean                | false              |
| 引用数据类型           | null               |

## 数组的初始化

### 动态初始化

```java
int[] arr = new int[5];
后边的int[]填入长度
```

### 静态初始化

```java
int[] arr = new int[] {1,2,3,4};
or
int[] arr = {1,2,3,4};// 简写
```

## 为什么需要数组？

结论：遇到批量数据的存储和操作时，数组比变量更适合

