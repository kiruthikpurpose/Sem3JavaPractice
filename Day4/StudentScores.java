public class StudentScores {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 88};
        calculateScores(scores);
    }
    
    public static void calculateScores(int[] scores) {
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        
        for (int score : scores) {
            sum += score;
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }
        
        double average = (double) sum / scores.length;
        
        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
