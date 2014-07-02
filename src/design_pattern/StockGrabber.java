package design_pattern;

import java.util.ArrayList;

/**
 * Created by n37r06u3 on 14-7-2.
 */
public class StockGrabber implements Subject{
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer "+(observerIndex+1) + "deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers){
            o.update(ibmPrice, aaplPrice,googPrice);
        }
    }

    public void setGOOGPrice(double newPrice){
        this.googPrice = newPrice;
        notifyObserver();
    }
    public void setIBMPrice(double newPrice){
        this.ibmPrice = newPrice;
        notifyObserver();
    }
    public void setAAPLPrice(double newPrice){
        this.aaplPrice = newPrice;
        notifyObserver();
    }
}
