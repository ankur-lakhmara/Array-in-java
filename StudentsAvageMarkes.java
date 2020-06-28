import java.util.Scanner;

public class StudentsAvageMarks {
    public static void main(String[]arg){
        System.out.println("Enter Total number of students");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter the marks of 1st students");

        for(int i = 0; i<n ; i++) {
            marks[i] = sc.nextInt(); // to allocate the memory address for 'n' numbers thats entred by the user.
            if (i == 0)
                System.out.println("enter the " + (i + 2) + "nd number student marks"); // this is for 2nd number that's entered by the user
            if (i == 1)
                System.out.println("enter the " + (i + 2) + "rd number student marks");// this is for 3rd number
            if (i >= 2)
                System.out.println("enter the " + (i + 2) + "th number student marks");// this is for 4th and greater than 4
        }

        int AverageMarks = 0;
        for(int i = 0; i<n; i++){
            AverageMarks += marks[i]; //the all average marks are store in the variable AverageMarks
        }
        AverageMarks/=n; //to find the average of 'n' numbers
        System.out.println("the average is "+AverageMarks);
    }
}











