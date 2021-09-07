import java.util.*;

public class GeneralStudent{

    private String name,department,collegename;
    private String [] subjects;

    private int rollno;
    private int []marks;

    void enterDetails(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name :");
        name = input.nextLine();

        System.out.println("Enter roll number :");
        rollno = input.nextInt();

        System.out.println("Enter department name :");
        department = input.nextLine();

        System.out.println("Enter college name :");
        collegename = input.nextLine();

        System.out.println("Enter name of 5 subjects :");
        subjects = new String[5];
        for(int i=0; i<5; i++){
            subjects[i] = input.nextLine();
        } 
        System.out.println("Enter marks for each subject  ;");
        marks = new int[5];
        for(int i=0; i<5; i++){
            marks[i] = input.nextInt();
        }  

    }

    float average(){
        int total = 0;
        float avg;

        for(int i = 0; i<5; i++){
            total +=marks[i];
        }

        avg = (float)total / 5;

        return avg;

    }

    void display(int roll){
        this
    }
}