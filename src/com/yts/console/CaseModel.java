package com.yts.console;

/**
 * 测试实例模型
 * @author YellowTulipShow
 */
public class CaseModel {
    /**
     * 名称标志
     */
    public String NameSign = "实例模型初始名称";

    /**
     * 执行方法
     * @return 执行结果是否成功
     */
    public boolean ExeMethod() {
        return true;
    }

    /**
     * 获取子实例列表
     * @return 实例列表
     */
    public CaseModel[] SonCases() {
        return new CaseModel[] {};
    }

    /// <summary>
    /// 中断测试实例
    /// </summary>
    public CaseModel BreakCase() {
        return new BreakCase();
    }

    /**
     * 中断测试实例
     * @author YellowTulipShow
     */
    protected class BreakCase extends CaseModel {
        public BreakCase() {
            super();
            this.NameSign = "中断测试";
        }
        public boolean ExeMethod() {
            return false;
        }
    }
}
