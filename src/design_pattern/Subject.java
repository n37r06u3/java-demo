package design_pattern;

//import java.util.Observer;

/**
 * Created by n37r06u3 on 14-7-2.
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
