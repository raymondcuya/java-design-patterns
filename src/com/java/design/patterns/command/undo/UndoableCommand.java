package com.java.design.patterns.command.undo;

public interface UndoableCommand extends Command{
    void unexecute();
}
