public class MultiDimensionalGrades {
    public static void main(String[] args) {
        int[][] scores = {
            {80, 80, 80, 80},
            {80, 80, 80, 80},
            {80, 80, 80, 80}
        };
        calculateAverages(scores);
    }
    
    public static void calculateAverages(int[][] scores) {
        double[] studentAverages = new double[scores.length];
        double[] subjectAverages = new double[scores[0].length];
        double[] subjectSums = new double[scores[0].length];
        
        for (int i = 0; i < scores.length; i++) {
            double studentSum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                studentSum += scores[i][j];
                subjectSums[j] += scores[i][j];
            }
            studentAverages[i] = studentSum / scores[i].length;
        }
        
        for (int i = 0; i < subjectSums.length; i++) {
            subjectAverages[i] = subjectSums[i] / scores.length;
        }
        
        System.out.println("Average scores for each student:");
        for (int i = 0; i < studentAverages.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentAverages[i]);
        }
        
        String[] subjects = {"Math", "Science", "English", "History"};
        System.out.println("Average scores for each subject:");
        for (int i = 0; i < subjectAverages.length; i++) {
            System.out.println(subjects[i] + ": " + subjectAverages[i]);
        }
    }
}
