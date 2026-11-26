package main.completebuild;

import java.util.*;
import java.util.logging.Logger;

public class Library {

    private static final Logger logger = Logger.getLogger(Library.class.getName());

    private List<Media> medias = new ArrayList<>();
    private Map<String, Media> mediaById = new HashMap<>();
    private List<Loan> loanHistory =  new ArrayList<>();


    public boolean addMedia(Media media){
        if (mediaById.containsKey(media.getId())){
            return false;
        }
        medias.add(media);
        mediaById.put(media.getId(), media);
        return true;
    }

    public Media getById(String id){
        return mediaById.get(id);
    }

    public List<Media> getSorted(){
        List<Media> sorted = new ArrayList<>(medias);
        Collections.sort(sorted);
        return sorted;
    }

    public Set<String> getBorrowers(){

        Set<String> borrowers = new HashSet<>();
        for(Loan loan : loanHistory){
            borrowers.add(loan.getBorrower());
        }
        return borrowers;
    }

    public boolean borrow(String id, String borrower){
        Media media = getById(id);
        if (media == null){
            logger.info("Book not found");
            return false;
        }
        if (!media.borrow()){
            logger.info("Book already borrowed");
            return false;
        }
        logger.info(borrower + " lånade "  + media.getTitle());
        Loan loan = new Loan(media, borrower);
        loanHistory.add(loan);
        return true;
    }
}
