package basic.array;

import java.util.Arrays;

public class Array2d {

    public static void main(String[] args) {

        /*
        국어: score[0][0], score[1][0], score[2][0], score[3][0]
        영어: score[0][1], score[1][1], score[2][1], score[3][1]
        수학: score[0][2], score[1][2], score[2][2], score[3][2]
         */

        // int[][] score = new int[4][3];
        int[][] score = {
                {79, 80, 99}, //A학생
                {95, 85, 89}, //B학생
                {90, 65, 56}, //C학생
                {69, 78, 77}  //D학생
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

        /*
		 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
		 2. 각 과목의 평균을 출력해 보세요.
		 3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
		 */

        double totalAvg = 0.0; // 학생들의 평균점수의 총합.

        int idx = 0; // stuName 배열에서 학생 이름 꺼내올 용도로 선언.
        for (int[] stu : score) {
            int total = 0;
            for (int s : stu) {
                total += s;
            }
            double avg = (double)total / subName.length;
            totalAvg += avg;
            System.out.printf("%s의 평균: %.1f점\n", stuName[idx], avg);
            idx++;
        }

        System.out.println("==============================================");

        // 2번
        for (int i = 0; i < subName.length; i++) {
            int total = 0;
            for (int j = 0; j < stuName.length; j++) {
                total += score[j][i];
            }
            double avg = (double)total / stuName.length;
            System.out.printf("%s의 평균점수: %.1f점\n"
                    , subName[i], avg);
        }

        System.out.println("==============================================");

        // 3번
        double classAvg = totalAvg / stuName.length;
        System.out.printf("우리반 평균: %.1f점\n", classAvg);

    }

}











