package com.dreamiii.autil;

import java.math.BigDecimal;

/**
 * 一般为计算价格的时候使用的工具
 * Created by bbx on 2017/3/30.
 */

public class BigDecimalUtil {

    /**
     * 乘法运算
     * @param d1 被乘数
     * @param d2 乘数
     * @return 结果
     */
    public static double multiply(double d1,double d2){
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 除法运算
     * @param d1 被除数
     * @param d2 除数
     * @return 结果
     */
    public static double divide(double d1,double d2){
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.divide(b2).doubleValue();
    }

    /**
     * 加法运算
     * @param d1 被加数
     * @param d2 加数
     * @return 结果
     */
    public static double add(double d1,double d2){
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 减法运算
     * @param d1 被减数
     * @param d2 减数
     * @return 结果
     */
    public static double subtract(double d1,double d2){
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.subtract(b2).doubleValue();
    }
}
