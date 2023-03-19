package org.example.fake;

public class DeynService {
    private DeynRepo deynRepo;

    public DeynService(DeynRepo deynRepo) {
        this.deynRepo = deynRepo;
    }

    public void addToList(Books books){
      deynRepo.addToList(books);
    }
    public int getNumberOfDeyns(){
      return  deynRepo.findByAll().size();
    }
}
