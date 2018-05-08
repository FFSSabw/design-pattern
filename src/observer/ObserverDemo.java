package observer;

public class ObserverDemo implements Observer{
    private Subject subject;
    private Data data;
    private static int counter = 0;
    private final int id = counter++;
    
    public ObserverDemo(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    
    @Override
    public void update(Data data) {
        this.data = data;
        displayData();
    }
    
    public void displayData() {
        System.out.println("Observer " + id + " data is changed! data: " + data);
    }

}
