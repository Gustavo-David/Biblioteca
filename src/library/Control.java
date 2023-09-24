package library;

import java.util.ArrayList;
import java.util.List;

public class Control{
        private List<Books> BooksList = new ArrayList<>();
        
        public Control() {
        }

        public Control(Books newBook) {
              setBooksList(newBook);
        }

        public List<Books> getBooksList() {
                return BooksList;
        }

        public void setBooksList(Books newBook) {
               BooksList.add(newBook);
        }

        


}