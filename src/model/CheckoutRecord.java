package model;

public class CheckoutRecord {
    private CheckoutRecordEntry checkoutRecordEntry;
    private LibraryMember member;

    public CheckoutRecord(CheckoutRecordEntry checkoutRecordEntry, LibraryMember member) {
        this.checkoutRecordEntry = checkoutRecordEntry;
        this.member = member;
    }

    public CheckoutRecordEntry getCheckoutRecordEntry() {
        return checkoutRecordEntry;
    }

    public void setCheckoutRecordEntry(CheckoutRecordEntry checkoutRecordEntry) {
        this.checkoutRecordEntry = checkoutRecordEntry;
    }

    public LibraryMember getMember() {
        return member;
    }

    public void setMember(LibraryMember member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "CheckoutRecord{" +
                "checkoutRecordEntry=" + checkoutRecordEntry +
                ", member=" + member +
                '}';
    }
}
