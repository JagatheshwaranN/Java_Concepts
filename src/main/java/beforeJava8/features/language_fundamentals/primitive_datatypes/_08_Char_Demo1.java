package beforeJava8.features.language_fundamentals.primitive_datatypes;

public class _08_Char_Demo1 {

    public static void main(String[] args) {

        /*

            Old languages (C/ C++) are ASCII code based and the number of allowed different ASCII code chars are <=256.

            To represent the 256 chars, 8 bits are enough.

            Hence, the size of Char in old languages is 1 byte.

            But the Java is Unicode code based and the number of Unicode are > 256 and <=65536.

            To represent these many chars, 8 bits may not be enough, and we should go for more than 8 bits.

            Hence, the size of Char in Java is 2 bytes and the range can value from 0 to 65535.

            x-> 2, xx-> 4, xxx-> 8, xxxx->16, xxxxx-> 32, xxxxxx->64, xxxxxxx->128, xxxxxxxx->256
        */
    }
}
