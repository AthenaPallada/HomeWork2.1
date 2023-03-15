package HW_2course.Animal;

import java.util.Objects;

public class Flying extends Bird {
    private String locomotion;

    public Flying(String nickname, int amountYear, String habitat, String locomotion) {
        super(nickname, amountYear, habitat);
        setLocomotion(locomotion);
    }

    public String getLocomotion() {
        return locomotion;
    }

    public void setLocomotion(String locomotion) {
        if(StringUtils.isNullOrEmpty(locomotion)) {
            this.locomotion = locomotion;
        }
    }

    @Override
    public void go() {
        System.out.println("Летать");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(getLocomotion(), flying.getLocomotion()) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLocomotion());
    }

    @Override
    public String toString() {
        return super.toString() + ". Предвижение: " + locomotion;
    }
}