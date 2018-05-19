package command;

public class CommandA implements Command{
    ReceiverA receiver;
    
    public CommandA(ReceiverA r) {
        receiver = r;
    }
    
    @Override
    public void execute() {
        receiver.actionA();
    }

}
