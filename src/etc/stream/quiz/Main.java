package etc.stream.quiz;

import etc.enum_.Kbo;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.min;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static util.Utility.makeLine;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        List<Transaction> tr2021 = transactions
                .stream()
                .filter(trs -> trs.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        tr2021.forEach(System.out::println);
        makeLine();
        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        Set<String> cities = transactions
                .stream()
                .map(trs -> trs.getTrader().getCity())
                .collect(Collectors.toSet());
        System.out.println(cities);
        makeLine();
        // 연습 3: Cambridge에 근무하는 모든 거래자(Trader)를 찾아
        // 거래자 리스트로 이름순으로 오름차 정렬.
        List<Trader> traders = transactions
                .stream()
                .filter(str -> str.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .map(Transaction::getTrader)
                .sorted(comparing(Trader::getName))
                .collect(toList());
            traders.forEach(System.out::println);
        makeLine();
        // 연습 4: 모든 거래자의 이름을 리스트에 모아서
        // 알파벳순으로  오름차 정렬하여 반환
        List<String> collects = transactions
                .stream()
                .map(str -> str.getTrader().getName())
//                .sorted(Comparator.reverseOrder()) --> 내림차
                .sorted() // map한 결과가 문자열 리스트
                .collect(toList());
            collects.forEach(System.out::println);
            makeLine();
        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
/*        transactions.stream()
                .anyMatch(trs->trs.getTrader().getCity().equals("Milan"))*/
        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
/*        transactions
                .stream()
                .map(trs->trs.getTrader().getCity().equalsIgnoreCase("Cambrdige"))
                .mapToInt(Transaction::getValue);
        System.out.println("totalvalue = " + totvalue);*/
        makeLine();
        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int max = transactions.stream().mapToInt(trs -> trs.getValue()).max().getAsInt();
        System.out.println("max = " + max);
        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        transactions
                .stream()
                .mapToInt(trs -> trs.getValue())
                .min()
                .getAsInt();
        System.out.println("max = " + max);
        makeLine();
        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고,
        // 해당 거래의 정보를 출력하시오.
        transactions
                .stream()
                .filter(trs->trs.getValue() >=500)
                .collect(toList())
                .forEach(System.out::println);
        makeLine();



        // 연습 10. 모든 거래에서 가장 작은 거래액보다
        // 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
/*        double asDouble = transactions
                .stream()
                .filter(trs -> trs.getValue() > min()).
                mapToInt()
                .average()
                .getAsDouble();*/
        //연습 11
/*

//         "cmabridge"에서 거래하는 모든거래자의 거래정보들을 연도별로 그룹화하여 출력하세요
        Map<Integer, List<Transaction>> cambridgeTrsMap = transactions
                .stream()
                .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .collect(groupingBy(Transaction::getYear));
        makeLine();
        cambridgeTrsMap.forEach(Key.value) ->{
            System.out.println("year = " + key);
            value.forEach(sout);
        };

*/

    }
}















