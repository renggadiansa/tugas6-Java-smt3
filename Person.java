public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hallo, nama saya " + this.name + " dan umur saya " + this.age + " tahun.");
    }
}
