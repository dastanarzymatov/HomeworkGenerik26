public class Main {
    public static void main(String[] args) {
//        Box деген generic класс тузунуз.
//                Ичинде Box деген объектти кайтарган статический generic метод болсун.

        Box<Integer> box=new Box<>(33,44);
        Box<Integer> box2=new Box<>(22,22);
        Box.generikMehoh(box,box2);


    }
}