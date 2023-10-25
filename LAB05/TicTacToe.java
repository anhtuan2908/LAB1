package LAB05;

public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;
	
	public TicTacToe(char[][] board) {
		super();
		this.board = board;
	}

	public boolean checkRows() {
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] != EMPTY && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;
			}
		}	
		return false;	
	}
	
	public boolean checkColumns() {
		for (int i = 0; i < board.length; i++) {
			if (board[0][i] != EMPTY && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				return true;
			}
		}
		return false;
	}
	public boolean checkDiagonals() {
		if (board[0][0] != EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			return true;
		}
		if (board[0][2] != EMPTY && board[2][0] == board[1][1] && board[1][1] == board[2][0]) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		char[][] board = { { 'X', 'O', 'X' }, { 'O', 'X', 'O' }, { 'O', 'X', 'O' } };
		//            X      O     X
		//			  O  	 X	   O
		//			  O	     X 	   O
		char[][] board2 = { { 'X', 'O', 'X' }, { 'O', 'X', 'O' }, { 'O', 'X', 'X' } };
		//     		  X      O     X
		//			  O  	 X	   O
		//			  O	     X 	   X
		
		
		
		
		TicTacToe game = new TicTacToe(board);
		if (game.checkColumns() || game.checkRows() || game.checkDiagonals()) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		TicTacToe game2 = new TicTacToe(board2);
		if (game2.checkColumns() || game2.checkRows() || game2.checkDiagonals()) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
	}
}
