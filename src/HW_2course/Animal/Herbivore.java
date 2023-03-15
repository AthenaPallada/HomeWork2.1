package HW_2course.Animal;

import java.util.Objects;

public class Herbivore extends Mammal {
    private String food;

    public Herbivore(String nickname, int amountYear, String habitat, int speedMovement, String food) {
        super(nickname, amountYear, habitat, speedMovement);
        setFood(food);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if(StringUtils.isNullOrEmpty(food)) {
            this.food = food;
        }
    }

    @Override
    public void eat() {
        System.out.println("Пастись");
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(getFood(), herbivore.getFood()) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFood());
    }

    @Override
    public String toString() {
        return super.toString() + ". Пища: " + food;
    }
}