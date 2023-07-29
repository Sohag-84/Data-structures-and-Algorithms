package Scope;

public class BlockScope {
    public static void main(String[] args) {
        String name = "Sohag";
        {
            // we can't access it outside the block
            int age = 24; // we can again declear with same name outside the block
            // we can't initialized name cz we already declear variable name
            // but we can change name varible value
            name = "Injamul Haq";
            System.out.println("Block Age: " + age);
        }

        int age = 23;
        System.out.println("Outside block age: " + age);
        System.out.println(name); /// output will be Injamul Haq
    }
}
