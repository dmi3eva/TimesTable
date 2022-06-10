package ru.forkat.task1;

import java.util.concurrent.ThreadPoolExecutor;

public abstract class Row {
    private final int rowSize;
    private final int cellSize;
    private final int number;
    public Cell[] cells;

    public Row(int rowSize, int cellSize, int number){
        this.rowSize = rowSize;
        this.cellSize = cellSize;
        this.number = number;
    }

    public void validate() {
        if (this.cellSize < 1){
            throw new ArithmeticException(""); // At random
        }
    }

    public String getSeparatorView(){
        this.validate();
        int lineCellSize = this.cellSize - 1;
        String cellBorder = "+" + "_".repeat(lineCellSize) + "+";
        return cellBorder.repeat(this.rowSize) + "\n";
    }

    public String getCellsView(){
        StringBuilder rowView = new StringBuilder();
        for (Cell currentCell : this.cells){
            rowView.append(currentCell.getView(this.cellSize));
        }
        rowView.append("\n");
        rowView.append(this.getSeparatorView());
        return rowView.toString();
    }

    public abstract String getView(int size);
}
