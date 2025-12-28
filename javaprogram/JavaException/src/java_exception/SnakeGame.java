//package java_exception;
//
//import java.util.*;
//
//public class SnakeGame
//{
//	private int width,height;
//	private LinkedList<Integer[]>snake;
//	private List<String>moves;
//	private Set<String>occupied;
//	private String direction;
//	
//	private static final Map<String,Integer[]> DIRS=Map.of(
//			"U",new int[]{-1,0},
//			"D",new int[]{1,0},
//			"L",new int[]{0,-1},
//			"R",new int[]{0,1}
//			);
//	
//	public SnakeGame(int height,int width,List<String> moves)
//	{
//		this.height=height;
//		this.width=width;
//		this.moves=moves;
//		this.snake=new LinkedList<>();
//		this.oocupied
//	}
//	
//
//	void run()
//	{
//		
//		
//		
//	}
//	private void printSnakeState()
//	{
//		int [] head=snake.peekLast();
//		System.out.println("Final head position:("+head[0]+","+head[1]+")");
//		System.out.println("Facing Direction "+direction);
//		System.out.println("Occupied cells: ");
//		for(int [] part:snake)
//		{
//			System.out.println("("+part[0]+","+part[1]+")");
//			System.out.println();	
//		}	
//	}
//	public static void main(String [] args)
//	{
//		List<String> testMoves=Arrays.asList("R","R","D","D","L","U","R","D");
//		SnakeGame game=new SnakeGame(5,5,testMoves);
//		game.run();
//	}
//	
//	
//}
