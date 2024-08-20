package etc.api.lang.util.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.getMonth());

        System.out.println("==================================================");

        // 현재 날짜 정보 얻기 (연, 월, 일)
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //현재 시간 정보 얻기 ( 시, 분, 초)
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        // 현재 날짜와 시간 정보 얻기
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // 특정 날짜와 시간정보 얻기
        LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println(beginDate);

        // 연,월,일 따로 추출
        int year = localDateTime.getYear();
        System.out.println("year = " + year);


        // 문자형태의 월 리턴 (Month라는 열거형 타입 중 하나)
        Month month = localDateTime.getMonth();
        System.out.println("month = " + month);

        // 정수형태의 월 리턴
        int monthValue = localDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        //일 추출
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);

        //요일 추출
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);

        // 지금으로부터 3일 뒤
        LocalDateTime plus = localDateTime.plusDays(3);
        System.out.println("plus = " + plus);


        // 지금으로 부터 1년 2개월 7일
        LocalDateTime d3 = localDateTime.plusYears(1).plusMonths(2).plusDays(7);
        System.out.println("d3 = " + d3);

        // 지금으로 부터 9개월 23일전
        LocalDateTime localDateTime1 = localDateTime.minusMonths(9).minusDays(23);
        System.out.println("localDateTime1 = " + localDateTime1);

        //날짜와 날짜간 갭연산
        LocalDate b = LocalDate.of(2020,12,30);
        LocalDate f = LocalDate.of(2022,9,10);

        long between = ChronoUnit.WEEKS.between(b,f);
        System.out.println("between = " + between);

        System.out.println("==============================================================");

        System.out.println(localDateTime);
        
        // 날짜 포멧 변경하기 
        // DateTimeFormatter 객체 생성 -> 원하는 날짜 형태를 서식문자로 표현
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 M월 dd일 E요일 a hh시 mm분 ss초");

        // 준비한 DateTimeFormatter 객체를 format() 매개값으로 전달
        String format = localDateTime.format(dtf);
        System.out.println("format = " + format);

    }

}
