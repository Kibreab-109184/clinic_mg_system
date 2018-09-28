package controller;

public class ActButton {
    private String action;
    private String id;

    public ActButton() {
    }

    public ActButton(String action) {
        this.action = action;
    }

    public ActButton(String action, String id) {
        this.action = action;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "ActButton{" +
                "action='" + action + '\'' +
                '}';
    }
}
