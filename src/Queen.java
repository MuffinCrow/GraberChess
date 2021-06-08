import static java.lang.Math.abs;

public class Queen extends Pieces{
    public Queen (int row, int col, int color) { super(row, col, color, 4); }

    public boolean canMove(int row, int col) {
        int r = this.getRow();
        int c = this.getColumn();

        if (row < 8 && row > -1 && col < 8 && row > -1) {
            if (row < r && col == c) {
                for (int i = 1; i < abs(row - r); i++) {
                    if (Gameboard.hasPiece(r - i, c)) {
                        return false;
                    }
                }
            } else if (row > r && col == c) {
                for (int i = 1; i < abs(row - r); i++) {
                    if (Gameboard.hasPiece(r + i, c)) {
                        return false;
                    }
                }
            } else if (row == r && col < c) {
                for (int i = 1; i < abs(col - c); i++) {
                    if (Gameboard.hasPiece(r, c - i)) {
                        return false;
                    }
                }
            }  else if (row == r && col > c) {
                for (int i = 1; i < abs(col - c); i++) {
                    if (Gameboard.hasPiece(r, c + i)) {
                        return false;
                    }
                }
            } else if (row < r && col < c) {
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
        return false;
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
            } else if (row < r && col == c) {
                for (int i = 1; i < abs(row - r) - 1; i++) {
                    if (Gameboard.hasPiece(r - i, c)) {
                        return false;
                    }
                }
            } else if (row > r && col == c) {
                for (int i = 1; i < abs(row - r) - 1; i++) {
                    if (Gameboard.hasPiece(r + i, c)) {
                        return false;
                    }
                }
            } else if (row == r && col < c) {
                for (int i = 1; i < abs(col - c) - 1; i++) {
                    if (Gameboard.hasPiece(r, c - i)) {
                        return false;
                    }
                }
            }  else if (row == r && col > c) {
                for (int i = 1; i < abs(col - c) - 1; i++) {
                    if (Gameboard.hasPiece(r, c + i)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
