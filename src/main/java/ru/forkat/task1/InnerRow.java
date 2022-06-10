package ru.forkat.task1;

public class InnerRow extends Row {
    public InnerRow(int rowSize, int cellSize, int number) {
        super(rowSize, cellSize, number);
        this.cells = new Cell[rowSize];
        this.cells[0] = new LeftCell(number, 0);
        for (int i = 1; i < rowSize; i++){
            this.cells[i] = new InnerCell(i, number);
        }
    }

    @Override
    public String getView(int size) {
        return this.getCellsView() + this.getSeparatorView();
    }
}
