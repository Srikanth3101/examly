package examly;
import java.util.*;
class questions{
	static int count[]=new int[8];
	int find_ans()
	{
		int c=0;
		Scanner s=new Scanner(System.in);
		String ans;
		System.out.print("Multiple choice Questions:\nChoose the correct options\n\n"); 	
		System.out.println("1.A person crosses a 600 m long street in 5 minutes. What is his speed in km per hour? \nA. 3.6\nB. 7.2\nC. 8.4\nD. 10\n ");
		ans=s.next();
		if(ans.equalsIgnoreCase("B"));
		{
			count[1]++;
			c++;
		}
		System.out.println("2. An aeroplane covers a certain distance at a speed of 240 kmph in 5 hours. To cover the same distance in 1 hours, it must travel at a speed of:");
		System.out.println("A.	300 kmph\nB.	360 kmph\nC.	600 kmph\nD.	720 kmph");
		ans=s.next();
		if(ans.equalsIgnoreCase("D"))
		{
			c++;
			count[2]++;
		}
		System.out.println("3.If a person walks at 14 km/hr instead of 10 km/hr, he would have walked 20 km more. The actual distance travelled by him is:");
		System.out.println("A.	50 km\nB.	56 km\nC.	70 km\nD.	80 km");
		ans=s.next();
		if(ans.equalsIgnoreCase("A"))
		{
			count[3]++;
			c++;
		}
		System.out.println("4.A train can travel 50% faster than a car. Both start from point A at the same time and reach point B 75 kms away from A at the same time. On the way, however, the train lost about 12.5 minutes while stopping at the stations. The speed of the car is:\nA.	100 kmph\nB.	110 kmph\nC.	120 kmph\nD.	130 kmph");
		ans=s.next();
		if(ans.equalsIgnoreCase("C"))
		{
			c++;
			count[4]++;
		}
		System.out.println("5. 	Excluding stoppages, the speed of a bus is 54 kmph and including stoppages, it is 45 kmph. For how many minutes does the bus stop per hour?\nA.	9\nB.	10\nC.	12\nD.	20");
		ans=s.next();
		if(ans.equalsIgnoreCase("B"))
		{
			count[5]++;
			c++;
		}
		System.out.println("6. 	What percentage of numbers from 1 to 70 have 1 or 9 in the unit's digit?/nA.	1\nB.	14\nC.	20\nD.	21");
		ans=s.next();
		if(ans.equalsIgnoreCase("C"))
		{
			count[6]++;
			c++;
		}
		System.out.println("7. 	If A = x% of y and B = y% of x, then which of the following is true?\nA.	A is smaller than B.\nB.	A is greater than B\nC.	Relationship between A and B cannot be determined.\nD.	If x is smaller than y, then A is greater than B.\nE.	None of these");
		ans=s.next();
		if(ans.equalsIgnoreCase("E"))
		{
			count[7]++;
			c++;
		}
		return c;
	}
}
class difficulty{
	void calculate(int count[],int c)
	{
		System.out.print("the difficiulty of the questions are\n");
		for(int i=1;i<count.length;i++)
		{
			System.out.print("Question number "+i+" is ");
			if(count[i]<c/2)
				System.out.print("Hard");
			else if(count[i]>=c-2)
				System.out.print("Easy");
			else
				System.out.print("Medium");
			System.out.println("\tNo of students attended : "+c+"  No of correct answers : "+count[i]);
		}
	}
}
class student{
	void each_student(double time,int count,int l)
	{
		int k=l-count;
		System.out.println("total questions : "+l+"\tno ofquestions correct : "+count+"\tno of questions wrong : "+k+"\ttime taken : "+time+"s");
	}
}
public class main_program {
	public static void main(String args[])
	{
		int c=1;
		Scanner s=new Scanner(System.in);
		questions q=new questions();
		difficulty d=new difficulty();
		student s1=new student();
		System.out.println("enter no of students going to attend the test");
		int t=s.nextInt();
		while(t-->0)
		{
			System.out.println("student number : "+c);
			long start=System.currentTimeMillis();
			int v=q.find_ans();
			long end=System.currentTimeMillis();
			double time=(end-start)/1000;
			s1.each_student(time,v,q.count.length-1);
			c++;
		}
		d.calculate(q.count,c-1);
		s.close();
	}
}
