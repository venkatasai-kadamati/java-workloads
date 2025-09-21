package BackendSpring.BuildSystems.ExMultiFileSetup.lib;

public class UPIPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment made using UPI");
    }
}
