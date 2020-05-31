package cn.test;

import java.util.ArrayList;
import java.util.List;

//牛啊，找规律，以及这个flag确实用的牛啊
class Solution {
//    private int kkk;
//    private String ui;

    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();//建立了个StringBuilder的List rows
        for (int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);//这个不算for循环，算rows.get(i)是List方法，取出StringBuilder再append（）
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);
        return res.toString();
    }

//    public int getKkk() {
//        return kkk;
//    }
//
//    public void setKkk(int kkk) {
//        this.kkk = kkk;
//    }
//
//    public String getUi() {
//        return ui;
//    }
//
//    public void setUi(String ui) {
//        this.ui = ui;
//    }
}

/*解题思路见下面链接：
https://leetcode-cn.com/problems/zigzag-conversion/solution/zzi-xing-bian-huan-by-jyd/
*/


