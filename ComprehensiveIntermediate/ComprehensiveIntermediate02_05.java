class Juice {
    String name;
    String taste;
    int price;

    public String buyDrink() {
        return (name + "の" + taste + "味です。" + price + "円になります。");
    }
}

class Coffee {
    String name;
    String bitter;
    String milk;
    int price;

    public String buyDrink() {
        return (name + "の甘さは" + bitter + "、ミルク" + milk + "です。" + price + "円になります。");
    }
}

public class ComprehensiveIntermediate02_05 {

    public static void main(String[] args) {

        Juice juice_01 = new Juice();
        Juice juice_02 = new Juice();

        Coffee coffee_01 = new Coffee();
        Coffee coffee_02 = new Coffee();

        juice_01.name = "バヤリース";
        juice_02.name = "午後の紅茶";
        juice_01.taste = "オレンジ";
        juice_02.taste = "レモンティー";
        juice_01.price = 130;
        juice_02.price = 150;

        coffee_01.name = "ボス";
        coffee_02.name = "ジョージア";
        coffee_01.bitter = "控え目";
        coffee_02.bitter = "甘め";
        coffee_01.milk = "無し";
        coffee_02.milk = "入り";
        coffee_01.price = 110;
        coffee_02.price = 120;

        System.out.println(juice_01.buyDrink());
        System.out.println(juice_02.buyDrink());

        System.out.println(coffee_01.buyDrink());
        System.out.println(coffee_02.buyDrink());
    }
}
