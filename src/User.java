public abstract class User {

    // basic user information
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // administrative actions on a service
    public abstract void manageService(Service s);

    // simulates using a service
    public abstract void useService(Service s);

}