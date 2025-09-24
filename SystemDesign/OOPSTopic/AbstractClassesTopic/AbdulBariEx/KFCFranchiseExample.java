package Core.OOPSTopic.AbstractClassesTopic;

public class KFCFranchiseExample {
    public static void main(String[] args) {
        IndianOutlets rajahmundryKFC = new IndianOutlets("Rajahmundry", "Cash-less");

        rajahmundryKFC.billing();
        rajahmundryKFC.offers();
        rajahmundryKFC.recipe();
    }
}

// KFC as a franchise enabler gives few hard rules and rest for us to implore
abstract class KFC {
    KFC(String branchName) {
        System.out.println(branchName + " KFC branch setup");
    }

    void recipe() {
        System.out.println("Use 2 spoons of lemon + 1 tbps of ginger");
    }

    abstract void billing();

    abstract void offers();
}

class IndianOutlets extends KFC {

    String billingMethod;

    IndianOutlets(String branchName, String billingMethod) {
        super(branchName);
        this.billingMethod = billingMethod;
    }

    void billing() {
        System.out.println("Billing is " + billingMethod);
    }

    void offers() {
        System.out.println("Any purchase of 399+ is Flat 5%");
    }
}
