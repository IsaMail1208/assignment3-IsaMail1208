public abstract class Service {

    // core service data (encapsulated)
    private String serviceName;
    private int serviceId;
    private boolean isActive;

    // constructor
    public Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActive = false; // services start inactive
    }

    // activates the service
    public void activateService() {
        isActive = true;
        System.out.println("Service '" + serviceName + "' (ID: " + serviceId + ") is activated.");
    }

    // deactivates the service
    public void deactivateService() {
        isActive = false;
        System.out.println("Service '" + serviceName + "' (ID: " + serviceId + ") is deactivated.");
    }

    // getter for serviceName
    public String getServiceName() {
        return serviceName;
    }

    // getter for isActive
    public boolean isActive() {
        return isActive;
    }

    // optional protected getter for id (kept non-public)
    protected int getServiceId() {
        return serviceId;
    }

    // each concrete service implements its core behavior
    public abstract void performService();

}