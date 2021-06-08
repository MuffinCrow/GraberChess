public class Pawn extends Pieces{

    public Pawn(int row, int col, int color) {
        super(row, col, color, 0);
    }
    public boolean canMove(int row, int col) {
        int r = this.getRow();
        int c = this.getColumn();

        if (GameBoard.hasPiece(row, col)) {
            return false;
        } else {
            if (this.getColor() == 0) {
                if (r - 1 == row && c == col && row > -1) {
                    return true;
                }
                return false;
            } else if (this.getColor() == 1) {
                if (r + 1 == row && c == col && row < 8) {
                    return true;
                }
                return false;
            } else {
                return false;
            }
        }
    }

    public boolean canKill(Pieces piece) {
        int r = this.getRow();
        int c = this.getColumn();
        int x = piece.getColumn();
        int y = piece.getRow();

        if (this.getColor() == 0) {
            if (r - 1 == y && (c + 1 == x || c - 1 == x)) {
                if (this.getColor() != piece.getColor()) {
                    return true;
                }
            }
            return false;
        } else if (this.getColor() == 1) {
            if (r + 1 == y && (c + 1 == x || c - 1 == x)) {
                if (this.getColor() != piece.getColor()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
