package eunjeong.company.scar;

import java.util.ArrayList;
import java.util.Arrays;

class Block{
	
	int start;
	int end;

	public Block(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
}
class Solution1 {


	public static int[] solution(int[][] paths) {
		//��� ����� ���� ��ülist ����
		ArrayList<Block> blocks= new ArrayList<Block>();
		
		//������ ������ ����Ʈ�� ��� ���
		for(int i=0;i<paths.length;i++) {
			Block block=new Block(paths[i][0],paths[i][1]);
			blocks.add(block);
		}
		//��� ���� ����
		int size=blocks.size();
		
		for(int k=0;k<size;k++) {
			//������� �� �ش� ����� ������ tail�� ����
			int tail=blocks.get(k).end;
			for(int j=0;j<size;j++) {
				//tail�� �ٸ� ����� ���۰��� ���ٸ� �ش� ����� ������ �ٸ� ����� ���۰����� �����ϰ� tail�� �� ���۰����� �����Ͽ� �ٽ� �˻��Ѵ�.
				if(tail==blocks.get(j).start) {
					blocks.get(k).end=blocks.get(j).end;
					tail=blocks.get(j).end;
					blocks.remove(blocks.get(j));
					size--;
					j=0;
					
				}
			}
		}
		//������ answer�� ��ü��ϼ��� 2�� ���̷� ����
		int[] answer=new int[blocks.size()*2];
		//answer�� ���� �ֱ� ���� index ���� �ʱ�ȭ
		int index=0;
		//��Ͽ��� �ϳ��� ���� ���� answer�� ����
		for(Block b:blocks) {
			answer[index]=b.start;
			answer[index+1]=b.end;
			index+=2;
		}
	
		for(int a:answer) System.out.print(a+" ");
		System.out.println();
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= { {1,2},{2,3},{3,4},{8,7},{7,6}};
		int[][] B= { {1,2},{4,5},{10,9},{3,4}};
		System.out.println("answer is "+solution(A));
		System.out.println("answer is "+solution(B));
	}

}
