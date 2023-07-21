package algorithm.strsearch;

public class BrutePos {
    static int bfMatch(String txt, String pat){
        int pt = 0;
        int pp = 0;

        while(pt!=txt.length() && pp!=pat.length()){
            if(txt.charAt(pt) == pat.charAt(pp)){
                pt++;
                pp++;
            }
            else{
                pt = pt-pp+1;
                pp = 0;
            }
        }
        if(pp == pat.length()){
            return pt-pp;
        }
        return -1;
    }
    public static void main(String[] args) {
        String A = "ABABCDEFGHA";

        String B = "ABC";


        System.out.println("위치 = " + (bfMatch(A, B)+1));
        System.out.println(A.substring(bfMatch(A, B), (bfMatch(A,B))+B.length()));


    }
}
