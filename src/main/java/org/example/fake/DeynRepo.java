package org.example.fake;

import java.util.Collection;

public interface DeynRepo {

    void addToList(Books book);
    Collection<Books> findByAll();
}
