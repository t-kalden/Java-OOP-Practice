public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        if(age < 0 || age > 100) {
            this.age = 0;
        }
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public boolean isTeen() {
        boolean isTeenager = (age > 12 && age < 20) ? true : false;
        if(isTeenager) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if(firstName.isEmpty()) {
            return lastName;
        } else if(lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
