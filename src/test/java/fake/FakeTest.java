package fake;

import org.example.fake.Books;
import org.example.fake.DeynRepo;
import org.example.fake.DeynService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeTest {

    @Test
    void TestFake() {
        DeynRepo deynRepo = new FakeDeynRepo();
        DeynService deynService = new DeynService(deynRepo);

        deynService.addToList(new Books(1, "Barashada Diinta", 23));
        deynService.addToList(new Books(2, "Barashada Diinta", 23));
        deynService.addToList(new Books(3, "Barashada Diinta", 23));

       assertEquals(3, deynService.getNumberOfDeyns());
    }

    @Test
    void TestFakeMockito() {
    DeynRepo deynRepo = Mockito.mock(DeynRepo.class);
    DeynService deynService = new DeynService(deynRepo);

    Books books = new Books(1, "Somaliada", 500);
    Books book4 = new Books(2, "angered", 700);
    Collection<Books> book = new ArrayList<>();
    book.add(books);
    book.add(book4);

    Mockito.when(deynRepo.findByAll()).thenReturn(book);

    assertEquals(1, deynService.getNumberOfDeyns());

    }
}
