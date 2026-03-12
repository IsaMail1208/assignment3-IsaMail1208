public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    private boolean premium;

    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.premium = false;
    }


    @Override
    public void performService() {

        if (!isActive()) {
            System.out.println("Cloud storage service '" + getServiceName() + "' is inactive. Cannot access storage.");
            return;
        }

        if (premium) {
            System.out.println("Accessing PREMIUM cloud storage on '" + getServiceName() + "' with extra space and features.");
        } else {
            System.out.println("Accessing standard cloud storage on '" + getServiceName() + "'.");
        }

    }

    @Override
    public void upgradeToPremium() {

        if (!premium) {
            premium = true;
            System.out.println("Cloud storage service '" + getServiceName() + "' upgraded to PREMIUM plan.");
        } else {
            System.out.println("Cloud storage service '" + getServiceName() + "' is already PREMIUM.");
        }

    }

    @Override
    public void generateBill() {

        System.out.println("Generating usage-based bill for cloud storage service '" + getServiceName() + "'.");

    }
}