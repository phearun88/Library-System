package controller;

import model.BookCopy;
import model.CheckoutRecord;
import model.CheckoutRecordEntry;
import model.LibraryMember;
import repository.BookRepository;
import repository.CheckoutRecordRepository;
import repository.MemberRepository;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class CheckoutController {
    private MemberRepository memberRepository;
    private BookRepository bookRepository;
    private CheckoutRecordRepository checkoutRecordRepository;

    public CheckoutController() {
        memberRepository = new MemberRepository();
        bookRepository = new BookRepository();
        checkoutRecordRepository = new CheckoutRecordRepository();
    }

    public boolean checkoutBook(BookCopy bookCopy, LibraryMember member) throws Exception {
        CheckoutRecordEntry recordEntry = new CheckoutRecordEntry(checkoutRecordRepository.getNextId(),
                LocalDate.now(), LocalDate.now().plusDays(bookCopy.getBook().getMaxCheckoutLength()), bookCopy);

        return checkoutRecordRepository.checkout(recordEntry, member.getId());
    }

    public BookCopy findBook(String isbn) throws Exception {
        return bookRepository.getAvailableBookCopy(isbn);
    }

    public LibraryMember findMember(String memberId) throws Exception {
        return memberRepository.getMember(memberId);
    }

    public List<CheckoutRecord> getCheckoutRecords(String memberId) throws Exception {
        return checkoutRecordRepository.getMemberCheckoutRecords(memberId);
    }
}
