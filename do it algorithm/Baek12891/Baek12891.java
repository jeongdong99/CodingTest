import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek12891 {
    static int[] leastNeed = new int[4]; // 'A' 'C' 'G' 'T'
    static int[] myAlpha = new int[4]; // 'A' 'C' 'G' 'T'
    static int satisfied = 0; // 'A' 'C' 'G' 'T'가 만족한 갯수
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int StringLen = Integer.parseInt(st.nextToken());
        int subStringLen = Integer.parseInt(st.nextToken());
        int cnt = 0;

        char [] myString = bf.readLine().toCharArray(); // 문자열 배열로 저장
        st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < 4; i++){
            leastNeed[i] = Integer.parseInt(st.nextToken()); // [0] : A [1] : C [2] : G [3] : T 최소 개수 저장
            if(leastNeed[i] == 0) {satisfied++;}
        }

        for(int i=0; i < subStringLen; i++){ // 초기값 넣기
            Add(myString[i]);
        }
        if(satisfied == 4) {cnt++;} // 초기값이 만족하는지 확인


        for(int i = subStringLen, j=0; i < StringLen; i++,j++){ // 슬라이딩 윈도우
            Add(myString[i]);
            Remove(myString[j]);
            if(satisfied == 4){cnt++;}
        }
        System.out.println(cnt);
        bf.close();

    }
    public static void Add(char c){
        switch (c){
            case 'A' : myAlpha[0]++;
                if(myAlpha[0] == leastNeed[0]){satisfied++;}
                break;
            case 'C' : myAlpha[1]++;
                if(myAlpha[1] == leastNeed[1]){satisfied++;}
                break;
            case 'G' :  myAlpha[2]++;
                if(myAlpha[2] == leastNeed[2]){satisfied++;}
                break;
            case 'T' : myAlpha[3]++;
                if(myAlpha[3] == leastNeed[3]){satisfied++;}
                break;
        }
    }
    public static void Remove(char c){
        switch (c){
            case 'A' :
                if(myAlpha[0] == leastNeed[0]){satisfied--;}
                myAlpha[0]--;
                break;
            case 'C' :
                if(myAlpha[1] == leastNeed[1]){satisfied--;}
                myAlpha[1]--;
                break;
            case 'G' :
                if(myAlpha[2] == leastNeed[2]){satisfied--;}
                myAlpha[2]--;
                break;
            case 'T' :
                if(myAlpha[3] == leastNeed[3]){satisfied--;}
                myAlpha[3]--;
                break;
        }
    }
}
