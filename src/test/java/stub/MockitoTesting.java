package stub;

import org.example.stub.Books;
import org.example.stub.DeynRepo;
import org.example.stub.DeynService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MockitoTesting {
    @InjectMocks
    public DeynService deynService;

    @Mock
    public DeynRepo deynRepo;

    @Test
    void TestIfSumIsReturned() {
        List<Integer> booksList = new ArrayList<>();
        booksList.add(1);
        booksList.add(2);

        Books book = new Books(1, "Abdi", 300);
        Books book2 = new Books(2, "Hassan", 400);

        Mockito.when(deynRepo.findById(1)).thenReturn(book);
        Mockito.when(deynRepo.findById(2)).thenReturn(book2);

        int totalPRice = deynService.getTotalPRice(booksList);

        assertEquals(600, totalPRice);

    }

    @Test
    void TestSaveMethod() {
      Books books = new Books(3, "Abdi ali Hassan", 450);
      Mockito.doNothing().when(deynRepo).save(books);
      deynService.saveData(books);

    }
}
