public class Book {
    public String title;
    public int pages;
    public int releaseYear;
    //Tuscias konstruktorius//
    public Book() {
    }
    //Pilnas konstruktorius//
    public Book(String title, int pages, int releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }
    // Sukurti setterius//
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    //Sukurti getterius//
    public String getTitle() {
        return this.title;
    }
    public int getPages() {
        return this.pages;
    }
    public int getReleaseYear() {
        return this.releaseYear;
    }

    @Override
    public String toString() {
        return this.title + " " +
                this.pages + " " +
                this.releaseYear + " " +;
        }

    }


















}
