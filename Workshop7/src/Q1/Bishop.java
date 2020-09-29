public class Bishop extends Piece{
    public Bishop(int currentRow, int currentColumn) {
        super(currentRow, currentColumn);
    }

    public boolean isValidMove(int toRow, int toColumn) {
        int row = super.getCurrentRow();
        int col = super.getCurrentColumn();

        return Math.abs(row - toRow) == Math.abs(col - toColumn);
    }
}
