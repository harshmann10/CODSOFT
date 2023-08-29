import java.util.Scanner;

public class codsoft_STUDENT_GRADE_CALCULATOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre the number of subject: ");
        int sub = input.nextInt();
        int total = 0;
        for (int i = 1; i <= sub; i++) {
            System.out.println("Entre the marks obtained in subject "+i);
            int marks = input.nextInt();
            total = total + marks;
        }
        double avg = (double) total /sub;
        String grade = calculategrade(avg);

        System.out.println("your total marks are: "+total);
        System.out.println("your Average Percentage are:"+avg);
        System.out.println("your grade based on your marks are: "+grade);
    }

    static String calculategrade(double avg) {
        if(avg >= 100){
            return "A+";
        } else if (avg >= 80) {
            return "A";
        } else if (avg >= 70) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        } else if (avg >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
