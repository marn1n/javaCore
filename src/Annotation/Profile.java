package Annotation;

public class Profile {
    private int id;
    @SpecialCharacterChecker(msg = "No punctuation characters in name!")
    private String name;
    @SpecialCharacterChecker(msg = "No punctuation characters in surname!")
    private String surname;
    private int year;

    public Profile() {
    }

    public Profile(int id, String name, String surname, int year) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
