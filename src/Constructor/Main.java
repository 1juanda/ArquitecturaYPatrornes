package Constructor;

public class Main {
    public static void main(String[] args) {
        SQLQBuilder builder = new SQLQBuilder();
        Director director = new Director();
        System.out.println(director.Build("where name = 'Juan'", "from names", builder).Execute());
    }
}
