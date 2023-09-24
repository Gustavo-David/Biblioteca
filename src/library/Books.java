package library;

public class Books{

        private String name;
        private String author;
        private String publisher;
        private int year;
        private int pages;
        
        public Books() {
        }

        public Books(String name, String author, String publisher, int year, int pages) {
                this.name = name;
                this.author = author;
                this.publisher = publisher;
                this.year = year;
                this.pages = pages;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public String getPublisher() {
                return publisher;
        }

        public void setPublisher(String publisher) {
                this.publisher = publisher;
        }

        public int getYear() {
                return year;
        }

        public void setYear(int year) {
                this.year = year;
        }

        public int getPages() {
                return pages;
        }

        public void setPages(int pages) {
                this.pages = pages;
        }

        
        @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((name == null) ? 0 : name.hashCode());
                return result;
        }

        @Override
        public boolean equals(Object obj) {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (getClass() != obj.getClass())
                        return false;
                Books other = (Books) obj;
                if (name == null) {
                        if (other.name != null)
                                return false;
                } else if (!name.equals(other.name))
                        return false;
                return true;
        }

        @Override
        public String toString() {
                return "Books [name=" + name + ", author=" + author + ", publisher=" + publisher + ", year=" + year
                                + ", pages=" + pages + "]";
        }

        
}