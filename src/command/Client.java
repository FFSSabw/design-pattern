package command;

public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker(10);
        
        ReceiverA ra = new ReceiverA();
        Command ca = new CommandA(ra);
        invoker.addCommand(ca, 0);
        
        ReceiverB rb = new ReceiverB();
        Command cb = new CommandB(rb);
        invoker.addCommand(cb, 1);
        
        invoker.invoke(0);
        invoker.invoke(1);
    }

}
