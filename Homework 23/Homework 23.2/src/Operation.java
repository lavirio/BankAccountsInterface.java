public enum Operation {
    ADD("+"), SUBTRACT("-"), MULTIPLY("*");

    public final String SYMBOL;

    Operation(String symbol) {
        this.SYMBOL = symbol;
    }
}
