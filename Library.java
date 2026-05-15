import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Member> members;
    private List<Title> titles;
    private List<Borrowable> borrowables;

    public Library() {

        this.members = new ArrayList<>();
        this.titles = new ArrayList<>();
        this.borrowables = new ArrayList<>();
    }

    public void addMember(int id, String name) {

        members.add(new Member(id, name));
    }

    public void addTitle(Title t) {
        this.titles.add(title);
    }

    public addBorrowable (Borrowable b){
        this.borrowables.add(b);
    }

    public displayAllMembers(){
        System.out.println("--- Library Members ---");
        for (member m : members){
            System.out.println(m);
        }
    }

    public void displayAllBorrowables() {
        System.out.println("--- All Borrowable Items ---");
        for (Borrowable b : borrowables) {
            System.out.println(b);
        }
    }

    public void displayBorrowedItems() {
        System.out.println("Currently Borrowed Items ---");
        for (Borrowable b : borrowables) {
            if (!b.isAvailable()) {
                System.out.println(b);
            }
        }
    }
}