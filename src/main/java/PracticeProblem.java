//public class  {
    public class PracticeProblem {
    //import 
    //import array
    static int[] arr;
    static boolean[] insequence = new boolean[1000000];

    static int recamanNum(int n) {
        if (n == 0) {
            return 0;
        }
        //int p = reacmannum
        int p = recamanNum(n - 1);
        if (p - n > 0 && !insequence[p - n]) {
            arr[n - 1] = p - n;
            insequence[p - n] = true;
            return p - n;
        } else {
            //insqeence
            insequence[p + n] = true;
            arr[n - 1] = p + n;
            return p + n;
        }
    }
// staucitic
    static int[] recaman(int n) {
        if (n < 0) {
            return new int[0];
        }

        arr = new int[n];
        
        recamanNum(n);
        insequence = new boolean[99999999];
        return arr;
    }
}

//println