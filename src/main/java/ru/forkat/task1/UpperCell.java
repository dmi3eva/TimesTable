package ru.forkat.task1;

public class UpperCell extends Cell {
    public UpperCell(int x, int y) { // QUESTION: Is it possible not to add constructor for heir
        super(x, y);
    }

    @Override
    public int calculateValue() {
        return this.getY();
    }
}
