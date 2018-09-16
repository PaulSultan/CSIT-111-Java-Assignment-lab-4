import java.util.*;
   public class Quiz
{

    public static void main(String[] args)
    {
        int num_quiz; //numberon the quiz
        int to_grade;
        int count = 0;
        double total;
          char yesorno='y';
        Scanner scan = new Scanner (System.in);
        System.out.print ("How many questions are in the quiz? ");
        num_quiz =scan.nextInt();    
        int [] answers = new int[num_quiz];
      
       System.out.println("Enter the answer keys for the questions.");
     
           
        for (int i=0; i<answers.length; i++)
             {
  
               answers[i] = scan.nextInt();
             }
     while(yesorno=='y'||yesorno=='Y')
        {count=0;
         for (int i =0; i< answers.length; i++)
          {           
           System.out.println("Enter the answer to be graded : ");
               to_grade = scan.nextInt();
               
               if(to_grade == answers[i])
                      {  
                   ++count;
                      }
            }
      
         total =(double)count / num_quiz *100;
      
        System.out.println("Thenumber of questions correct are: " + count);
        System.out.println("Thepercentage correct is: " +total);
        System.out.println("Grade another Quiz? y/n");
         yesorno=scan.next().charAt(0);
       }
     }  
}      