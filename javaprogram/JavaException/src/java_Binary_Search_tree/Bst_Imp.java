package java_Binary_Search_tree;

import java.util.ArrayList;
import java.util.Scanner;

class Node
{
	int data;
	Node left,right;
	Node(int v)
	{
		data=v;
		left=right=null;
	}
}
public class Bst_Imp {

	static ArrayList<Integer>l=new ArrayList<>();

	public static Node insert(Node root,int d)
	{
		if(root==null)
		{	
			Node p=new Node(d);
			return p;
		}
		if(d<root.data)
		{
			root.left=insert(root.left,d);
			return root;
		}
		else
		{
			root.right=insert(root.right,d);
			return root;
		}
	
	}
	public static void inorder(Node root)
	{
		if(root==null)
			return  ;
		else
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
	}
	public static boolean search(Node root,int v)
	{
		if(root==null)
			return false;
		if(root.data==v)
			return true;
		else if(v<root.data)
		{
			return search(root.left,v);
		}
		else
			return search(root.right,v);
		
	}
	public static boolean checkbst(Node root)
	{
		
		if(root==null)
			return false;
		else
		{
			checkbst(root.left);
			l.add(root.data);
			checkbst(root.right);
		}
		for(int i=1;i<l.size();i++)
		{
			if(l.indexOf(i)<l.indexOf(i-1));
				return false;
		}
		return true;
	}
	public static int minimumDis(Node root)
	{
		
		int mini=Integer.MAX_VALUE;
		for(int i=1;i<l.size();i++)
		{
			mini=Math.min(mini, l.get(i)-l.get(i-1));
		}
		return mini;
	}
	static int sumofkel(int k)
	{
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum+=l.get(i);
			
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		Scanner sc=new Scanner(System.in);
		int el,d;
		while(true)
		{
			System.out.println("\n1.Insert");
			System.out.println("2.Traverse");
			System.out.println("3.Search ");
			System.out.println("4.check bst ");
			System.out.println("5.Minimum Distance between the two nodes ");
			System.out.println("6.Sum of first k element ");
			System.out.println("\nEnter your choice ");
			int ch=sc.nextInt();
			boolean ans;
			switch(ch)
			{
				case 1:System.out.println("Enter the data ");
						d=sc.nextInt();
						 root=insert(root,d);
						break;
				case 2:inorder(root);
						break;
				case 3:System.out.println("Enter the searching element ");
						el=sc.nextInt();
						boolean found=search(root,el);
						System.out.println("element is present: "+found);
						break;
				case 4:ans=checkbst(root);
						if(ans)
							System.out.println("The Tree is BST");
						else
							System.out.println("Tree is not bst");
						break;
				case 5:el=minimumDis(root);
						System.out.println("Minimum Distance betweent two node is "+el);
						break;
				case 6:el=sumofkel(3);
						System.out.println("Sum of first k element is "+el);
						break;
				default:System.out.println("Your choice is invalid ");
						break;
			}
			
		}
	}

}
