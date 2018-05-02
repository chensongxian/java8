package com.csx.time;

import org.junit.Test;
import org.omg.CORBA.portable.ValueOutputStream;
import org.omg.PortableInterceptor.LOCATION_FORWARD;

import javax.sound.midi.Soundbank;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

/**
 * @author csx
 * @Package com.csx.time
 * @Description: jdk1.8日期类
 * @date 2018/4/27 0027
 */
public class TimeDemo {
    @Test
    public void instantTest(){
        Instant now=Instant.now();
        System.out.println(now.toString());
        //毫秒
        System.out.println(now.get(ChronoField.MILLI_OF_SECOND));
        //微秒
        System.out.println(now.get(ChronoField.MICRO_OF_SECOND));
        //纳秒
        System.out.println(now.get(ChronoField.NANO_OF_SECOND));

        //毫秒转instant
        LocalDateTime localDateTime=LocalDateTime.ofInstant(now,ZoneId.systemDefault());

        System.out.println(localDateTime);
    }

    /**
     * LocalDate只有日期
     */
    @Test
    public void localDateTest(){
        //获取当前日期
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        //日期加上一天
        LocalDate plusDaysDate=localDate.plusDays(1);
        System.out.println(plusDaysDate);
        //日期前一天
        LocalDate beforeDate=localDate.minusDays(1);
        System.out.println(beforeDate);
        //日期加上一周
        LocalDate plusWeeksDate=localDate.plusWeeks(1);
        System.out.println(plusWeeksDate);
        //计算当前年的第52天是几月几号
        System.out.println(localDate.withDayOfYear(52));
        //字符串转日期
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        TemporalAccessor temporalAccessor = dateTimeFormatter.parse("2018-01-20");
        LocalDate date = LocalDate.from(temporalAccessor);
        System.out.println(date);
        //格式化日期
        DateTimeFormatter dateToStrFormatter=DateTimeFormatter.ofPattern("yyyyMMdd");
        String format = dateToStrFormatter.format(localDate);
        System.out.println(format);

        //获取本月第一天
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfMonth()));
        //下一个月的第一天
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        //今年的第一天
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfYear()));
        //时间间隔
        System.out.println(localDate.until(plusDaysDate,ChronoUnit.DAYS));
    }

    /**
     * LocalTime只有时间
     */
    @Test
    public void localTimeTest(){
        LocalTime localTime=LocalTime.now();
        System.out.println("local Time:"+localTime);
        //加上四个小时
        System.out.println(localTime.plusHours(4));
    }

    /**
     * LocalDateTime日期加上时间
     */
    @Test
    public void localDateTimeTest(){
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        //加时间
        System.out.println(now.plusDays(1));
        System.out.println(now.plusHours(1));

        //字符串转日期
        DateTimeFormatter strToDateFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        TemporalAccessor temporalAccessor = strToDateFormatter.parse("2018-04-25 17:47:32");
        LocalDateTime dateTime = LocalDateTime.from(temporalAccessor);
        System.out.println(dateTime);

        //日期装字符串
        DateTimeFormatter dateToStrFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateToStrFormatter.format(now);
        System.out.println(format);
    }

    /**
     * period比较日期的差值
     */
    @Test
    public void periodTest(){
        LocalDate now=LocalDate.now();
        LocalDate nextDay=now.plusWeeks(1);

        Period between = Period.between(now, nextDay);
        System.out.println("间隔天数:"+between.getDays());
        System.out.println("间隔月份:"+between.getMonths());
        System.out.println("间隔年:"+between.getYears());

        long days = now.until(nextDay, ChronoUnit.DAYS);
        System.out.println("间隔天数:"+days);
        long weeks=now.until(nextDay,ChronoUnit.WEEKS);
        System.out.println("间隔星期数:"+weeks);
    }

    /**
     * 获取时间间隔
     */
    @Test
    public void durationTest(){
        LocalDateTime now=LocalDateTime.now();
        LocalDateTime end=now.plusDays(1);

        Duration between = Duration.between(now, end);
        System.out.println("间隔秒数:"+between.get(ChronoUnit.SECONDS));
        System.out.println("间隔纳秒:"+between.get(ChronoUnit.NANOS));

        LocalDate nextDay=LocalDate.now().plusDays(1);
        Duration duration=Duration.between(now,nextDay);
        System.out.println(duration.get(ChronoUnit.SECONDS));


    }

    /**
     * 获取当前时间距离明天的时间间隔
     */
    @Test
    public void betweenNowAndMidNight(){
        LocalDateTime now=LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
        LocalDateTime midNight=LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()).plusDays(1).withHour(0).withMinute(0).withSecond(0).withNano(0);
        Duration duration = Duration.between(now, midNight);
        System.out.println(duration.get(ChronoUnit.SECONDS));

        long between = ChronoUnit.SECONDS.between(now, midNight);
        System.out.println(between);
    }


}
