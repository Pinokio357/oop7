package observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{
    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    /**
     * пеализация рассылки сообщений
     * @param companyName
     * @param vacancy
     */
    @Override
    public void sendOffer(String companyName, SimpleVacancy vacancy) {
        for(Observer observer: observers){
            observer.receiveOffer(companyName, vacancy);
        }
    }
}
