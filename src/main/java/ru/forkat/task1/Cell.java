package ru.forkat.task1;

public abstract class Cell {
    private final int x;
    private final int y;
    private final int value;

    public Cell() { // QUESTION: Is it possible not to add constructor for heir
        x = 0;
        y = 0;
        value = calculateValue();
    }

    public Cell(int x, int y){
        this.x = x; // QUESTION: shorter?
        this.y = y;
        value = calculateValue();
    }
    public abstract int calculateValue(); // QUESTION: I wanted private ...
    public String getView(int size) { // QUESTION: To abstract?
        this.validate(size);
        int indent = size - this.getValueSize(); // QUESTIONS
        String valueView = Integer.toString(this.getValue());
        return " ".repeat(indent) + valueView + "|"; // Local variable 'view' is redundant. StringBuilder?
    }
    public int getX(){ // QUESTION: goal of getters?
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getValue(){
        return this.value;
    }

    public int getValueSize(){
        String valueStr = Integer.toString(this.value); // QUESTION: int vs Integer?
        return valueStr.length(); // QUESTION: initialization before return?
    }
    public void validate(int size) {
        int valueSize = this.getValueSize();
        if (valueSize > size){
            throw new ArithmeticException(""); // At random
        }
    }
}
