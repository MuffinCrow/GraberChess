import static java.lang.Math.abs;

public class Knight extends Pieces {
    public Knight(int row, int col, int color) { super(row, col, color, 2); }

    public boolean canMove(int row, int col) {
        int r = this.getRow();
        int c = this.getColumn();

        if (row < 8 && row > -1 && col > -1 && col < 8){
            if ((r + 2 == row && r + 2 < 8) && (c + 1 == col && col + 1 < 8)) {
                if (!Gameboard.hasPiece(r + 2, c + 1)) {
                    return true;
                }
            } else if ((r + 2 == row && r + 2 < 8) && (c - 1 == col && col - 1 > -1)) {
                if (!Gameboard.hasPiece(r + 2, c - 1)) {
                    return true;
                }
            } else if ((r - 2 == row && r - 2 > -1) && (c - 1 == col && col - 1 > -1)) {
                if (!Gameboard.hasPiece(r - 2, c - 1)) {
                    return true;
                }
            } else if ((r - 2 == row && r - 2 > -1) && (c + 1 == col && col + 1 < 8)) {
                if (!Gameboard.hasPiece(r - 2, c + 1)) {
                    return true;
                }
            } else if ((r - 1 == row && r - 1 > -1) && (c + 2 == col && col + 2 < 8)) {
                if (!Gameboard.hasPiece(r - 1, c + 2)) {
                    return true;
                }
            } else if ((r + 1 == row && r + 1 < 8) && (c + 2 == col && col + 2 < 8)) {
                if (!Gameboard.hasPiece(r + 1, c + 2)) {
                    return true;
                }
            } else if ((r + 1 == row && r + 1 < 8) && (c - 2 == col && col - 2 > -1)) {
                if (!Gameboard.hasPiece(r + 1, c - 2)) {
                    return true;
                }
            } else if ((r - 1 == row && r - 1 > -1) && (c - 2 == col && col - 2 > -1)) {
                if (!Gameboard.hasPiece(r - 1, c - 2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean canKill(Pieces piece) {
        int r = this.getRow();
        int c = this.getColumn();
        int row = piece.getRow();
        int col = piece.getColumn();

        if ((r + 2 == row && r + 2 < 8) && (c + 1 == col && col + 1 < 8)) {
            if (Gameboard.hasPiece(r + 2, c + 1) && this.getColor() != piece.getColor()) {
                return true;
            }
        } else if ((r + 2 == row && r + 2 < 8) && (c - 1 == col && col - 1 > - 1)) {
            if (Gameboard.hasPiece(r + 2, c - 1) && this.getColor() != piece.getColor()) {
                return true;
            }
        } else if ((r - 2 == row && r - 2 > -1) && (c - 1 == col && col - 1 > - 1)) {
            if (Gameboard.hasPiece(r - 2, c - 1) && this.getColor() != piece.getColor()) {
                return true;
            }
        } else if ((r - 2 == row && r - 2 > -1) && (c + 1 == col && col + 1 < 8)) {
            if (Gameboard.hasPiece(r - 2, c + 1) && this.getColor() != piece.getColor()) {
                return true;
            }
        } else if ((r - 1 == row && r - 1 > -1) && (c + 2 == col && col + 2 < 8)) {
            if (Gameboard.hasPiece(r - 1, c + 2) && this.getColor() != piece.getColor()) {
                return true;
            }
        } else if ((r + 1 == row && r + 1 < 8) && (c + 2 == col && col + 2 < 8)) {
            if (Gameboard.hasPiece(r + 1, c + 2) && this.getColor() != piece.getColor()) {
                return true;
            }
        } else if ((r + 1 == row && r + 1 < 8) && (c - 2 == col && col - 2 > -1)) {
            if (Gameboard.hasPiece(r + 1, c - 2) && this.getColor() != piece.getColor()) {
                return true;
            }
        } else if ((r - 1 == row && r - 1 > -1) && (c - 2 == col && col - 2 > -1)) {
            if (Gameboard.hasPiece(r - 1, c - 2) && this.getColor() != piece.getColor()) {
                return true;
            }
        }
        return false;
    }
}
