package Models;

import java.util.Calendar;
import java.util.Date;

public class CheckoutRecord {
    private Book book;
    private User user;
    private Date checkoutDate;
    private Date dueDate;

    private Date getNextMonthDate()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        return calendar.getTime();
    }
    public CheckoutRecord() {
        this.book = new Book();
        this.user = new User();
        this.checkoutDate = new Date();
        this.dueDate = getNextMonthDate();
    }

    public CheckoutRecord(Book book, User user) {
        this.book = new Book(book);
        this.user = new User(user);
        this.checkoutDate = new Date();
        this.dueDate = getNextMonthDate();
    }
    public CheckoutRecord(Book book, User user, Date checkoutDate, Date dueDate) {
        this.book = new Book(book);
        this.user = new User(user);
        this.checkoutDate = (Date)checkoutDate.clone();
        this.dueDate = (Date)dueDate.clone();
    }


    public Book getBook() {
        return new Book(book);
    }

    public void setBook(Book book) {
        this.book = new Book(book);
    }

    public User getUser() {
        return new User(user);
    }

    public void setUser(User user) {
        this.user = new User(user);
    }

    public Date getCheckoutDate() {
        return (Date)checkoutDate.clone();
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = (Date)checkoutDate.clone();
    }

    public Date getDueDate() {
        return (Date)dueDate.clone();
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = (Date)dueDate.clone();
    }
}
