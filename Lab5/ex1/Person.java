package person;

public class Person {
    private String surname;
    private String name;
    private String occupation;
    private Gender gender;
    private int yearOfBirth;

    public Person(String surname, String name,
            String occupation,
            Gender gender,
            int yearOfBirth) {
        this.surname = surname;
        this.name = name;
        this.occupation = occupation;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public toString(){
        String info = name + " " + surname + "\n"
                      + "Occupation: " + occupation + "\n" 
                      + "Gender: " + gender ==  Gender.MALE ? "Male" : "Female" + "\n" 
                      + "Years of birth: " + yearOfBirth;

        return info; 
    }

    public boolean sameAs(Person p) {
        if (p.name == this.name &&
                p.surname == this.surname &&
                p.occupation == this.occupation &&
                p.gender == this.gender &&
                p.yearOfBirth == this.yearOfBirth) {
            return true;
        }
        return false;
    }

}