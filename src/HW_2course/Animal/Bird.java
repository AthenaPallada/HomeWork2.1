package HW_2course.Animal;

import java.util.Objects;

public class Bird extends Animal {
    private String  habitat;

    public Bird(String nickname, int amountYear, String habitat) {
        super(nickname, amountYear);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if(StringUtils.isNullOrEmpty(habitat)) {
            this.habitat = habitat;
        }
    }

    @Override
    public void eat() {
        System.out.println("Охотиться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(getHabitat(), bird.getHabitat()) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHabitat());
    }

    @Override
    public String toString() {
        return super.toString() + ". Среда обитания: " + habitat;
    }
}