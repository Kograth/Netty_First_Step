package ru.cse.proxysorter.Processors;

import ru.cse.proxysorter.NettyCodecs.DecoderSorterTlg;

public class CheckRequest {

    public static byte MSGTYPE = DecoderSorterTlg.getMsgType();

    public boolean IsThisRequest11() {
       byte COMMAND = 0x11;
       return  CompareCommand(MSGTYPE,COMMAND);
    }

    public boolean IsThisRequest13() {
        byte COMMAND = 0x13;
        return CompareCommand(MSGTYPE,COMMAND);
    }

    public boolean IsThisRequest17() {
        byte COMMAND = 0x17;
        return CompareCommand(MSGTYPE,COMMAND);
    }

    public boolean IsThisRequest111() {
        byte COMMAND = 0x6F;
        return CompareCommand(MSGTYPE,COMMAND);
    }

    public boolean IsThisRequest19() {
        byte COMMAND = 0x19;
        return CompareCommand(MSGTYPE,COMMAND);
    }

    public boolean CompareCommand(byte var1, byte var2) {

        if (var1==var2) {
            return true;
        }
        return false;

    }

}
