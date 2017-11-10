package TestData;

import java.io.ByteArrayOutputStream;

public class GetArraysByte {

    byte STXs          = 0x2;
    byte ETXs          = 0x3;
    byte CommandCode   = 0x11;
    int ProductCode         = 49;
    short weight            = 52;
    short StatusWeight      = 53;
    short length            = 54;
    short width             = 55;
    short height            = 56;
    short StatusSize        = 57;
    Character TABs          = 9;

    public byte[] Request11()  throws Exception {

        String BarCode          = new String("4605246004353"+TABs+"4703934000779"+TABs+"4803934000779"+TABs+"4804934000779"+TABs+"4303934000779"+TABs+"5003934000779"+TABs+"0603934000779"+TABs+"4793934000779"+TABs+"4103934000779"+TABs+"4504934000779"+TABs+"4903934000779"+TABs+"450444934000779");

        ByteArrayOutputStream outStream11 = new ByteArrayOutputStream();

        //Чтение байтов из типа ByteBuf преобразует в переменную максимального размера, для выбранного типа. Для типа int будет выбрано аж 4
        // байта поэтому дополним поток нулевыми значениями

        outStream11.write(STXs);
        outStream11.write(CommandCode);
        outStream11.write(0x31);
        outStream11.write(0x51);
        outStream11.write(weight);
        outStream11.write(0x51);
        outStream11.write(StatusWeight);
        outStream11.write(0x51);
        outStream11.write(length);
        outStream11.write(0x51);
        outStream11.write(width);
        outStream11.write(0x51);
        outStream11.write(height);
        outStream11.write(0x51);
        outStream11.write(StatusSize);
        outStream11.write(BarCode.getBytes());
        outStream11.write(ETXs);

        byte[] mass11 = outStream11.toByteArray();

        return mass11;
    }

    public byte[] Request13()  throws Exception {

        ByteArrayOutputStream outStream13 = new ByteArrayOutputStream();
        outStream13.write(STXs);
        outStream13.write(CommandCode);
        outStream13.write(ProductCode);
        outStream13.write(0);
        outStream13.write(0);
        outStream13.write(0x33);
        outStream13.write(ETXs);

        byte[] mass13 = outStream13.toByteArray();

        return mass13;
    }

    public byte[] Request16() throws  Exception {

        ByteArrayOutputStream outStream16 = new ByteArrayOutputStream();
        outStream16.write(STXs);
        outStream16.write(CommandCode);
        outStream16.write(0);
        outStream16.write(0);
        outStream16.write(0);
        outStream16.write(ProductCode);
        outStream16.write(ETXs);

        byte[] mass16 = outStream16.toByteArray();

        return mass16;
    }
}
