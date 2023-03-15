package HW_2course.Animal;

import java.util.Objects;

public abstract class Animal {
    private String nickname;
    private int amountYear;

    public Animal(String nickname, int amountYear) {
        setNickname(nickname);
        setAmountYear(amountYear);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if(StringUtils.isNullOrEmpty(nickname)) {
            this.nickname = nickname;
        }
    }

    public int getAmountYear() {
        return amountYear;
    }

    public void setAmountYear(int amountYear) {
        if(amountYear > 0)
            this.amountYear = amountYear;
    }

    public void eat() {}
    public void sleep() {}
    public void go() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return amountYear == animal.amountYear && Objects.equals(getNickname(), animal.getNickname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNickname(), getAmountYear());
    }

    @Override
    public String toString() {
        return "Имя:" + nickname + ". Количество лет: " + amountYear;
    }
}