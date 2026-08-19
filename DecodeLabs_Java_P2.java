import java.util.Scanner;

public class DecodeLabs_Java_P2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many subjects are there? ");
        int numberOfSubjects = sc.nextInt();
        
        int total = 0; 
        
        for (int i = 1; i <= numberOfSubjects; i++) {
            int marks;
            
            do {
                System.out.print("Marks for subject " + i + " (0-100): ");
                marks = sc.nextInt();
                
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            } while (marks < 0 || marks > 100);
            
            total += marks;
        }
        
        double percentage = (double) total / numberOfSubjects;
    
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("\n--- Result Sheet ---");
        System.out.println("Total Marks: " + total + "/" + (numberOfSubjects * 100));
        System.out.printf("Percentage: %.2f%%\n", percentage);  
        
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}