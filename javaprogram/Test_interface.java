import java.util.Scanner;

interface s_tack {
	public void push(int data);
	public void pop();
}

interface q_ueue
{
	public void enqueue(int data);
	public void dequeue();
}
 
class stack implements s_tack 
{
	int top, data, size, sarr[];

	stack(int size) 
	{
		sarr = new int[size];
		top = -1;
		this.size = size;
	}

	public void push(int data) 
	{
		if (top == size - 1) 
		{
			System.out.println("Data inserted");
			System.out.println("Stack is full");
		} else 
		{
			top++;
			sarr[top] = data;
		}
	}

	public void pop()
	 {
		if (top == -1)
		{
			System.out.println("\n Stack underflow");
		} else 
		{
			int a;
			a = sarr[top];
			top--;
			System.out.println("\n the element poped is :" + a);
		}
	}
}


class queue implements q_ueue 
{
	int fr,rr,data,size,qarr[];
	queue(int size)
	{
		this.size=size;
		qarr=new int[size];
		fr=rr=-1;
	}
	public void enqueue(int data)
	{
		if(rr==size-1)
		{
			System.out.println("\n overflow");
						
		}
		else if (rr==fr)
		{
		

			qarr[rr]=data;
			System.out.println("\n element added successfully");
		}
		else
		{
			rr++;
			qarr[rr]=data;
			System.out.println("\n element added successfully");
		}
	}
	
	public void dequeue()
	{
		int a;
		if(fr==-1 && rr==-1)
		{
			System.out.println("\n underflow");
		}
		else if(rr==fr)
		{
			a=qarr[rr];
			fr=rr=-1;
			System.out.println("\n element dequed "+a);
			
		}
		else
		{
			a=qarr[fr];
			fr++;
			System.out.println("\n element dequed ");
		}
	}
}

class test_interface 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size,ch;
		System.out.println("enter the size of the array of stack or queue\n");
		size = sc.nextInt();
		stack s = new stack(size);
		queue q = new queue(size);
		while (true) 
		{
			System.out.println("enter your choice \n 1.stack \n 2.queue");
			ch = sc.nextInt();
			switch (ch) 
			{
				case 1:
					System.out.println("Enter your choice\n 1.push \n 2.pop \n");
					ch = sc.nextInt();
					switch (ch) 
					{
						case 1:
							int data;
							System.out.println("Enter the data to be pushed");
							data = sc.nextInt();
							s.push(data);
							break;

						case 2:
							s.pop();
							break;

						default:
							break;
					}
				case 2:
					System.out.println("\n enter your choice \n 1.enqueue\n 2.dequeue\n");
					ch=sc.nextInt();
					switch (ch) 
					{
						case 1:
							int data1;
							System.out.println("Enter the data tp be added into the queue\n");
							data1=sc.nextInt();
							q.enqueue(data1);
							break;
						
						case 2:
							q.dequeue();
							break;

						default:
							break;
					}
				
				default:
					break;
			}
		}
	}
}