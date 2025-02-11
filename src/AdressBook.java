import java.util.*;

public class AdressBook {
    private List<Person> book;

    public AdressBook(List<Person> book) {
        this.book = book;
    }

    public List<Person> getBook() {
        return book;
    }

    public void setBook(List<Person> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "AdressBook{" +
                "book=" + book +
                '}';
    }

    public void addPerson(Person a){
        book.add(a);
    }
    public void removePerson(Person a){
        System.out.println("Who would you like to remove?");
        book.remove(a);
    }
    public void displayContacts(){
        for (Person a : book){
            String name = a.getName();
            String email = a.getEmail();
            System.out.println(name + " --> " + email);
        }

    }

}
