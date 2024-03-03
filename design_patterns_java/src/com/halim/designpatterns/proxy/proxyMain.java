package com.halim.designpatterns.proxy;

public class proxyMain {

    public static void main(String[] args) {
        CommandExecutor cmdLine = new CommandExecutorProxy("ali", "passw");

        try {
            cmdLine.executeCommand("ls -a");
            cmdLine.executeCommand("rm some folder");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
