public class Box <T>{
  //  Box деген generic класс тузунуз.
//                Ичинде Box деген объектти кайтарган статический generic метод болсун.
    private T var;
    private T var2;

    public Box(T var, T var2) {
        this.var = var;
        this.var2 = var2;
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public T getVar2() {
        return var2;
    }

    public void setVar2(T var2) {
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "Box{" +
                "var=" + var +
                ", var2=" + var2 +
                '}';
    }public static  <T> void generikMehoh(T var,T var2){
        System.out.println(var);
        System.out.println(var2);
    }
}
