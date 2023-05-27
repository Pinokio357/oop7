package observer;

public interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void sendOffer(String companyName,SimpleVacancy vacancy);
}
