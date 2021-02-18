import java.util.Scanner;
public class Student implements IMath {

	@Override
	public void add() {
		 @SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
         System.out.println("Enter any two integer values to perform addition");
         int a=kb.nextInt();
         int b=kb.nextInt();
         int s=a+b;
         System.out.println("Sum of "+a+" and "+b+" is "+s);
	}

	@Override
	public void sub() {
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Substraction");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("Difference of "+a+" and "+b+" is "+s);

	}

	@Override
	public void mul() {
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
        System.out.println("Enter any two integer values multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Product of "+a+" and "+b+" is "+s);
	}

	@Override
	public void div() {
		 @SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
         System.out.println("Enter any two integer values division");
         int a=kb.nextInt();
         int b=kb.nextInt();
         int s=a/b;
         System.out.println("Quotient of "+a+" and "+b+" is "+s);
	}

	public static void main(String[] args) {
		Student s1=new Student();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();

	}

}
