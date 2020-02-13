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
		//블록 목록을 담을 객체list 생성
		ArrayList<Block> blocks= new ArrayList<Block>();
		
		//위에서 생성한 리스트에 블록 담기
		for(int i=0;i<paths.length;i++) {
			Block block=new Block(paths[i][0],paths[i][1]);
			blocks.add(block);
		}
		//블록 갯수 저장
		int size=blocks.size();
		
		for(int k=0;k<size;k++) {
			//연결고리가 될 해당 블록의 끝값을 tail로 저장
			int tail=blocks.get(k).end;
			for(int j=0;j<size;j++) {
				//tail이 다른 블록의 시작값과 같다면 해당 블록의 끝값을 다른 블록의 시작값으로 변경하고 tail을 그 시작값으로 변경하여 다시 검색한다.
				if(tail==blocks.get(j).start) {
					blocks.get(k).end=blocks.get(j).end;
					tail=blocks.get(j).end;
					blocks.remove(blocks.get(j));
					size--;
					j=0;
					
				}
			}
		}
		//리턴할 answer을 전체블록수의 2배 길이로 생성
		int[] answer=new int[blocks.size()*2];
		//answer에 값을 넣기 위해 index 변수 초기화
		int index=0;
		//블록에서 하나씩 값을 빼서 answer에 삽입
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
