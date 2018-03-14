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
}


