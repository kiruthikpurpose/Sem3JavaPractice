public class StudentGrades {
    public static void main(String[] args) {
        int[][] grades = {
            {85, 92},
            {78, 85},
            {90, 88},
            {95, 94},
            {80, 87}
        };
        printGrades(grades);
        calculateAverages(grades);
    }
    
    public static void printGrades(int[][] grades) {
        System.out.println("Grades of all students:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": Math: " + grades[i][0] + ", Science: " + grades[i][1]);
        }
    }
    
    public static void calculateAverages(int[][] grades) {
        double mathSum = 0;
        double scienceSum = 0;
        
        for (int i = 0; i < grades.length; i++) {
            mathSum += grades[i][0];
            scienceSum += grades[i][1];
        }
        
        double averageMath = mathSum / grades.length;
        double averageScience = scienceSum / grades.length;
        
        System.out.println("Average Math grade: " + averageMath);
        System.out.println("Average Science grade: " + averageScience);
    }
}
