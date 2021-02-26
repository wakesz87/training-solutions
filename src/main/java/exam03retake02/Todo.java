package exam03retake02;

public class Todo {
    private String text;
    private State state;
    private int priority;

    public Todo(String text, int priority) {
        if (priority < 1 || priority > 5) {
            throw new IllegalArgumentException(priority + "wrong");
        }

        this.text = text;
        this.priority = priority;
        state = State.NON_COMPLETED;


    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }
    public State complete() {
        if (state == State.NON_COMPLETED) {
            State newState= State.COMPLETED;
        }
        return State.COMPLETED;
    }
}
