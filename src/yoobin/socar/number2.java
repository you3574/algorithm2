package yoobin.socar;
import java.util.*;

class Graph {
	int weight;
	int end;
	
	Graph(int end, int weight){
		this.weight = weight;
		this.end = end;
	}
}

public class number2 {

	public static void main(String[] args) {
		//�׷����� �����غ���.
		int N, M;
		ArrayList<ArrayList<Graph>> test = new ArrayList<ArrayList<Graph>>();
		
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		M = input.nextInt();
		
		for(int i=0; i<10; i++){
			test.add(new ArrayList<Graph>());
		}
		
		for(int i=0; i<M; i++){
			int start, end, weight;
			start = input.nextInt();
			end = input.nextInt();	
			weight = input.nextInt();
			
			Graph element = new Graph(end, weight);			//����Ʈ�� �־��� element
			test.get(start).add(element);
			Graph element2 = new Graph(start, weight);
			test.get(end).add(element2);
		}
		
		
		for(int i=0; i<test.size(); i++){
			System.out.print(i + " : ");
			for(int j=0; j<test.get(i).size(); j++){
				System.out.print(test.get(i).get(j).end + " / " + test.get(i).get(j).weight + " ");
			}
			System.out.println();
		}
			
	}
}