import java.util.Scanner;
public class Score{
   
public static void main(String[] args){

Scanner inputValue = new Scanner(System.in);

int total = 0;
for(int count = 1; count<=5; count++){
System.out.printf("Enter number:");
int number = inputValue.nextInt();
int total = total + number;
}


int average = (initialNumber )/5;
System.out.println("the average is "+ average+" ");

System.out.println("the total sum is "+ total);

}
}