package ru.forkat.task1;
// QUESTION: without imports?

public class LeftCell extends Cell {
    public LeftCell(int x, int y) { // QUESTION: Is it possible not to add constructor for heir
        super(x, y);
    }

    @Override
    public int calculateValue() {
        return this.getY();
    }
}
