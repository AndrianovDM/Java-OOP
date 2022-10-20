package Homework3.src.data;

public class Human {
    private String name;
    private String patronymic;
    private String surname;
    private Integer age;
    private Gender gender;

    public Human(String name, String patronymic, String surname, Integer age, Gender gender) {
        this.name = name;
        this.patronymic = patronymic;
        this. surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public  void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Фамилия: %s, Имя: %s, Отчество: %s, Возраст: %d, Пол: %s.",
                             surname, name, patronymic, age, gender);
    }
}
