package observer;

import java.util.Random;

public class Company {
    private String nameCompany;
    private Publisher jobAgency;
    private SimpleVacancy vacancy;
    String[] fields = {"IT", "cleaning"};
    Random random = new Random();


    public Company(String nameCompany, JobAgency jobAgency, Vacancy vacancy) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
        this.vacancy = vacancy;
    }

    public void needEmployee() {
        vacancy.setFieldOfActivity(fields[random.nextInt(fields.length)]);
        if (vacancy.getFieldOfActivity().equals("IT")) {
            vacancy.setSalary(random.nextDouble(3000, 90000));
        } else {
            vacancy.setSalary(random.nextDouble(5000, 50000));
        }
            jobAgency.sendOffer(nameCompany, vacancy);

    }
}






