package org.example.stub;

import java.util.Collection;
import java.util.List;

public interface DeynRepo {


    List<Books> getSelectedBooks(int selected);

    Books findById(Integer p);

    void save(Books books);
}
