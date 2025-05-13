import java.util.ArrayList;
import java.util.List;

public class Library {
    private MemberList memberList;
    private BookCatalogue bookCatalogue;

    public Library() {
        this.memberList = new MemberList();
        this.bookCatalogue = new BookCatalogue();
    }

    public void talk(){
        System.out.println("Bla bla");
    }

}
