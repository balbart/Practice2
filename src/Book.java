public class Book {
    private String author;
    private String title;
    private int year;
    private int amountOfPages;
    private String publisher;

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setAmountOfPages(int amountOfPages){
        this.amountOfPages = amountOfPages;
    }
    public int getAmountOfPages(){
        return amountOfPages;
    }
    public void setPublishingHouse(String publishingHouse){
        this.publisher = publishingHouse;
    }
    public String getPublisher(){
        return publisher;
    }

    @Override
    public String toString() {
        return "Book" +
                "\nauthor= " + getAuthor() +
                "\ntitle= " + getTitle() +
                "\nyear= " + getYear() +
                "\namountOfPages= " + getAmountOfPages() +
                "\npublisher= " + getPublisher() + '\n';
    }
}
