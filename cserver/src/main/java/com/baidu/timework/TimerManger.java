package com.baidu.timework;

import java.util.Calendar;
import java.util.Date;

/**
 *         <p>
 *         Created by mayongbin01 on 2017/1/23.</p>
 */
public class TimerManger {

    private static final long PERIOD_DAY = 24 * 60 * 60 * 1000;

    public TimerManger() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        Date date = calendar.getTime();
    }
}
