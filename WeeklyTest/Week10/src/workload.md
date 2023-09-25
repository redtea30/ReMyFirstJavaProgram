# 开发喵图书管理系统V1.0

## 需求一(60分):

系统每次启动时检测数据库(manger)中是否存在图书信息表(books)及操作日志表(log)

如果不存在则读取项目根目录下的sql.txt文件,并执行。(sql.txt)文件中是图书信息表(books)及操作日志表(log)的初始化SQL

如果存在则不做任何操作

## 需求二(20分):

1. 设计添加图书功能

   可以根据用户控制台输入向图书信息表(books)中插入数据

2. 设计删除图书功能

   可以根据用户控制台输入删除图书信息表(books)中对应的数据

3. 设计修改图书数量功能

   可以根据用户控制台输入选择一条图书信息并修改其数量(数量要比原值大)

4. 每个操作完成后都要向用户显示操作结果(如:添加xxx图书成功)

PS:可以使用彩色文字输出

```java
public class BookManager{

  public BookManager(){

    init();

  }



  public void init(){}



}



public void addBookInfo(){}



public void removeBook(){}



public void modifyBookQuantity(){}
```

## 附加需求一(10分):

设计显示所有图书信息功能

查询图书信息表(books)中所有的数据

## 附加需求二(10分):

完善每个功能,将用户的每个操作都记录在日志表(log)中

## 附加需求三(20分):

将以上功能设计为可交互的系统,可以通过用户控制台输入来执行相应操作。并添加退出系统功能。


**数据库表数据示例:**

```java
public void showAllBooks(){}



public void log(String desc) {}
```
