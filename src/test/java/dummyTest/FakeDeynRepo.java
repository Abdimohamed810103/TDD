package dummyTest;

import org.example.dummy.Books;
import org.example.dummy.DeynRepo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeDeynRepo implements DeynRepo {
    Map<Integer, org.example.dummy.Books> mapBook = new HashMap<>();
    @Override
    public void addToList(org.example.dummy.Books book) {
     mapBook.put(book.getId(), book);
    }


    @Override
    public Collection<Books> findByAll() {
        return mapBook.values();
    }
}
