package Variables;

public class Types {
    public static void main(String[] args) {
        int age = 23;

        double gpa = 3.91;

        char grade = 'A'; 

        boolean isStudent = true;
        
        String name = "Abid Hasan Hujaifa";

        System.out.println("My name is "+name);
        System.out.println("I am "+ age +" years old");
        System.out.println("My GPA is : "+gpa);
        System.out.println("My average grade is : "+ grade);
        if(isStudent)
        {
            System.out.println("I am a student now");
        }
        else
        {
            System.out.println("I am not a student now");
        }
    }
}
