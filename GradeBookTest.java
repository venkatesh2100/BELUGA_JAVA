import java.util.Scanner;

public class GradeBookTest {
  public class GradeBook{
  public String courseName;//Name of the course
  public GradeBook(String name){//intialize constructor course name
    courseName=name;
  }
  public void setcourseName(String name){//create a meathod setcousre
    courseName=name;
  }
  public String getcourseName(String name){//create a method getcoursess
    return name;
  }
  public void displayMessage(){
    System.out.printf("Welcome to the Grade Book for \n%s \n",getcourseName(courseName));
  }
  public void classAvg(){//creating a Function to Determine the avearge of the class
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the Total Number of students?");
    int total=in.nextInt();
    int sum=0;
    int grade;


    for(int i=1;i<=total;i++){
      System.out.println("Enter the Grade:");
      grade=in.nextInt();
      sum+=grade;


    }
    in.close();
    int average=sum/total;
    System.out.printf("Total of %d Grades is %s",total,sum);
    System.out.printf("Average of class Grade Book is %s",average);
  }
}
public static void main(String[] args) {
  //"Introduction to DataBase Management");
  GradeBook myGradeBook = new GradeBook( "CS101 Introduction to Java Programming");
 myGradeBook.displayMessage(); // display welcome message
  myGradeBook.classAvg();

}
}
