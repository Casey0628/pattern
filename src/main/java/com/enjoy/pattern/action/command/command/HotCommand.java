package com.enjoy.pattern.action.command.command;

import com.enjoy.pattern.action.command.Command;
import com.enjoy.pattern.action.command.handler.HotHandler;

public class HotCommand extends Command {
    private HotHandler handler = new HotHandler();

    @Override
    public String execute() {
        return handler.getHots();
    }
}
