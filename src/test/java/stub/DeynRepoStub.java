package stub;

import org.example.stub.Books;
import org.example.stub.DeynRepo;

import java.util.ArrayList;
import java.util.List;

public class DeynRepoStub implements DeynRepo {
    @Override
    public List<Books> getSelectedBooks(int selected) {
        Books books = new Books(1, "Somalia", 500);
        Books books1 = new Books(2, "Somaliland", 600);
        Books books3 = new Books(3, "SomaliEth", 300);
        List<Books> booksList = new ArrayList<>();
        booksList.add(books);
        booksList.add(books1);
        booksList.add(books3);
        return booksList;
    }

    @Override
    public Books findById(Integer p) {
        return null;
    }

    @Override
    public void save(Books books) {

    }
}
