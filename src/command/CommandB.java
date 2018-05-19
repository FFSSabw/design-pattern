package command;

public class CommandB implements Command{
    ReceiverB receiver;
    
    public CommandB(ReceiverB r) {
        receiver = r;
    }
    
    @Override
    public void execute() {
        receiver.actionB();
    }

}
