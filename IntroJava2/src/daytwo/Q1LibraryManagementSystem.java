package daytwo;

import java.util.*;

abstract class Account {
    private String id;
    private String password;
}

class Librarian extends Account {
}

class Member extends Account {
    private Date dateOfMembership;
    private int totalBooksCheckedout;
}

interface issue{
    void issueBooks();
    void alreadyIssuedBooks();
}

interface return_book{
    void haveToReturn();
    void returned_Books();
    void total_Balance();
}

class Library implements issue,return_book{
    @Override
    public void issueBooks() { }

    @Override
    public void alreadyIssuedBooks() {}

    @Override
    public void haveToReturn() {}

    @Override
    public void returned_Books() {}

    @Override
    public void total_Balance() {}

    void DisplayBooks(){
        List<String> Books=new ArrayList<String>();
        Books.add("DBMS");
        Books.add("SQL");
        Books.add("JAVA");
        Books.add("DAA");
        Books.add("gradle");
        Books.add("linux");
        System.out.println("Books available in library are :");
        for(String x: Books){
            System.out.println(x);
        }
    }
}
class Q1LibraryManagementSystem extends Library{
    public static void main(String[] args) {

        Library l = new Library();
        l.DisplayBooks();
        l.issueBooks();

    }
}
