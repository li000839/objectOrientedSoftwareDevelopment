public class Pawn extends Piece{
    private boolean hasMoved = false;

    public Pawn(int currentRow, int currentColumn) {
        super(currentRow, currentColumn);  // the Pawn by constructor = Piece pawn = new Piece();
    }

    public boolean isValidMove(int toRow, int toColumn) {
        int row = super.getCurrentRow();   // pawn.getCurrentRow();
        int col = super.getCurrentColumn();

        if (row == toRow) {
            if (!hasMoved && Math.abs(col -toColumn) == 2) {
                hasMoved = true;
                return true;
            } else if (hasMoved && Math.abs(col - toColumn) == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
