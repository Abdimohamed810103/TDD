package stub;

import org.example.stub.Books;
import org.example.stub.DeynRepo;
import org.example.stub.DeynService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.print.Book;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StubTest {

    @Test
    void TestStub() {
        DeynRepo deynRepo = new DeynRepoStub();
        DeynService deynService = new DeynService(deynRepo);

        List<Books> afterDescount = deynService.addDescountToSelectedBooks(10, 3);

        assertEquals(3, afterDescount.size());
    }

    @Test
    void TestStubWithMockito() {
        DeynRepo deynRepo = Mockito.mock(DeynRepo.class);
        DeynService deynService = new DeynService(deynRepo);

        List<Books> books = List.of(new Books(1, "abdi", 500),new Books(2, "abdi", 400) );

        Mockito.when(deynRepo.getSelectedBooks(7)).thenReturn(books);

        List<Books> newBooks = deynService.addDescountToSelectedBooks(10, 7);

        assertEquals(2, newBooks.size());
        assertEquals(450, newBooks.get(0).getPrice());
        assertEquals(360, newBooks.get(1).getPrice());

    }
}
