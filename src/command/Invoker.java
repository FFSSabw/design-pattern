package command;

public class Invoker {
    
    public Invoker(int size) {
        this.size = size;
        try {
            init();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    private Command[] commands;
    private int size = 0;
    
    public void init() throws Exception {
        if(null != commands) throw new Exception();
        if(0 == size) throw new Exception();
        commands = new Command[size];
        for(int i = 0; i < size; i++) {
            commands[i] = new NoCommand();
        }
    }
    
    public void addCommand(Command c, int pos) {
        if(null != c && pos < size) commands[pos] = c;
    }
    
    public void removeCommand(int pos) {
        if(pos < size) commands[pos] = new NoCommand();
    }
    
    public void invoke(int pos) {
        if(pos < size) commands[pos].execute();
    }
}
