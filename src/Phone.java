public class Phone {
    private String model;

    private String colour;

    private int price;

    private int balance;

    public Phone(String model, String colour, int price, int balance) {
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.balance = balance;
    }
////Getters
    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public int getBalance() {
        return balance;
    }
////ToString
    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", balance=" + balance +
                '}';
    }
///Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) throws Exception{
        this.price = price;
        if (price <=0 || price > 200000){
            throw new Exception("ошибка, цена должна быть от 1 до 200000 ");
        }
    }
    public void setBalance(int balance) throws Exception{
        this.balance = balance;
        if (price <=0 || price > 20000000) {
            throw new Exception("ошибка, кол-во должна быть от 1 до 200000");
        }
    }
}
