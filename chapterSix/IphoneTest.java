package chapterSix;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone myIphone = new Iphone("white", 200_000 );
        System.out.printf("my %s Iphone is $%.2f", myIphone.getColor(), Iphone.getPrice());
    }
}
