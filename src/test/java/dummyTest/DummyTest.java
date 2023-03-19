package dummyTest;

import org.example.dummy.Books;
import org.example.dummy.DeynRepo;
import org.example.dummy.DeynService;
import org.example.dummy.EmailRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {

    @Test
    void TestDummy() {
        DeynRepo deynRepo = new FakeDeynRepo();
        EmailRepo emailRepo = new FakeEmailDummy();
        DeynService deynService = new DeynService(deynRepo, emailRepo);

        deynService.addToList(new Books(1, "Barashada Diinta", 23));
        deynService.addToList(new Books(2, "Barashada Diinta", 23));
        deynService.addToList(new Books(3, "Barashada Diinta", 23));

        assertEquals(3, deynService.getNumberOfDeyns());
    }
}
