package Java_Graph;

import java.util.*;

public class Add_edge {

	Map<Integer ,List<Integer>> adl=new HashMap<>();
	public void  add_Edge(int u,int v)
	{
		adl.putIfAbsent(u,new ArrayList<>());
		adl.get(u).add(v);
	}
	void printGraph()
	{
		for(int node:adl.keySet())
		{
			System.out.print(node+"->");
			for(int neighbor:adl.get(node))
			{
				System.out.print(neighbor+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_edge a=new Add_edge();
		a.add_Edge(0, 1);
		a.add_Edge(0, 2);
		a.add_Edge(1, 2);
		a.add_Edge(2, 0);
		a.add_Edge(0, 0);
		
		a.printGraph();
		
	}

}
