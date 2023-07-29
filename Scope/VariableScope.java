package Scope;

/**
 * VariableScope
 */
public class VariableScope {

    public static void main(String[] args) {
        add(12, 13);
    }

    static void add(int n1, int n2) {
        int result = n1 + n2;
        System.out.println(result);
    }
}