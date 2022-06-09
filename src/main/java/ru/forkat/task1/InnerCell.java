package ru.forkat.task1;
// QUESTION: without imports?

public class InnerCell extends Cell {
    public InnerCell(int x, int y) { // QUESTION: Is it possible not to add constructor for heir
        super(x, y); // QUESTION: Single line?
    }

    @Override
    public int calculateValue() {
        return this.getX() * this.getY();
    }
}
