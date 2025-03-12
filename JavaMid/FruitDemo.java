public class FruitDemo {

        public static void main(String[] args) {

               Fruit f1 = new Fruit();

               f1.setName("오렌지");

               f1.setCount(3);

               Fruit f2 = new Fruit("사과", 2);

               f2.addCount(2);

               System.out.println(f1);

               System.out.println(f2);

        }
}