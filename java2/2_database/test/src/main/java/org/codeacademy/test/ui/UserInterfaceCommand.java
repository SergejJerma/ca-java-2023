package org.codeacademy.test.ui;

public enum UserInterfaceCommand {
    CANCEL(-1),
    SAVE(-2);

    private final int id;

    UserInterfaceCommand(int id) {
        this.id = id;
    }

    public int id() {
        return this.id;
    }
}
