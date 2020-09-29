public class Rook extends Piece {

    public Rook(int currentRow, int currentColumn) {
        super(currentRow, currentColumn);
        // Any other code
    }

    @Override
    public boolean isValidMove(int toRow, int toColumn) {
        boolean isValid = true;
        System.out.println("Rook class: isValidMove() method");
        if (!super.isValidMove(toRow, toColumn))
            return false;
        //Logic for checking valid move and set isValid
        return isValid;
    }
}
