public class LibraryProgram {

    static Library lib = new Library();

    public static void main(String[] args) {

        lib.addTitle(new Book(101, "Hobbit", "J.R.R. Tolkin"));
        lib.addTitle(new Book(102, "Lord of the rings", "J.R.R. Tolkin"));
        lib.addTitle(new Journal(103, "Data System", "Mirko Mirkovic"));

        lib.addBorrowable(new BookCopy(1, (Book) (lib.findTitleByID(1))));
        lib.addBorrowable(new BookCopy(2, (Book) (lib.findTitleByID(1))));
        lib.addBorrowable(new BookCopy(3, (Book) (lib.findTitleByID(3))));

        lib.displayAllBorrowables();

        addMember();
        addMember();

        newLoan();
        newLoan();

        lib.displayAllMembers();
        lib.displayAllBorrowables();
        lib.displayBorrowedItems();

        returnLoan();
        
        lib.displayAllBorrowables();
        lib.displayBorrowedItems();
    }

    public static void addMember() {
        System.out.println("\n\n ADD NEW MEMBER");

        System.out.println("Please, provide new member's name: ");
        String memberName = scan.nextLine();

        System.out.println("Please, provide new member's ID: ");
        int memberID = scan.nextInt();
        scan.nextLine();

        lib.addMember(memberID, memberName);
    }
    
    public static void newLoan() {
        System.out.println("\nFUNCTIONALITY: BORROW A BOOK COPY");

        System.out.print("Enter Member ID: ");
        int memberId = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Book Copy ID to borrow: ");
        int copyId = scan.nextInt();
        scan.nextLine(); 

        Member m;
        Borrowable b;

       m = lib.findMemberByID(memberId);
       b = lib.findBorrowableByID(borID);
       m.borrows(b);
    }

    public static void returnLoan() {
        System.out.println("\nFUNCTIONALITY: RETURN A BOOK COPY");

        System.out.print("Enter Member ID: ");
        int memberId = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Book Copy ID to return: ");
        int copyId = scan.nextInt();
        scan.nextLine();

        System.out.println("Please, provide borrowable item's ID: ");
        int borID = scan.nextInt();
        scan.nextLine();

        Member m;
        Borrowable b;

        m = lib.findMemberByID(memberId);
        b = lib.findBorrowableByID(borID);
        m.returns(b);
    }
}