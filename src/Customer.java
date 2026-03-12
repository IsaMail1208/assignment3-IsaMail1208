public class Customer extends User {

    public Customer(String name, int id) {
        super(name, id);
    }


    @Override
    public void manageService(Service s) {

        // regular customers are not allowed to manage services
        System.out.println("Customer " + getName() + " is not allowed to manage service '" + s.getServiceName() + "'.");

    }

    @Override
    public void useService(Service s) {

        System.out.println("Customer " + getName() + " is using service '" + s.getServiceName() + "'.");
        s.performService();

    }
}