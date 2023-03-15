package HW_2course.Human;

public class Human {
    private int yearOfBirth;
    public String name;
    private String town;
    public String jobTitle;
    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        setYearOfBirth(yearOfBirth);
        this.name = name;
        if(this.name == null) {
            this.name = "Информация не указана";
        }
        setTown(town);
        this.jobTitle = jobTitle;
        if(this.jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public String getTown() {
        return town;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        if(yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
    }
    public void setTown(String town) {
        this.town = town;
        if(town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        }
    }
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
    public void printInfo() {
        System.out.println(this);
    }
}