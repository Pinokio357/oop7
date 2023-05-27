package observer;

public class Master implements Observer{
    private String name;
    private String fieldOfActivity;
    private double salary;

    public Master(String name) {
        this.name = name;
        salary = 80000;
        fieldOfActivity = "IT";
    }

    @Override
    public void receiveOffer(String companyName, SimpleVacancy vacancy) {
        if(this.fieldOfActivity.equals(vacancy.getFieldOfActivity())){
            if(this.salary < vacancy.getSalary()){
                System.out.printf("мастер %s >>> я могу справится с этой работой и меня устраивает уповень заработной платы [ %s - %f]\n", name, companyName, vacancy.getSalary());
                this.salary = vacancy.getSalary();
            }
            else {
                System.out.printf("мастер %s >>> я могу справится с этой работой,но меня не устраивает уповень заработной платы [ %s - %f]\n", name, companyName, vacancy.getSalary());
            }

        }
        else {
            System.out.printf("мастер %s >>>> я не смогу справиться с этой работой [ %s - %s ]\n", name, companyName, vacancy.getFieldOfActivity());

        }

    }
}



