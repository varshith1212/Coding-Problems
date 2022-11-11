package staticexamples;

class Bill {
    static  int counter;
    String billId;
    String paymentMode;

    static {
        counter = 9000;
    }

    public int getCounter() {
        return Bill.counter;
    }

    public Bill(String paymentMode) {
        this.paymentMode = paymentMode;
        this.billId = "B" + ++Bill.counter;
    }

    public String getBillId() {
        return this.billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPaymentMode() {
        return this.paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}

public class Main {
    public static void main(String[] args) {
        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");

        Bill[] bills = { bill1, bill2 };

        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
        }
    }
}
