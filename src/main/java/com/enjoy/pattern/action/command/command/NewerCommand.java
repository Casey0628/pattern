package com.enjoy.pattern.action.command.command;

import com.enjoy.pattern.action.command.Command;
import com.enjoy.pattern.action.command.handler.NewerHandler;

public class NewerCommand extends Command {
    private NewerHandler handler = new NewerHandler();

    @Override
    public String execute() {
        return handler.getNewers();
    }
}
