public class StreamingService extends Service
        implements PremiumFeature {

    private boolean premium;

    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.premium = false;
    }


    @Override
    public void performService() {

        if (!isActive()) {
            System.out.println("Streaming service '" + getServiceName() + "' is inactive. Cannot stream content.");
            return;
        }

        if (premium) {
            System.out.println("Streaming PREMIUM content from '" + getServiceName() + "'.");
        } else {
            System.out.println("Streaming standard content from '" + getServiceName() + "'.");
        }

    }

    @Override
    public void upgradeToPremium() {

        if (!premium) {
            premium = true;
            System.out.println("Service '" + getServiceName() + "' upgraded to PREMIUM streaming.");
        } else {
            System.out.println("Service '" + getServiceName() + "' is already PREMIUM.");
        }

    }
}