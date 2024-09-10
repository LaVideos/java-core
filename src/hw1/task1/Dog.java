package hw1.task1;

public class Dog {

    private String name;
    private byte age;
    private String poroda;

    public Dog(String name, byte age, String poroda){
        this.age = age;
        this.name = name;
        this.poroda = poroda;
    }

    public Dog(){}

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", poroda='" + poroda + '\'' +
                '}';
    }

    public Dog(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

}
