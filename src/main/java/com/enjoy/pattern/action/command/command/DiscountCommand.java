package com.enjoy.pattern.action.command.command;

import com.enjoy.pattern.action.command.Command;
import com.enjoy.pattern.action.command.handler.DiscountHandler;

public class DiscountCommand extends Command {

    private DiscountHandler handler = new DiscountHandler();

    @Override
    public String execute() {
        return handler.getDiscounts();
    }
}
