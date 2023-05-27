package observer;

public class Cleaner implements Observer{
    private String name;
    private String fieldOfActivity;
    private double salary;

    public Cleaner(String name) {
        this.name = name;
        salary = 20000;
        fieldOfActivity = "cleaning";
    }

    @Override
    public void receiveOffer(String companyName, SimpleVacancy vacancy) {
        if(this.fieldOfActivity.equals(vacancy.getFieldOfActivity())){
            if(this.salary < vacancy.getSalary()){
                System.out.printf("уборщик %s >>> я могу справится с этой работой и меня устраивает уповень заработной платы [ %s - %f]\n", name, companyName, vacancy.getSalary());
                this.salary = vacancy.getSalary();
            }
            else {
                System.out.printf("уборщик %s >>> я могу справится с этой работой,но меня не устраивает уповень заработной платы [ %s - %f]\n", name, companyName, vacancy.getSalary());
            }

        }
        else {
            System.out.printf("уборщик %s >>>> я не смогу справиться с этой работой [ %s - %s ]\n", name, companyName, vacancy.getFieldOfActivity());

        }

    }
}


