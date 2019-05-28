public class Main {
    public static void main(String[] args) {
        /*AClass aClass = new AClass();
        BClass bClass = new BClass();
        aClass.data1 = 1;
        aClass.data2 = 2;
        BeanUtils.assign(bClass, aClass);
        System.out.println(bClass.data1);*/
        Carrier<Double> carrier = new Carrier<>(10.);
        Carrier<Number> carrier1 = new Carrier<>();
        BeanUtils.assign(carrier1, carrier);
        System.out.println(carrier1.item);
    }
}
