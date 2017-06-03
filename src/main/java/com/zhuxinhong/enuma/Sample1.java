package com.zhuxinhong.enuma;

/**
 * Created by zhuxh on 17/4/5.
 */
public class Sample1 {

    public static enum STATISTICS_ENUM {
        FEEDBACK_TICKET_CNT("ticket_cnt"),
        FEEDBACK_USER_CNT("user_cnt");

        private final String value;

        private STATISTICS_ENUM(String type) {
            this.value = type;
        }
    }

    public static void main(String[] args) {
        String str = "user_cnt";
//        System.out.println(STATISTICS_ENUM.FEEDBACK_USER_CNT.valueOf(str) == STATISTICS_ENUM.FEEDBACK_USER_CNT);
//        System.out.println(STATISTICS_ENUM.FEEDBACK_USER_CNT.valueOf(str).equals(STATISTICS_ENUM.FEEDBACK_USER_CNT));

        int i;
        i=10;
    }
}

