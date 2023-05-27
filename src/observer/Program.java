package observer;

public class Program {
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Vacancy vacancy = new Vacancy("zero", 0);
        Company geekBrains = new Company("GeekBrains", jobAgency, vacancy);
        Company google = new Company("Google", jobAgency, vacancy);
        Company yandex = new Company("Yandex", jobAgency, vacancy);

        Master ivanov = new Master("Ivanov");
        Student petrov = new Student("Petrov");
        Cleaner sidorov = new Cleaner("Sidorov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);

        for(int i = 1; i < 4; i++){
            System.out.printf("------------------------{iteration %d}---------------------------\n", i);
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();


        }


    }
}
