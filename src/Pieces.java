public class Pieces extends GameBoard implements ChessPiece {
    /*
    Pieces:
    0 = pawn
    1 = bishop
    2 = knight
    3 = rook
    4 = queen
    5 = king

    Color:
    0 = white
    1 = black

     */

    public int row;
    public int col;
    public int color;
    public int piece;

    public Pieces(int row, int col, int color, int piece) {
        this.row = row;
        this.col = col;
        this.color = color;
        this.piece = piece;
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public int getColumn() {
        return this.col;
    }

    @Override
    public boolean canMove(int row, int col) {
        switch (this.piece) {
            case 0:
                return Pawn.canMove(row, col);
                break;
            case 1:
                return Bishop.canMove(row, col);
                break;
            case 2:
                return Knight.canMove(row, col);
                break;
            case 3:
                return Rook.canMove(row, col);
                break;
            case 4:
                return Queen.canMove(row, col);
                break;
            case 5:
                return King.canMove(row, col);
                break;
            default: return false; break;
        }
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        switch (this.piece) {
            case 0:
                return Pawn.canKill(piece);
            break;
            case 1:
                return Bishop.canKill(piece);
            break;
            case 2:
                return Knight.canKill(piece);
            break;
            case 3:
                return Rook.canKill(piece);
            break;
            case 4:
                return Queen.canKill(piece);
            break;
            case 5:
                return King.canKill(piece);
            break;
            default: return false; break;
        }
    }

    public int getPiece() {
        return this.piece;
    }

    public int getColor() {
        return this.color;
    }
}
