package Core.OOPSTopic.AbstractClassesTopic;

public class HospitalExample {
    public static void main(String[] args) {
        AndhraPradeshHospitals saiHospital = new AndhraPradeshHospitals(16, "A");
//        AndhraPradeshHospitals kimsHospital = new AndhraPradeshHospitals(12, "F");

        // printing info - sai hospital
        saiHospital.billing();
        // printing info - kims hospital
//        kimsHospital.billing();
    }
}

abstract class HospitalRequirements {
    HospitalRequirements() {
        System.out.println("Super class constructor is called");
        System.out.println("All hospital requirements are fulfilled and can start operating 👌");
    }

    abstract void billing();

    abstract void emergency();

    abstract void admit();

    abstract void appointment();
}

class AndhraPradeshHospitals extends HospitalRequirements {
    int billingCounter;
    String emergencyExitCorner;

    AndhraPradeshHospitals(int billingCounter, String emergencyExitCorner) {
        System.out.println("Sub class constructor is called");
        this.billingCounter = billingCounter;
        this.emergencyExitCorner = emergencyExitCorner;
    }

    void billing() {
        System.out.println("Billing is done at counter " + billingCounter);
    }

    void emergency() {
        System.out.println("Exit at corner 4 Block " + emergencyExitCorner);
    }

    void admit() {
        System.out.println("Admits are applicable and occupancy is 60");
    }

    void appointment() {
        System.out.println("Appointment system starts at 11 am");
    }
}
