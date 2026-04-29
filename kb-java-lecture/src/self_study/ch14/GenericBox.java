package self_study.ch14;

public class GenericBox<Type> {
    private Type value;

    public void setValue(Type value){
        this.value = value;
    }

    public Type getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }

}
