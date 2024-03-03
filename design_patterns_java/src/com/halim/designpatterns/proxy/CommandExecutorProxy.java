package com.halim.designpatterns.proxy;

public class CommandExecutorProxy implements CommandExecutor{

    private boolean isAdmin = false;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String login, String password) {
        isAdmin = "ali".equals(login) && "passw".equals(password);
        commandExecutor = new CommandLineImpl();
    }

    @Override
    public void executeCommand(String cmd) throws Exception {
        if(isAdmin){
            System.out.println("Executing command "+ cmd + " as admin.....");
            commandExecutor.executeCommand(cmd);
        } else {
            if(cmd.contains("rm")){
                throw new Exception("You don't have admin acces to execute this command");
            } else {
                commandExecutor.executeCommand(cmd);
            }
        }
    }



}
