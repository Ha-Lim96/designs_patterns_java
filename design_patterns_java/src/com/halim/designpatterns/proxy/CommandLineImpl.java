package com.halim.designpatterns.proxy;

public class CommandLineImpl implements CommandExecutor {

    @Override
    public void executeCommand(String cmd) throws Exception {
        System.out.println("Command "+cmd+" was successfully executed");
    }
}
