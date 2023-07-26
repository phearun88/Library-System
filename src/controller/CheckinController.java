package controller;

import model.CheckoutRecord;
import repository.CheckoutRecordRepository;

public class CheckinController {

    private CheckoutRecordRepository checkoutRecordRepository;

    public CheckinController() {
        checkoutRecordRepository = new CheckoutRecordRepository();
    }

    public CheckoutRecord findCheckoutRecord(String isbn, String memberId) throws Exception {
        return checkoutRecordRepository.findCheckoutRecord(isbn, memberId);
    }
    public boolean checkinBook(int bookId, int copyNum, int checkoutRecordEntryId) throws Exception {
        return checkoutRecordRepository.returnBook(bookId, copyNum, checkoutRecordEntryId);
    }
}
