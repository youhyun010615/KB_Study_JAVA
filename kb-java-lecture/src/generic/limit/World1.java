package generic.limit;

public class World1 {
    public static void main(String[] args) {
        GenericAptApt<Integer> integerAptApt1 = new GenericAptApt<>();
        integerAptApt1.setNumber(1118);
        System.out.println(integerAptApt1.getNumber());


        GenericAptApt<Long> longAptApt1 = new GenericAptApt<>();
        longAptApt1.setNumber(20711L);
        System.out.println(longAptApt1.getNumber());

        Double seoung = longAptApt1.transDouble();
        System.out.println(seoung);
    }
}
