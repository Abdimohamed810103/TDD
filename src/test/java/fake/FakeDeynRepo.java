package fake;

import org.example.fake.Books;
import org.example.fake.DeynRepo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeDeynRepo implements DeynRepo {
    Map<Integer, Books> mapBook = new HashMap<>();
    @Override
    public void addToList(Books book) {
     mapBook.put(book.getId(), book);
    }

    @Override
    public Collection<Books> findByAll() {
        return mapBook.values();
    }
}
