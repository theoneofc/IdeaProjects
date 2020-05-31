package cn.test;
/**
 * 测试是否不同package可以各拥有一个主类（main()方法）
 * 结果是的
 */

import cn.test.Solution;

public class main {
    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        int numRows = 3;
//        Solution1 sol = new Solution1();
//        String result = sol.convert(s, numRows);
        Solution sol = new Solution();
        String result = sol.convert(s, numRows);
//        sol.setUi("Hello!");
//        System.out.println(sol.getUi());
        System.out.println(result);
    }
}
