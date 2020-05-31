package cn.edu.base;

/*import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello,world!");
        int[] nouns = new int[]{2, 5, 6, 8};
        System.out.println(Arrays.toString(nouns));
//        for (int i = 0; i < nouns.length;i++) {
//            System.out.println(nouns[i]);
//        }
    }
}*/

/*
public class HelloWorld {
    public static void main(String[] args) {
        // TODO: 给Person增加构造方法:
        Person ming = new Person("小明", 12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    public Person(String name){
        this(name, 30);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}*/
/*

public class HelloWorld {
    public static void main(String[] args) {
        Person p = new Person("小明", 12);
        Student s = new Student("小红", 20, 99);
//        Student b = new Student("小bob", 18 , 89, "the wonderful gsb");
        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
//        Student ps = new PrimaryStudent("小军", 9, 100, 5,"the wonderful gsb");
//        PrimaryStudent ps = new PrimaryStudent("小军", 9, 100, 5,"the wonderful gsb");
        PrimaryStudent ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    protected int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
*/

//class Book{
//    protected String bookname;
//
//    public void setBookname(String bookname){
//        this.bookname = bookname;
////    }
//}

/*class PrimaryStudent extends Student{
//    protected Book book;
    protected int grade;

//    public PrimaryStudent(String name, int age, int score,int grade ,String bookname){
    public PrimaryStudent(String name, int age, int score,int grade ){
        super(name, age, score);
        this.grade = grade;
//        book.bookname = bookname;
    }

    public int getScore() { return score; }
    // TODO
}

public class Person {
    private String name;
    private int age;
}*/
//so do you be quicker?


import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.SQLOutput;
import java.util.Arrays;
/*
public class HelloWorld {
    public static void main(String[] args) {
        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom(); // 获取普通的安全随机数生成器
        }
        byte[] buffer = new byte[16];
        sr.nextBytes(buffer); // 用安全随机数填充buffer
        System.out.println(Arrays.toString(buffer));
    }
}*//*
public class HelloWorld {
    public static void main(String[] args) {
        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void process1() {
        process2();
    }


    static void process2() {
        Integer.parseInt(null); // 会抛出NumberFormatException
    }
}
*/

import java.util.*;
/*

public class HelloWorld {
    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    static int findMissingNumber(int start, int end, List<Integer> list) {
        int sum = 0;
        for(Integer i : list){
            sum += i;
        }
        return (start  + end)*(end - start+1)/2 - sum;
    }
}
*/
/*
public class HelloWorld {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Bob", 78),
                new Student("Alice", 85),
                new Student("Brush", 66),
                new Student("Newton", 99));
        var holder = new Students(list);
        System.out.println(holder.getScore("Bob") == 78 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Alice") == 85 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Tom") == -1 ? "测试成功!" : "测试失败!");
    }
}

class Students {
    List<Student> list;
    Map<String, Integer> cache;

    Students(List<Student> list) {
        this.list = list;
        cache = new HashMap<>();
//        for(Student s:list){
//            cache.put(s.name,s.score);
//        }
    }

    *//**
 * 根据name查找score，找到返回score，未找到返回-1
 *//*
    int getScore(String name) {
        // 先在Map中查找:
        Integer score = this.cache.get(name);
        if (score == null) {
            //return -1;
            //return findInList(name);
            // TODO:
            score = findInList(name);
            this.cache.put(name,score);
        }
        return score == null ? -1 : score.intValue();
    }

    Integer findInList(String name) {
        for (var ss : this.list) {
            if (ss.name.equals(name)) {
                return ss.score;
            }
        }
        return null;
    }
}

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}*/

/*
public class HelloWorld {
    public static void main(String[] args) {
        List<Message> received = List.of(
                new Message(1, "Hello!"),
                new Message(2, "发工资了吗？"),
                new Message(2, "发工资了吗？"),
                new Message(3, "去哪吃饭？"),
                new Message(3, "去哪吃饭？"),
                new Message(4, "Bye")
        );
        List<Message> displayMessages = process(received);
        for (Message message : displayMessages) {
            System.out.println(message.text);
        }
    }

    static List<Message> process(List<Message> received) {
        // TODO: 按sequence去除重复消息
        Set<Integer> set = new HashSet<>();
        int remove;
        for(Message m: received ){
            if(!set.add(m.sequence)){
                 remove = received.remove(m);
            }
//            set.add(m.sequence);
        }

        return received;
    }
}

class Message {
    public final int sequence;
    public final String text;
    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }
}
*/


import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }

    static String toHex(int n) {
        Deque<String> stack = new LinkedList<>();
        Integer temp = 0;
//        int[] hex= new int[10];
        while (n > 0) {
            temp = n % 16;
            stack.push(Integer.toHexString(temp));//因为要转化成ABCD..的，否则10/11..输入就会导致结果错误
//            stack.push(Integer.toHexString(n%16));
            n /= 16;
        }
//        String hex = new String();
        var hex = new StringBuilder();
//        temp = 0;
////        while(stack.pop() != null){
////            hex[temp] = stack.pop();
////            hex = hex + stack.pop();
//            hex.append(stack.pop());
//            temp ++;
//        }
        for (String s : stack) {
            hex.append(s);
        }
        System.out.println(hex.toString());

        return hex.toString();
    }
}
