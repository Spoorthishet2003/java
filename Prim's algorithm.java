//Find Minimum Cost Spanning Tree of a given connected undirected graph using Prim's algorithm.

package greedy;
import java.util.Scanner;
public class Prims 
{
	static int ne=1,min_cost=0;
	static int cost[][]=new int[20][20];
	static int d[]=new int[20];
	static int visited[]=new int[20];
	static int v,u,a,b;
	public static void main(String arg[])
	{
		int n,i,j,min,source;
		Scanner s=new Scanner(System.in);
		System.out.println("enter nos of vertices:");
		n=s.nextInt();
		System.out.println("Enter the cost adjacency matrix: ");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				cost[i][j]=s.nextInt();
			}
		}
		for(i=1;i<=n;i++)
			visited[i]=0;
		System.out.println("Enter the root node:");
		source=s.nextInt();
		visited[source]=1;
		System.out.println("\nMinimum cost spanning tree is\n");
		while(ne<n)
		{
			min=999;
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(cost[i][j]<min)
						if(visited[i]==0)
							continue;
					else
					{
						min=cost[i][j];
						a=u=i;
						b=v=j;
					}
				}
			}
			if(visited[u]==0||visited[v]==0)
			{
				System.out.println("\nEdge"+(ne++)+"\t"+a+"->"+b+":"+min);
				min_cost=min_cost+min;
				visited[b]=1;
			}
			cost[a][b]=cost[b][a]=999;
		}
		System.out.println("\nMinimum cost="+min_cost);
	}
}
