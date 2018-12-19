package com.qxp;

import java.util.Scanner;

/**
 * @Auther: XinPingQiu
 * @Date: 2018/11/7
 * @Dsc: 把输入的字符串按块翻转, 连续的字符为一个块，如'ab...bc..我的。'翻转之后为'。我的..bc...ab'
 */
public class 翻转字符串块 {


    public static void main(String[] args) {
        System.out.print("请输入要按块翻转的字符：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuffer sb1 = new StringBuffer();
        char c = s.charAt(s.length() - 1);
        sb.append(c);
        for (int i = s.length() - 2; i >= 0; i--) {
            if (c == s.charAt(i)) {
            }
        }

    }
}