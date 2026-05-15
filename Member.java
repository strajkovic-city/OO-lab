import java.util.ArrayList;
import java.util.List;
//import library.exceptions.AvailabilityExpetion;
//import library.exceptions.LoanLimitsExpetion;
//import library.exceptions.CannotBeReturnedByMemberException;

public class Member {

    private int id;
    private String name;
    private static final int MAX_ON_LOAN = 6;
    private List<Borrowable> onLoan;

    public Member(int id, String name) {
        setId(id);
        setName(name);
        onLoan = new ArrayList<Borrowable>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxOnLoan() {
        return MAX_ON_LOAN;
    }

    public List<Borrowable> getOnLoan() {
        return onLoan;
    }

    public void borrowItem(Borrowable item) {
        if (onLoan.size() < MAX_ON_LOAN && item.isAvailable()) {
            item.borrowItem();
            onLoan.add(item);
        } else {
            System.out.println("Cannot borrow item: limit reached or item unavailable.");
        }
    }

    public void returnItem(Borrowable item) {
        if (onLoan.contains(item)) {
            item.returnItem();
            onLoan.remove(item);
        }
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", itemsOnLoan=" + onLoan.size() + "]";
    }
}