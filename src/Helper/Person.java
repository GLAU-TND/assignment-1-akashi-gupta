package Helper;

public class Person implements Comparable<Person> {

    private String firstName;                   //First name of person
    private String lastName;                    //Last name of person
    private String emailID;                     //EmailId of person
    private StringBuffer phoneNumbers;

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
