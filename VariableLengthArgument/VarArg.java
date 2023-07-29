package VariableLengthArgument;

import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        addition(12, 34, 5, 6);
    }

    // infinite parameter list
    static void addition(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
