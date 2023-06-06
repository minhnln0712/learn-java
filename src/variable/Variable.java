package variable;

public class Variable {

    public Variable() {
    }

    /*
    ***Có 8 loại primitive datatype cơ bản
    *boolean 1 bit   : true or false
    byte    1 byte  : -128 ~ 127
    short   2 bytes : -32,768 ~ 32,767
    *int     4 bytes : -2 tỉ ~ 2 tỉ
    long    8 bytes : -9 triệu tỉ ~ 9 triệu tỉ
    float   4 bytes : 3.141592f (6 số thập phân)
    *double  8 bytes : 3.141592653589793 (15 số thập phân)
    *char    2 bytes : 'a' (1 chữ cái/ký tự/ASCII value)
    và 1 loại reference data thường dùng
    *String  varies  : "Đây là 1 chuỗi (String)"
    */
    public void printVariable() {
        boolean boolValue = true;
        byte byteValue = (byte) 127;
        short shortValue = (short) 32767;
        int intValue = 123;
        float floatValue = 123.12345678f;
        double doubleValue = 123.1234567890123456;
        char charValue = 'a';
        String stringValue = "Đây là 1 chuỗi (String)";

        System.out.println("Đây là boolean: " + boolValue);
        System.out.println("Đây là byte: " + byteValue);
        System.out.println("Đây là short: " + shortValue);
        System.out.println("Đây là int: " + intValue);
        System.out.println("Đây là float: " + floatValue);
        System.out.println("Đây là double: " + doubleValue);
        System.out.println("Đây là char: " + charValue);
        System.out.println("Đây là String: " + stringValue);
    }
}
