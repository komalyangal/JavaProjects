package Java_Graph;

import java.util.*;

public class dfs {
	
	private Map<Integer ,List<Integer>> adsl;
	
	public dfs()
	{
		adsl=new HashMap<>();
	}
	public void addEdge(int u,int v )
	{
		adsl.putIfAbsent(u,new ArrayList<>());
		adsl.get(u).add(v);
	}
	public void dfsTravarsal(int start)
	{
		Set<Integer>visited=new HashSet<>();
		System.out.println("Dfs started from node "+start+":");
		dfsHelper(start,visited);
		System.out.println();
	}
	private void dfsHelper(int node,Set<Integer> visited)
	{
		visited.add(node);
		System.out.println(node+" ");
		
		for(int nei:adsl.getOrDefault(node,new ArrayList<>()))
		{
			if(!visited.contains(nei))
			{
				dfsHelper(nei,visited);
			}
		}
		
	}
	public static void main(String [] arg)
	{
		dfs a=new dfs();
		a.addEdge(0, 1);
		a.addEdge(0, 2);
		a.addEdge(1, 2);
		a.addEdge(2, 0);
		a.addEdge(2, 3);
		a.addEdge(3, 3);
		
		a.dfsTravarsal(2);
	}
}
