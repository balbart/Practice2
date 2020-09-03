public class Loader {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.color = "Белый";
        ball.diameter = 30;
        ball.type = "Футбольный";
        System.out.println(ball);


        Book book = new Book();
        book.setAmountOfPages(35);
        book.setAuthor("Лапенко");
        book.setPublishingHouse("Питер");
        book.setTitle("Жизнь Лапенко");
        book.setYear(2020);
        System.out.println(book);

        Dog[] dog = new Dog[3];
        dog[0] = new Dog("хаски", 3, "белый");
        dog[1] = new Dog("маламут", 4, "черный");
        dog[2] = new Dog("лайка", 2, "желтый");
        for(int i = 0; i < 3; i++){
            System.out.println(dog[i]);
        }
    }
}
