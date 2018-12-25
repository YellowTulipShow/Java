package com.yts.console;

import java.io.*;

import com.yts.tools.*;

public class MainProram {
    public static void main(String[] args) {
        // do {
        //     ExecuteCases();
        // } while (IsRepeatExecute());
        ExecuteCases();
    }

    private static String readDataFromConsole(String prompt) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            Print.w(prompt);
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static boolean IsRepeatExecute() {
        String input_str = readDataFromConsole("请输入命令: Q(退出) R(重复执行) C(清空屏幕)");
        switch (input_str) {
            case "q":
                return false;
            case "r":
                return true;
            case "c":
                System.out.print("清理屏幕... (待实现)");
                return IsRepeatExecute();
            default:
                return IsRepeatExecute();
        }
    }

    public static <T> boolean IsSizeEmpty(T[] list) {
        return true;
    }

    /**
     * 执行测试实例集合
     */
    private static void ExecuteCases() {
        CaseModel[] case_list = new Libray().GetALLCases();
        if (CheckData.IsObjectNull(case_list) || case_list.length <= 0) {
            Print.w("(→_→) => 并没有需要测试实例子弹, 怎么打仗? 快跑吧~ running~ running~ running~ ");
            return;
        }
        if (AnalyticCaseModel(case_list, GKeys.StrEmpty)) {
            Print.w("[+] 测试成功, 完美!");
        } else {
            Print.w("[-] 测试含有错误已停止!");
        }
    }

    /**
     * 递归解析测试实例集合
     * @param cases 测试实例集合
     * @param upper_layer_name 上层级名称
     * @return 是否成功
     */
    private static boolean AnalyticCaseModel(CaseModel[] cases, String upper_layer_name) {
        upper_layer_name = ConvertTool.ToString(upper_layer_name);
        for (int i = 0; i < cases.length; i++) {
            CaseModel model = cases[i];
            // 获取名称
            String name = model.NameSign;
            if (!CheckData.IsStringNull(upper_layer_name)) {
                name = String.format("%s: $s", upper_layer_name, name);
            }

            // 执行自身方法
            boolean isby = AnalyticCaseModelOneItem(model, name);
            if (!isby) {
                return false;
            }

            // 执行含有子方法
            CaseModel[] sons = model.SonCases();
            if (!CheckData.IsObjectNull(sons) && sons.length > 0) {
                if (!AnalyticCaseModel(sons, name)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 单个解析测试实例
     * @param method 执行方法
     * @param name 执行名称
     * @return 是否成功
     */
    private static boolean AnalyticCaseModelOneItem(CaseModel model, String name) {
        boolean isby = model.ExeMethod();
        String sign = "+";
        String msg = "成功 Success";
        double exe_time = 0.0;
        if (!isby) {
            sign = "-";
            msg = "失败 Error";
        }
        String str = String.format("[%s] Name: [%s] %s Time: %s", sign, name, msg, exe_time);
        Print.w(str);
        return isby;
    }
}
