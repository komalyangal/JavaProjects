package com.app.fruits.tester;
import com.app.fruits.*;
import java.util.Scanner;

public class FruitBasket {
	
	public static int menu(Scanner sc)
	{
		System.out.println("*********************");
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Disply all fruit names ");
		System.out.println("5.Display fresh fruit details ");
		System.out.println("6.Taste of all stale fruit ");
		System.out.println("7.Mark fruit as stale ");
		System.out.println("8.Marks sour fruit as stale ");

		System.out.println("*********************");
		System.out.println("Enter your choice ");
		return sc.nextInt();


	}
	
	public static void display(Fruit []fruList)
	{
		for(Fruit ele:fruList)
		{
			if(ele!= null && ele.isFresh())
			{
					System.out.println(ele);
					ele.taste();
			}
		}
	}

	public static void main(String[] args) {
			int n;
			Scanner sc=new Scanner(System.in);
			int choice,index=0;
//			String color;
//			double weight;
			
			System.out.println("Enter number of fruits in basket ");
			n=sc.nextInt();
			Fruit fruList[]=new Fruit[n];
			while((choice = menu(sc))!=0)
			{
				switch (choice) {
				case 1:
					if(index<n)
					{
//						System.out.println("Enter color of mango");
//						color=sc.next();
//						System.out.println("Enter weight ");
//						weight=sc.nextDouble();
//						fruList[index++]=new Mango(color,weight);
						
						fruList[index]=new Mango();
						fruList[index++].accept(sc);
					}
					else
						System.out.println("Busket is full ");
					break;
					
				case 2:
					if(index<n)
					{
//						System.out.println("Enter color of orange");
//						color=sc.next();
//						System.out.println("Enter weight ");
//						weight=sc.nextDouble();
//						fruList[index++]=new Orange(color,weight);
						
						fruList[index]=new Orange();
						fruList[index++].accept(sc);
					}
					else
						System.out.println("Busket is full ");
					break;
					
				case 3:
					if(index<n)
					{
//						System.out.println("Enter color of apple");
//						color=sc.next();
//						System.out.println("Enter weight ");
//						weight=sc.nextDouble();
						
//						fruList[index++]=new Apple(color,weight);
						
						fruList[index]=new Apple();
						fruList[index++].accept(sc);
					}
					else
						System.out.println("Busket is full ");
	
					break;
	
				case 4:
					System.out.println("Name of all fruit in the basket is- ");
					for(Fruit fru:fruList)
					{
						if(fru!=null)
						{
							System.out.println(fru.getName());
						}
					}
					break;
	
				case 5:
					display(fruList);
	
					break;

				case 6:
					 System.out.println("Taste of all stale fruit is as follows - ");
					 int cnt=0;
					for(Fruit fru:fruList)
					{
						if(fru!=null)
						{
							cnt++;
							if(!fru.isFresh())
							{
								System.out.println(fru.taste());
							}
						}
						if(cnt==n)
							System.out.println("There are no stale fruits in the basket ");
					}
					break;
					
				case 7:
					System.out.println("Enter the index of fruit which is stale ");
					int ind=sc.nextInt();
					
					if(ind<n)
						fruList[ind].setFresh(false);
					else
					{
						System.out.println("Invalid index such indexed fruit is not present ");
					}
					
					break;
				case 8:
					String tas="sour";
					for(Fruit fru:fruList)
					{
						if(fru!=null && fru.taste().equals(tas))
						{
							
								fru.setFresh(false);
								System.out.println(fru.getName());
								
						}
					}
					break;
				default:
					break;
				}
			}
	}

}
