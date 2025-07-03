import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int a = Integer.parseInt(br.readLine());
    String[] temp = br.readLine().split("");
  
    int b = Integer.parseInt(temp[2]);
    int c = Integer.parseInt(temp[1]);
    int d = Integer.parseInt(temp[0]);

    bw.write(a * b + "\n");
    bw.write(a * c + "\n");
    bw.write(a * d + "\n");

    bw.write(a*b + a*c*10 + a*d*100+ "");
    bw.flush();
  }
  
}
