public class Calendar {
    private int day;
    public String month;
    public int year;
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void rotate(){
        System.out.println("И снова третье сентября");
    }

    @Override
    public String toString() {
        return "День: " +day+" Месяц: "+month+" Год: "+year;

    }

}
