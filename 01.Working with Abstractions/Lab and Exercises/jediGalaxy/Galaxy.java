package jediGalaxy;

public class Galaxy {
    private Field field;

    public Galaxy(Field field) {
        this.field = field;
    }

    public void moveSith(int row, int col) {
        while (row >= 0 && col >= 0) {
            if (field.isInBound(row, col)) {
                field.setValue(row,col,0);
            }
            row--;
            col--;
        }
    }

    public long moveJedi(int row, int col) {
        long collectedPower = 0;
        while (row >= 0 && col < this.field.getColLenght(1)) {
            if (this.field.isInBound(row, col)) {
                collectedPower += this.field.getValue(row,col);
                ;
            }
            row--;
            col++;
        }
        return collectedPower;
    }
}


