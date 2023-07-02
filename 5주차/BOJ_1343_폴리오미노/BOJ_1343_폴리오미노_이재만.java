import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine().replace("XXXX", "AAAA").replace("XX", "BB");       // XXXX 는 AAAA 로, XX 는 BB 로 변환
        System.out.println(board.contains("X") ? -1 : board);                           // X 가 남았다면 -1, 그렇지 않으면 변환된 보드판 출력
    }
}
