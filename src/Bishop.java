import static java.lang.Math.abs;

public class Bishop extends Pieces{
    public Bishop(int row, int col, int color) {
        super(row, col, color, 1);
    }
    public boolean canMove(int row, int col) {
        int r = this.getRow();
        int c = this.getColumn();

        if (row < r && col < c) {
            for (int i = 1; i < abs(row - r); i++) {
                if (Gameboard.hasPiece(r - i, c - i)) {
                    return false;
                }
            }
        } else if (row < r && col > c) {
            for (int i = 1; i < abs(row - r); i++) {
                if (Gameboard.hasPiece(r - i, c + i)) {
                    return false;
                }
            }
        } else if (row > r && col < c) {
            for (int i = 1; i < abs(row - r); i++) {
                if (Gameboard.hasPiece(r + i, c - i)) {
                    return false;
                }
            }
        } else if (row > r && col > c) {
            for (int i = 1; i < abs(row - r); i++) {
                if (Gameboard.hasPiece(r + i, c + i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean canKill(Pieces piece) {
        int r = this.getRow();
        int c = this.getColumn();
        int col = piece.getColumn();
        int row = piece.getRow();

        if (this.getColor() != piece.getColor()) {
            if (row < r && col < c) {
                for (int i = 1; i < abs(row - r) - 1; i++) {
                    if (Gameboard.hasPiece(r - i, c - i)) {
                        return false;
                    }
                }
            } else if (row < r && col > c) {
                for (int i = 1; i < abs(row - r) - 1; i++) {
                    if (Gameboard.hasPiece(r - i, c + i)) {
                        return false;
                    }
                }
            } else if (row > r && col < c) {
                for (int i = 1; i < abs(row - r) - 1; i++) {
                    if (Gameboard.hasPiece(r + i, c - i)) {
                        return false;
                    }
                }
            } else if (row > r && col > c) {
                for (int i = 1; i < abs(row - r) - 1; i++) {
                    if (Gameboard.hasPiece(r + i, c + i)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
