package cn.edu;


//import org.w3c.dom.ls.LSOutput;
//
//import cn.test.Solution;

import cn.edu.Solution;
//import java.util.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class Gogogo {
    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        int numRows = 3;
        Solution1 sol = new Solution1();
        String result = sol.convert(s, numRows);
//        Solution sol = new Solution();
//        String result = sol.convert(s, numRows);
//        sol.setUi("Hello!");
//        System.out.println(sol.getUi());
        System.out.println(result);
    }
}


//public class Solution1 {//Error:(30, 8) java: 类 Solution1 是公共的, 应在名为 Solution1.java 的文件中声明
class Solution1 {
    public String convert(String s, int numRows) {
        List<StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i < numRows;i++){
            rows.add(new StringBuilder());
        }
        int i = 0, flag = -1;
        for(int index = 0; index < s.length();index++){
            char c = s.charAt(index);
            rows.get(i).append(c);
            if(i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows){
            res.append(row);
        }
        return res.toString();
    }
}/*
*/





















