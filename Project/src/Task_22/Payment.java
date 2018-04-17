package Task_22;

import java.util.HashMap;
import java.util.Map;

public class Payment {
    private int totalPrice;
    private Map<Goods, Integer> check;

    public Payment() {
        this.check = new HashMap<>();
    }

    public void print(){
        System.out.println(check);
        System.out.println("Total price of your purchase is: " + totalPrice);
    }

    public void check(Goods goods) {
        if (!check.containsKey(goods)){
            check.put(goods, 1);
        }
        else {
            check.put(goods, check.get(goods) + 1);
        }
        totalPrice+= goods.price;
    }

    public static class Goods{
        private String good;
        private int price;

        public Goods(String good, int price) {
            this.good = good;
            this.price = price;
        }

        @Override
        public String toString() {
            return good + " " + price;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + (good!= null ? good.hashCode() : 0);
            result = 31 * result + price;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj){
                return true;
            }
            if (obj == null){
                return false;
            }
            if (!(obj instanceof Goods)){
                return false;
            }
            Goods goods = (Goods) obj;
            return goods.price==price & goods.good.equals(good);
        }
    }

}
