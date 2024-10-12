package java.features.language_fundamentals.datatype_value_assign;

public class _01_DataType_Value_Assign_Demo1 {

    public static void main(String[] args) {

        /*
            Byte (1) -> Short (2) ->
	                                 Int (4) -> Long (8) -> Float (4) -> Double (8)
                        Char (2) ->

            Here, the data types are represented in the order of growing in size from left to right.

            So, Double datatype can hold the float and double values. Like float can hold float and long
            values. Like this the chain will go till Byte. So, Short data can hold short and byte values.
        */

        /*
            Eight-byte long value can be assigned to 4-byte float variable.
            Because both are following different memory representation internally.
        */
        float f1 = 10L;
        System.out.println(f1);

        /*
            Points about Short & char
            =========================
            The Char and Short are of 2 bytes.

            But we can’t assign the values of Char to Short and vice versa.

            Since, both are following the different representation in memory.

            Char is unsigned representation whereas Short is signed representation.

            Char uses 16 bits to represent the values whereas Short uses 15 bits only
            to represent the values and 1 bit for sign.
        */
    }
}
