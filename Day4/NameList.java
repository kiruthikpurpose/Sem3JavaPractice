public class NameList {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlotte", "David", "Eve"};
        manageNames(names);
    }
    
    public static void manageNames(String[] names) {
        String longestName = names[0];
        String shortestName = names[0];
        
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            if (name.length() < shortestName.length()) {
                shortestName = name;
            }
        }
        
        System.out.print("Names in Reverse Order: ");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
        
        System.out.println("Longest Name: " + longestName);
        System.out.println("Shortest Name: " + shortestName);
    }
}
