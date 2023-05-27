package observer;

/**
 * интерфейс соискателя
 */

public interface Observer {
    void receiveOffer(String companyName, SimpleVacancy vacancy);
}
