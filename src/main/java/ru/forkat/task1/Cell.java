package ru.forkat.task1;

public abstract class Cell {
    private final int x;
    private final int y;
    private final int value;

    public Cell(int x, int y){
        this.x = x; // QUESTION: shorter?
        this.y = y;
        value = calculateValue();
    }
    public abstract int calculateValue(); // QUESTION: I wanted private ...
    public abstract String display(int size);
    public int getX(){ // QUESTION: goal of getters?
        return this.x;
    }

    public int getY(){
        return this.y;
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
