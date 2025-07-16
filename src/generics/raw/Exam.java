package generics.raw;

public class Exam {
    Object code;

    public Exam(Object code){
        this.code = code;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "code=" + code +
                "type = "+this.getClass().getSimpleName()+
                '}';
    }
}
