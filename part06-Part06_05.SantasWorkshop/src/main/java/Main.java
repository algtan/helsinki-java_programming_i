public class Main {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package packages = new Package();
        packages.addGift(book);
        System.out.println(packages.totalWeight());
    }
}