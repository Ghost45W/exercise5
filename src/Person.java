public class Person {
    private String Name;
    private String email;

    public Person(String name, String email) {
        Name = name;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
