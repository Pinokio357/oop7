package observer;



public class Vacancy implements SimpleVacancy {
    private String fieldOfActivity;
    private double salary;


    public Vacancy(String fieldOfActivity, double salary) {
        this.fieldOfActivity = fieldOfActivity;
        this.salary = salary;
    }

    public String getFieldOfActivity() {
        return fieldOfActivity;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setFieldOfActivity(String fieldOfActivity) {
        this.fieldOfActivity = fieldOfActivity;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }




    }


