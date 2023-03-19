package org.example.dummy;

import java.util.Collection;

public interface DeynRepo {

    void addToList(Books book);
    Collection<Books> findByAll();
}
