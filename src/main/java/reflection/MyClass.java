package reflection;

public class MyClass {
    private String name;
    private String lastName;

    public MyClass() {
    }

    public MyClass(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void printData(){
        System.out.println(lastName + name);
    }

    private static void printStaticData(){
        System.out.println("lastName + name");
    }
}
