package com.amarsoft;

import java.math.BigDecimal;

/**
 * @Auther: ljlin
 * @Date: 2020/6/30 14:59
 * @Description: com.amarsoft
 * @version: 1.0
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        /*BigDecimal bd =BigDecimal.valueOf(123456789.113d);
        BigDecimal bf =BigDecimal.valueOf(123456788.112d);
        System.out.println(bd);
        System.out.println(bf);
        System.out.println(bd.add(bf));
        System.out.println(bd.subtract(bf));
        System.out.println("bd和bf相比较"+bd.compareTo(bf));*/
        da();
    }
    public static int da(){
        Double a = 0.05;
        double c =0.01;

        double b = 0.06;
        BigDecimal bigDecimal = BigDecimal.valueOf(a);
        System.out.println(bigDecimal);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(b);
        System.out.println(bigDecimal1);

        return bigDecimal.compareTo(bigDecimal1);
    }
}
