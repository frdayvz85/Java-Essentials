
public class Grader {
    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        } else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'G';
        } else if (numberGrade < 80) {
            return 'H';
        } else if (numberGrade < 90) {
            return 'I';
        } else {
            return 'X';
        }
    }
}
