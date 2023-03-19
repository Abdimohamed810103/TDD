package dummyTest;

import org.example.dummy.EmailRepo;

public class FakeEmailDummy implements EmailRepo {
    @Override
    public void sendEmail() {
        throw new AssertionError("This is not implementet jet please gp green");
    }
}
