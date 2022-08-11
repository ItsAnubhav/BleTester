package com.jstyle.blesdk1963_03.model;

/**
 * Created by Administrator on 2018/4/8.
 */

public class SendData {
    public static final byte CMD_SET_TIME = (byte) 0x01;//设置时间
    public static final byte CMD_SET_USERINFO = (byte) 0x02;//设置用户信息
    public static final byte CMD_GET_USERINFO = (byte) 0x42;//获取用户信息
    public static final byte CMD_GET_SLEEPDATA = (byte) 0x44;//获取睡眠详细数据
    public static final byte CMD_GET_HEARTE_BREATH_DATA = (byte) 0x17;//获取心率呼吸历史数据
    public static final byte CMD_GET_BED_DATA = (byte) 0x14;//获取上床下床数据
    public static final byte CMD_GET_TurnOver_DATA = (byte) 0x15;//获取翻身数据
    public static final byte CMD_SET_DEVICE_ID = (byte) 0x05;//设置设备id
    public static final byte CMD_ENABLE_ACTIVITY_HEART = (byte) 0x11;//开启实时测量心率
    public static final byte CMD_SET_FACTORY = (byte) 0x12;//恢复出厂设置
    public static final byte CMD_GET_BATTERY = (byte) 0x13;//获取设备电量
    public static final byte CMD_GET_MAC = (byte) 0x22;//获取设备物理地址
    public static final byte CMD_GET_VERSION = (byte) 0x27;//获取设备固件版本号
    public static final byte CMD_SET_MCU_REST = (byte) 0x2E;//mcu复位
    public static final byte CMD_SET_DFUMODE = (byte) 0x47;//进入dfu升级模式
    public static final byte CMD_SET_NAME = (byte) 0x3D;//设置设备名字
    public static final byte CMD_GET_TIME = (byte) 0x41;//获取设备时间
    public static final byte CMD_GET_DayData = (byte) 0x43;//
    public static final byte CMD_Sleep_Activity = (byte)0x16;
    public static final byte CMD_sendPwd = (byte)0x3c;
    public static final byte cmdCheck = (byte) 0x90;

    /**
     * 获取crc
     *
     * @param value
     */
    public static void crcValue(byte[] value) {
        byte crc = 0;
        for (int i = 0; i < 15; i++) {
            crc += value[i];
        }
        value[15] = (byte) (crc & 0xff);
    }

    /**
     * 设置时间
     *
     * @return
     */
    public static byte[] sendTime() {
        byte[] value = new byte[16];
//       // String time = DateUtil.getFormatTimeString(System.currentTimeMillis(), "yy-MM-dd HH:mm:ss");
//        value[0] = CMD_SET_TIME;
//        value[1] = (byte) ResolveData.getBcd(time.substring(0, 2));
//        value[2] = (byte) ResolveData.getBcd(time.substring(3, 5));
//        value[3] = (byte) ResolveData.getBcd(time.substring(6, 8));
//        value[4] = (byte) ResolveData.getBcd(time.substring(9, 11));
//        value[5] = (byte) ResolveData.getBcd(time.substring(12, 14));
//        value[6] = (byte) ResolveData.getBcd(time.substring(15));
        crcValue(value);
        return value;
    }

    /**
     * 实时心率使能
     *
     * @param enable true开启 false关闭
     * @return
     */
    public static byte[] enableActivityHeart(boolean enable) {
        byte[] value = new byte[16];
        value[0] = CMD_ENABLE_ACTIVITY_HEART;
        value[1] = (byte) (enable ? 1 : 0);
        crcValue(value);
        return value;
    }

    /**
     * 获取睡眠详细数据
     *
     * @param count
     * @return
     */
    public static byte[] getSleepData(int count) {
        byte[] value = new byte[16];
        value[0] = CMD_GET_SLEEPDATA;
        value[1] = (byte) count;
        crcValue(value);
        return value;
    }

    /**
     * 获取心率呼吸数据
     *
     * @param count
     * @return
     */
    public static byte[] getHeartRateBreathData(int count) {
        byte[] value = new byte[16];
        value[0] = CMD_GET_HEARTE_BREATH_DATA;
        value[1] = (byte) count;
        crcValue(value);
        return value;
    }

    /**
     * 获取上床下床时间
     *
     * @param count
     * @return
     */
    public static byte[] getBedUpTime(int count) {
        byte[] value = new byte[16];
        value[0] = CMD_GET_BED_DATA;
        value[1] = (byte) count;
        crcValue(value);
        return value;
    }

    /**
     * 获取翻身数据
     *
     * @param count
     * @return
     */
    public static byte[] getTurnOverData(int count) {
        byte[] value = new byte[16];
        value[0] = CMD_GET_TurnOver_DATA;
        value[1] = (byte) count;
        crcValue(value);
        return value;
    }

    /**
     * 获取设备电量
     *
     * @return
     */
    public static byte[] getBattery() {
        byte[] value = new byte[16];
        value[0] = CMD_GET_BATTERY;
        crcValue(value);
        return value;
    }

    /**
     * 进入dfu模式
     *
     * @return
     */
    public static byte[] entryDfuMode() {
        byte[] value = new byte[16];
        value[0] = CMD_SET_DFUMODE;

        crcValue(value);
        return value;
    }

    /**
     * 获取设备版本号
     *
     * @return
     */
    public static byte[] getDeviceVersion() {
        byte[] value = new byte[16];
        value[0] = CMD_GET_VERSION;
        crcValue(value);
        return value;
    }
    public static byte[] getSleepActivityValue(boolean enable){
        byte[]value=new byte[16];
        value[0]=CMD_Sleep_Activity;
        value[1] = (byte) (enable ? 1 : 0);
        crcValue(value);
        return value;
    }
    public static byte[] disableAncs() {
        byte[] value = new byte[16];
        value[0] = 0x03;
        value[6] = (byte) 0x80;

        crcValue(value);
        return value;
    }
    public static byte[] getDayData(int day) {
        byte[] value = new byte[16];
        value[0] = CMD_GET_DayData;
        value[1] = (byte) day;
        crcValue(value);
        return value;
    }
    public static byte[] getDeviceTime() {
        byte[] value = new byte[16];
        value[0] = CMD_GET_TIME;
        crcValue(value);
        return value;
    }
    public static byte[] sendPwd() {
        byte[] value = new byte[16];
        value[0] = CMD_sendPwd;
        value[1]=0x73;
        value[2]=0x24;
        value[3]= (byte) 0x89;
        value[4]= (byte) 0xa5;
        value[5]= (byte) 0xb4;
        value[6]= (byte) 0xc7;
//        char[]pwdChars=pwd.toCharArray();
//        for(int i=0;i<pwdChars.length;i++){
//            value[i+1]=(byte) pwdChars[i];
//        }
        crcValue(value);
        return value;
    }

    public static byte[] getDeviceInfoer() {
        byte[] value = new byte[16];
        value[0] =(byte)0x04;
        crcValue(value);
        return value;
    }

    public static byte[] setWatchFaceCustomStyle(int styleMode) {
        byte[] value = new byte[16];
        value[0] =(byte)0x03;
        value[12] = (byte) (styleMode + 0xc0);
        crcValue(value);
        return value;
    }


}
