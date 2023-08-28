import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] score = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();        // 입력
        double mx = Arrays.stream(score).max().getAsDouble();                                                       // 최대값
        System.out.println(Arrays.stream(score).map(x -> x / mx * 100).sum() / N);                                  // 문제 조건대로 새로운 점수를 구해 평균을 구함
    }
}
