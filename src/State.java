package machine;

public enum State {
    START("Write action (buy, fill, take, remaining, exit):"),
    DEFAULT("Write action (buy, fill, take, remaining, exit):"),
    BUY("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: "),
    FILL(""),
    TAKE("");

    private String message;

    State(String message) {
        this.message = message;
    }

    String getMessage() {
        return this.message;
    }
}
