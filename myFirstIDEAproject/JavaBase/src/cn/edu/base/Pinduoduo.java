package cn.edu.base;

import java.util.HashMap;
import java.util.Map;

//import java.util.Scanner;
public class Pinduoduo {
    public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//    int[] nums = new int[]
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Solution sol = new Solution();
        System.out.println(sol.Twosum( int[] nums, int target));
    }
}
//    Scanner scanner = new Scanner(System.in);
////    int[] nums = new int[]
//    int[] nums = new int[]{2, 7, 11, 15};
//    int target = 9;
//    Solution sol = new Solution();
//    System.out.println(sol.Twosum(int[] nums,int target));
////    sol.Twosum()
//
//


//暴力
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
            for (int j = i + 1; j < nums.length; j++) {//j = i++,才符合不会是重复元素的题意
                if (nums[i] + nums[j] == target) {
//                if (target - nums[j] == nums[i] ) {//这个亦可
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(target - nums[j]) && map.get(target - nums[j]) != j) {
                return new int[]{j, map.get(target - nums[j])};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);//将当前结点初始化为返回列表的哑结点 curr = dummyHead;
        ListNode p = l1, q = l2, curr = dummyHead;//将 p 和 q 分别初始化为列表 l1 和 l2 的头部
        int carry = 0;
        while (p != null || q != null) {//遍历列表 l1 和 l2 直至到达它们的尾端
            int x = (p != null) ? p.val : 0;//如果p!= null,即未到末尾，将 x 设为结点 p 的值即p.val。如果 p 已经到达l1 的末尾，则将其值设置为 0
            //也就是(p != null) ? p.val : 0是整体的判断语句
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;//新进位。更新进位的值，carry = sum / 10
            curr.next = new ListNode(sum % 10);//来了来了，对next动手了。创建一个数值为 (sum mod 10) 的新结点，并将其设置为当前结点的下一个结点，然后将当前结点前进到下一个结点
            curr = curr.next;//然后将当前结点前进到下一个结点
            if (p != null) p = p.next;//同时，将 p 和 q 前进到下一个结点
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);//有进位加个结点。检查 carry = 1是否成立，如果成立，则向返回列表追加一个含有数字 1 的新结点。
        }
        return dummyHead.next;//高超，相当于空表头。返回哑结点的下一个结点
    }


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] cs = s.toCharArray();
//        int count = 0;
        int count = 0, countMax = 0;
//        Map<String, String> map = new HashMap<>();
        Map<Character, Character> map = new HashMap<>();
        for (char c : cs) {
            if (map.containsKey(c)) {
                if (count > countMax) countMax = count;
//                countMax = count;
                count = 0;
                //map清零
                map.clear();
            }
            map.put(c, c);
            count++;
        }
//        String s = "";
//        for(char c: cs){
//            if(map.containsKey(c)){
//                s = s.join(s, map.get(c));
//            }
//        }
        return countMax;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals(" ")) return 1;

        char[] cs = s.toCharArray();
        int count = 0, countMax = 0;
        Map<Character, Character> map = new HashMap<>();
        for (char c : cs) {
            /*if(c == " "){
                count++;
                continue;
            }*/
            if (map.containsKey(c)) {
                if (count > countMax) countMax = count;
                count = 0;
                //map清零
                map.clear();
            }
            map.put(c, c);
            count++;
        }
//        String s = "";
//        for(char c: cs){
//            if(map.containsKey(c)){
//                s = s.join(s, map.get(c));
//            }
//        }
        return countMax;
    }
}


class Solution {
    public boolean ispalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String temps = s.substring(i, j);
                if (ispalindromic(temps) && temps.length() > max) {
                    ans = s.substring(i, j);
                    max = Math.max(max, ans.length());
                }
            }
        }
        return ans;
    }
}

    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // 暴力解法
    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j <= len; j++) {
                String test = s.substring(i, j);
                if (isPalindromic(test) && test.length() > max) {
                    ans = s.substring(i, j);
                    max = Math.max(max, ans.length());
                }
            }
        return ans;
    }

