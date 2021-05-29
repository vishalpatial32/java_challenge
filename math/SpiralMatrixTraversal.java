package math;

import java.util.ArrayList;

public class SpiralMatrixTraversal {

	public static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {


		int mat[][]= {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};



		int N=mat.length;
		int top=0;
		int down=N-1;
		int left=0;
		int right=mat[0].length-1;
		int dir=0;

		while (top <=down && left<=right ) {
			if(dir==0) {

				for (int i = left; i <= right; i++) {
					//System.out.println(mat[top][i]);
					list.add(mat[top][i]);
				}
				top+=1;

			}
			else if(dir==1) {
				for (int i = top; i <= down; i++) {
					//System.out.println(mat[top][i]);
					list.add(mat[i][right]);
				}
				right-=1;
			}
			else if(dir==2) {
				for(int i= right;i>=left;i--) {
					//System.out.println(mat[down][i]);
					list.add(mat[down][i]);
				}
				down-=1;
			}

			else if(dir==3) {
				for(int i=down;i>=top;i--) {
					//System.out.println(mat[down][i]);
					list.add(mat[i][left]);
				}
				left+=1;
			}

			dir= (dir+1)%4;

		}

		list.stream().forEach(System.out::println);
		System.out.println(list.size());


	}
}


