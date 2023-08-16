package Linear_Serach;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Sohag";
        char target = 'g';

        boolean result = search(name, target);
        System.out.println(result);

    }

    static boolean search(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        // for (int i = 0; i < name.length(); i++) {
        // if(name.charAt(i) == target){
        // return true;
        // }
        // }

        // user for each loop
        for (char ch : name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
