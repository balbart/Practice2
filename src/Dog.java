public class Dog {
    public String breed;
    public int age;
    public String color;

    public Dog(String breed, int age, String color){
        this.breed = breed;
        this.age = age;
        this.color = color;
    }


    public int inHumanAges(){
        return age*7;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Dog" +
                "\nbreed= " + getBreed() +
                "\nage= " + getAge() +
                "\ncolor= " + getColor() +
                "\nв человеческих годах = "+inHumanAges()+'\n';
    }
}
