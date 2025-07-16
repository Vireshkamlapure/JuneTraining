package string;

public class TestStringBufferAndBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.append(" World");
        System.out.println(stringBuilder);

    }
}
