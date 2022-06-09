package ru.forkat.task1;
import ru.forkat.task1.Cell;

public class InnerCell extends Cell {
    public InnerCell(int x, int y) { // QUESTION: Ia it possible not to add constructor for heir
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
        return " ".repeat(indent); // Local variable 'view' is redundant. StringBuilder?
    }
}
