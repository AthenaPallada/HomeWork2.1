package HW_2course.Animal;

import java.util.Objects;

public class Mammal extends Animal {
    private String habitat;
    private int speedMovement;

    public Mammal(String nickname, int amountYear, String habitat, int speedMovement) {
        super(nickname, amountYear);
        setHabitat(habitat);
        setSpeedMovement(speedMovement);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if(StringUtils.isNullOrEmpty(habitat)) {
            this.habitat = habitat;
        }
    }

    public int getSpeedMovement() {
        return speedMovement;
    }

    public void setSpeedMovement(int speedMovement) {
        if(speedMovement > 0)
            this.speedMovement = speedMovement;
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
        Mammal mammal = (Mammal) o;
        return speedMovement == mammal.speedMovement && Objects.equals(getHabitat(), mammal.getHabitat()) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHabitat(), getSpeedMovement());
    }

    @Override
    public String toString() {
        return super.toString() + ". Среда обитания: " + habitat + ". Скорость передвижения: " + speedMovement;
    }
}