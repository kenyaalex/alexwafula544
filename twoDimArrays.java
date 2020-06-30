import java.util.Scanner;

public class twoDimArrays {

	public static void main(String[] args) {
		int[][]arr= new int[3] [3];
		Scanner scanner=new Scanner(System.in);
		for(int x=0;x<3;x++ ) {
			for(int y=0;y<2;y++) {
				System.out.print("add elements x ["+x+"]y["+y+"] ");
		arr[x][y]=scanner.nextInt();
			}
		

	}
		for(int w=0;w<3;w++)
			for (int j=0;j<2;j++)
				System.out.println("arr ["+w+"]["+j+"]=" +arr[w][j]);

}
}
