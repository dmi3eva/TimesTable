package ru.forkat.task1;

public class RightCell extends Cell {
    public RightCell(int x, int y) { // QUESTION: Is it possible not to add constructor for heir
        super(x, y);
    }

    @Override
    public int calculateValue() {
        return this.getX() * this.getY();
    }

    @Override
    public String display(int size) {
        this.validate(size);
        int indent = size - this.getValueSize(); // QUESTIONS
        String valueView = Integer.toString(this.getValue());
        return " ".repeat(size) + valueView;
    }
}
