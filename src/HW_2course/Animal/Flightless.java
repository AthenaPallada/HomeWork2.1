package HW_2course.Animal;

import java.util.Objects;

public class Flightless extends Bird {
    private String locomotion;

    public Flightless(String nickname, int amountYear, String habitat, String locomotion) {
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
        System.out.println("Гулять");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless flightless = (Flightless) o;
        return Objects.equals(getLocomotion(), flightless.getLocomotion()) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLocomotion());
    }

    @Override
    public String toString() {
        return super.toString() + ". Передвижение:  " + locomotion;
    }
}