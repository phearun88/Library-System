package model;

import java.util.List;

public class LibraryMember extends Person {
    private String memberId;
    private List<CheckoutRecord> checkoutRecords;

    public List<CheckoutRecord> getCheckoutRecords() {
        return checkoutRecords;
    }

    public void setCheckoutRecords(List<CheckoutRecord> checkoutRecords) {
        this.checkoutRecords = checkoutRecords;
    }

    public LibraryMember(int id, String memberId, String firstName, String lastName, String phone, Address address) {
        super(id, firstName, lastName, phone, address);
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "LibraryMember{" +
                "memberId='" + memberId + '\'' +
                ", " + super.toString() +
                '}';
    }
}
