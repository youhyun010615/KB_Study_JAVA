package self_study.ch14;

public class NumberAptApt <T extends Number>{
    private T number;

    public NumberAptApt(T number){
        this.number = number;
    }

    public double transDouble(){
        return this.number.doubleValue();
    }

    @Override
    public String toString() {
        return "NumberAptApt{" +
                "number=" + number +
                '}';
    }
}
