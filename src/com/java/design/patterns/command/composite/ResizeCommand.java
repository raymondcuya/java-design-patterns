package com.java.design.patterns.command.composite;

import com.java.design.patterns.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
