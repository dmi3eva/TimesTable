package ru.forkat.task1;

public class FirstRow extends Row {
    public FirstRow(int rowSize, int cellSize, int number) {
        super(rowSize, cellSize, number);
        this.cells = new Cell[rowSize];
        this.cells[0] = new CornerCell();
        for (int i = 1; i < rowSize; i++){
            this.cells[i] = new UpperCell(i, 0);
        }
    }

    @Override
    public String getView(int size) {
        return this.getCellsView() + this.getSeparatorView();
    }
}
