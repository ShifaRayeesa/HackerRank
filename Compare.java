import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int aCnt=0,bCnt=0;
        List<Integer> r=new ArrayList<>();
        for(int i=0;i<a.size();i++)
        {
            int aItem=a.get(i),bItem=b.get(i);
            if(aItem > bItem) aCnt++;
            else if(aItem < bItem) bCnt++;
        }
        r.add(aCnt);
        r.add(bCnt);
        return r;
    }
}

public class HackerRank {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
        List<Integer> result = Result1.compareTriplets(a, b);
        bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");
        bufferedReader.close();
        bufferedWriter.close();
    }
}
