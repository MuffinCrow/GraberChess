import static java.lang.Math.abs;

public class King extends Pieces{
    public King (int row, int col, int color) { super(row, col, color, 5); }

    public boolean canMove(int row, int col) {
        int r = this.getRow();
        int c = this.getColumn();

        if ((abs(r - row) == 1 || abs(r - row) == 0) && (abs(c - col) == 1 || abs(c - col) == 0)) {
            if (Gameboard.hasPiece(row, col)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean canKill(Pieces piece) {
        int r = this.getRow();
        int c = this.getColumn();
        int col = piece.getColumn();
        int row = piece.getRow();

        if (this.getColor() != piece.getColor()) {
            if ((abs(r - row) == 1 || abs(r - row) == 0) && (abs(c - col) == 1 || abs(c - col) == 0)) {
                return true;
            }
        }
        return false;
    }
}
