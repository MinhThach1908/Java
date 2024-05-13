package aptech.day7.example2;

public class Product extends BaseEntity{
    private double price;

    public Product() {
        super(); // gọi constructor của thằng cha.
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showCreatedAt(){
        // super giúp xác định rõ đối tượng cần gọi là lớp cha.
        System.out.println("Created at: " + super.getCreatedAt());
    }
}
