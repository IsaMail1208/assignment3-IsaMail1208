public class Admin extends User {

    public Admin(String name, int id) {
        super(name, id);
    }


    @Override
    public void manageService(Service s) {

        // admin can manage services: enable/configure, etc.
        System.out.println("Admin " + getName() + " is managing service '" + s.getServiceName() + "'.");
        // example behavior: ensure service is active
        if (!s.isActive()) {
            s.activateService();
        }

    }

    @Override
    public void useService(Service s) {

        System.out.println("Admin " + getName() + " is using service '" + s.getServiceName() + "'.");
        s.performService();

    }
}