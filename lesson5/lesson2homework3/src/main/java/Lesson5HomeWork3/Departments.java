package Lesson5HomeWork3;

public enum Departments {
    ECONOMIC(1),
    LEGAL(2),
    SALES(3);

    private int enumId;

    Departments (int enumId) {
        this.enumId = enumId;
    }

    public int getEnumId() {
        return enumId;
    }
}
