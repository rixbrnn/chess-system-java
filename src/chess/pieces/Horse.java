package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Horse extends ChessPiece {

	public Horse(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "H";
	}

	@Override
	public boolean[][] possibleMoves() {

		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);

		// first
		p.setValues(this.position.getRow() - 2, this.position.getColumn() + 1);
		if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		// second
		p.setValues(this.position.getRow() - 1, this.position.getColumn() + 2);
		if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		// third
		p.setValues(this.position.getRow() + 1, this.position.getColumn() + 2);
		if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		// fourth
		p.setValues(this.position.getRow() - 2, this.position.getColumn() + 1);
		if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		// fifth
		p.setValues(this.position.getRow() - 2, this.position.getColumn() - 1);
		if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		// sixth
		p.setValues(this.position.getRow() + 1, this.position.getColumn() - 2);
		if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		// seventh
		p.setValues(this.position.getRow() - 1, this.position.getColumn() - 2);
		if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		// eighth
		p.setValues(this.position.getRow() - 2, this.position.getColumn() - 1);
		if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		return mat;

	}

}
