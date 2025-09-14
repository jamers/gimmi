package io.jamers.gimmi;

public enum CardCondition {
    MINT(0, "MT"),
    NEAR_MINT(1, "NM"),
    EXCELLENT(2, "EX"),
    GOOD(3, "GD"),
    LIGHT_PLAYED(4, "LP"),
    PLAYED(5, "PL"),
    POOR(6, "PO");

    private final int sortOrder;
    private final String abbreviation;

    CardCondition(int sortOrder, String abbreviation) {
        this.sortOrder = sortOrder;
        this.abbreviation = abbreviation;
    }

    public int getSortOrder() {
        return this.sortOrder;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }
}
