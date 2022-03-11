package model;

public class ChessModel {
	
		private boolean thisTurn = false;
		Object[][] chessBoard;
		
		
		public ChessModel() {
			chessBoard = new Object[8][8];
		}
		
		public void setMyTurn(boolean mine) {
			thisTurn = mine;
		}
		
		public boolean isMyTurn() {
			return thisTurn;
		}
		
		public Move[] getPossibleMoves(int x, int y) {
			// TODO Auto-generated method stub
			return null;
		}
}
