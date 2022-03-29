import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int temp;
        char[] arr=new char[s.length()];

        for(int i=0;i<s.length();i++)
        {
            arr[i] = s.charAt(i);
        }
        if(arr[8]=='P')
        {
            temp=(((int)arr[0])*10 + ((int)arr[1])+12);
            System.out.println(temp);
            arr[0]=(char) ((temp/10)+48);
            arr[1]=(char) ((temp%10)+48);
        }
        else
        {
            if(arr[0]=='1' && arr[1]=='2')
            {
                arr[0]='0';
                arr[1]='0';
            }
        }
        char[] a=new char[s.length()-2];

        for(int i=0;i<a.length;i++)
        {
            a[i]=arr[i];
        }
        String str=String.copyValueOf(a);
        return str;
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
