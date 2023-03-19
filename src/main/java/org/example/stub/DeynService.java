package org.example.stub;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeynService {
    private DeynRepo deynRepo;

    public DeynService(DeynRepo deynRepo) {
        this.deynRepo = deynRepo;
    }

    public List<Books> addDescountToSelectedBooks(int decount, int selected){
      List<Books> selectedBooks = deynRepo.getSelectedBooks(selected);
        List<Books> collect = selectedBooks.stream().limit(selected).map(books -> {
            int price = (books.getPrice() * decount)/100;
            int newPrice = books.getPrice() - price;
            books.setPrice(newPrice);
            return books;
        }).collect(Collectors.toList());
        return collect;
    }
   public  int getTotalPRice(List<Integer> bookIds ){
       Integer sum = bookIds.stream().map(p -> {
           Books book = deynRepo.findById(p);
           return book.getPrice();
       }).reduce(0, (a, b) -> a + b);

   return sum;
   }
   public void saveData(Books books){
        deynRepo.save(books);
   }

}
