package com.mashibing.interpreter.example01;

/**
 * @author spikeCong
 * @date 2022/10/20
 **/
public class Test01 {

    public static void main(String[] args) {

        ExpressionInterpreter e = new ExpressionInterpreter();
        long result = e.interpret("6 8 3 2 4 + - + *");
        System.out.println(result);
    }
}
