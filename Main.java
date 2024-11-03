public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Rengga Ferdiansa");
        person.setAge(20);
        person.introduce();

        Library library = new Library("Perpustakaan Ceria", 100);
        library.printDetails();
        library.borrowBook(10);
        library.returnBook(5);
        library.printDetails();Book book1 = new Book();


        book1.setTitle("The Pragmatic Programmer");
        book1.setAuthor("David Thomas & Andrew Hunt");
        book1.printDetails();

    }
}
