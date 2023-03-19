package org.example.dummy;

public class DeynService {
    private DeynRepo deynRepo;
    private EmailRepo emailRepo;

    public DeynService(DeynRepo deynRepo, EmailRepo emailRepo) {
        this.deynRepo = deynRepo;
        this.emailRepo = emailRepo;
    }

    public void addToList(Books books){
      deynRepo.addToList(books);
    }
    public int getNumberOfDeyns(){
      return  deynRepo.findByAll().size();
    }
}
