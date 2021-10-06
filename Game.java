import java.util.*;

public class Game {
	
	static char[][] board = {
			{' ','|',' ','|',' '},
			{'-','+','-','+','-'},
			{' ','|',' ','|',' '},
			{'-','+','-','+','-'},
			{' ','|',' ','|',' '}
	};
	static String p1,p2;
	
	public static void printBoard(char[][] board) {
		for(char[] row : board) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public static void mark(char[][] board,int pos,String player) {
		char mark;
		if(player.equals("Player 1")) {
			mark = 'X';
		}else {
			mark = 'O';
		}
		switch(pos) {
		case 1:
			board[0][0] = mark;
			break;
		case 2:
			board[0][2] = mark;
			break;
		case 3:
			board[0][4] = mark;
			break;
		case 4:
			board[2][0] = mark;
			break;
		case 5:
			board[2][2] = mark;
			break;
		case 6:
			board[2][4] = mark;
			break;
		case 7:
			board[4][0] = mark;
			break;
		case 8:
			board[4][2] = mark;
			break;
		case 9:
			board[4][4] = mark;
			break;
		default:
			break;
		}
	}
	
	public static char checkWin() {
		if((board[0][0]=='X' && board[0][2]=='X' && board[0][4]=='X')||(board[0][0]=='O' && board[0][2]=='O' && board[0][4]=='O')) {
			return board[0][0];
		}else if((board[2][0]=='X' && board[2][2]=='X' && board[2][4]=='X')||(board[2][0]=='O' && board[2][2]=='O' && board[2][4]=='O')) {
			return board[2][0];
		}else if((board[4][0]=='X' && board[4][2]=='X' && board[4][4]=='X')||(board[4][0]=='O' && board[4][2]=='O' && board[4][4]=='O')) {
			return board[4][0];
		}else if((board[0][0]=='X' && board[2][0]=='X' && board[4][0]=='X')||(board[0][0]=='X' && board[2][0]=='X' && board[4][0]=='X')) {
			return board[0][0];
		}else if((board[0][2]=='X' && board[2][2]=='X' && board[4][2]=='X')||(board[0][2]=='X' && board[2][2]=='X' && board[4][2]=='X')) {
			return board[0][2];
		}else if((board[0][4]=='X' && board[2][4]=='X' && board[4][4]=='X')||(board[0][4]=='X' && board[2][4]=='X' && board[4][4]=='X')) {
			return board[0][4];
		}else if((board[0][0]=='X' && board[2][2]=='X' && board[4][4]=='X')||(board[0][0]=='X' && board[2][2]=='X' && board[4][4]=='X')) {
			return board[0][0];
		}else if((board[0][4]=='X' && board[2][2]=='X' && board[4][0]=='X')||(board[0][4]=='X' && board[2][2]=='X' && board[4][0]=='X')) {
			return board[0][4];
		}else {
			return ' ';
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos,i;
		char flag = ' ';
		System.out.println("Enter Player 1 name: ");
		p1 = sc.next();
		System.out.println("Enter Player 1 name: ");
		p2 = sc.next();
		printBoard(board);
		for(i=0;i<9;i++) {
			if(i%2==0) {
				System.out.println(p1+"'s turn, Enter position: ");
				pos = sc.nextInt();
				mark(board, pos, "Player 1");
				printBoard(board);
				flag = checkWin();
			}else {
				System.out.println(p2+"'s turn, Enter position: ");
				pos = sc.nextInt();
				mark(board, pos, "Player 2");
				printBoard(board);
				flag = checkWin();
			}
			if(flag=='X') {
				System.out.println(p1+" wins...");
				break;
			}else if(flag=='O') {
				System.out.println(p2+" wins...");
				break;
			}
		}
		if(flag==' ') {
			System.out.println("Game is tie...");
		}
	}
}
