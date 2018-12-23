package com.yts.console;

public class Libray {

    public Libray() { }

    /**
     * 在这里面手动设置要测试的实例
     * @return 要测试的实例
     */
    public CaseModel[] GetALLCases() {
        return new CaseModel[] {
            new Test_ConvertTool(),
        };
    }

    protected class Test_ConvertTool extends CaseModel {
        public Test_ConvertTool() {
            this.NameSign = "测试转换工具";
        }
        public boolean ExeMethod() {
            Print.w("吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦...");
            return true;
        }
    }
}
