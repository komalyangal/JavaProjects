import java.util.Scanner;
interface opration
{
	int push(int arr[],int top,int d,int n);
	int pop(int arr[],int top);
	int display(int arr[],int top);
	void peek(int arr[],int top);
}
interface qoperation
{
	void enqueue(int d);
	void dequeue();
	void display();
}
class Queue_opration implements qoperation
{	
	int fr,rr;
	
	int arr[],size;
	Queue_opration(int n)
	{
		
		size=n;
		arr=new int[size];	
		fr=rr=-1;
	}
	public void enqueue(int d)
	{
		if(rr==size-1)	
			System.out.println("Queue overflow\n");	
		
		else{
			arr[++rr]=d;
			fr=0;	
		}	
	
	}
	public void display()
	{
		if(fr==-1 && rr==-1)
			System.out.println("Queue is empty \n");
		else
		{
			for(int i=fr;i<=rr;i++)
				System.out.print(arr[i]+" ");	
		}
		
	}
	public void dequeue()
	{
		int d;
		if(fr==-1 && rr==-1)
			System.out.println("Queue underflow\n");
		else if(fr==rr)
		{
			d=arr[fr];
			System.out.println("Dequeue element is "+d);
			fr=rr=-1;		
		}
		else 
		{
			d=arr[fr];
			fr++;
			System.out.println("Dequeue element is "+d);
		}
		
		
	}

}
	
class Stack_opration implements opration
{
  	public int push(int arr[],int top,int d,int n)
	{
		if(top==n-1)
		{
			System.out.println("Stack overflow\n");
		}	
		else
		{	
			arr[++top]=d;	
			System.out.println(top);
		}
		return top;
	}
	public int pop(int arr[],int top)
	{
		int p;
		if(top==-1)
			System.out.println("Stack underflow\n");
		else
		{
			p=arr[top--];
			System.out.println("poped element "+p);
		}
		return top;
			
	}
	public int display(int arr[],int top)
	{
		if(top==-1)
			System.out.println("Stack underflow\n");
		else
		{
			for(int i=top;i>=0;i--)
				System.out.print(arr[i]+" ");
		}
		return top;
	}
	public void peek(int arr[],int top)
	{
		if(top==-1)
			System.out.println("Stack underflow\n");
		else
			System.out.println("Peek value is "+arr[top]);
	}
}
class Stackop
{
	public static void main(String [] arg)
	{
		int top,n,d,ch,ch1,res;
		top=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		n=sc.nextInt();
		int arr[]=new int[n];

		 Stack_opration s=new Stack_opration();
		 Queue_opration q=new  Queue_opration(n);
		while(true)
		{
			System.out.println("\n\n1.Stack\n2.Queue\n3.Exit\n\nEnter your choice ");
			ch1=sc.nextInt();
			if(ch1==1)
			{
				System.out.println("\n\n1.push\n2.pop\n3.peek\n4.Display\n5.Exit\n");	
				System.out.println("Enter the choice ");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:System.out.println("Enter the data ");
				  	 	d=sc.nextInt();
						top=s.push(arr,top,d,n);
						System.out.println(" result"+top);	
						break;
					case 2:System.out.println("pop");
						top=s.pop(arr,top);
						break;
					case 4:System.out.println("Stack elements ");
						top=s.display(arr,top);
						break;
					case 3:s.peek(arr,top);
						break;
					case 5:System.exit(0);
				}
			}
			else if(ch1==2)
			{
				System.out.println("\n\n1.Enqueue\n2.Dequeue\n3.display\n4.Exit\n");
				System.out.println("Enter the choice ");
				ch=sc.nextInt();
				switch(ch)	
				{
					case 1:System.out.println("Enter the data ");
				 	  	d=sc.nextInt();
						q.enqueue(d);
						break;
					case 2:q.dequeue();
						break;
					case 3:System.out.print("\nQueue elements\n");	
						q.display();
						break;
					case 4:System.exit(0);
				}
			}
			else 
				System.exit(0);
			}			
	}
}