package framework.string;
import java.io.*;
import java.util.*;

public class stringDel {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        StringBuilder s=new StringBuilder(str);
        if(str.charAt(0)=='A'&&str.charAt(1)=='A')
        {
            s=s.deleteCharAt(0);
            s=s.deleteCharAt(0);
        }
        else if(str.charAt(0)=='A')
            s=s.deleteCharAt(0);
        else if(str.charAt(1)=='A')
            s=s.deleteCharAt(1);
        System.out.println(s.toString());
    }
}

