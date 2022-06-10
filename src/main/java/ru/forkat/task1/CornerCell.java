package ru.forkat.task1;

public class CornerCell extends Cell {
    public CornerCell() { // QUESTION: Is it possible not to add constructor for heir
        super();
    }

    public CornerCell(int x, int y) { // QUESTION: Is it possible not to add constructor for heir
        super(x, y);
    }

    @Override
    public int calculateValue() {
        return 0;
    }

    @Override
    public String getView(int size) {
        return " ".repeat(size) + "|";
    }
}
