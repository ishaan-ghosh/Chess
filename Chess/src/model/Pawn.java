package model;

public class Pawn implements Piece {

	private int color;
	private String name = "Pawn";

	@Override
	public int getColor() {
		return this.color;
	}

	@Override
	public void setColor(int color) {
		this.color = color;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Move[] getPossibleMoves(int x, int y, Object[][] chessBoard) {
		// TODO Auto-generated method stub
		return null;
	}

}
