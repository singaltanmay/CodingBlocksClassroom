package July3.DynamicProgramming;

public class MazePath {

    public static void main(String[] args) {

    }

    private static int getPath(int cr, int cc, int er, int ec, String ans) {

        if (cr == er && cc == ec) {
            System.out.println(ans);
            return 1;
        } else if (cr > er || cc > ec) {
            return 0;
        } else {
            int hc = getPath(cr, cc + 1, er, ec, "V" + ans);
            int vc = getPath(cr + 1, cc, er, ec, "H" + ans);
            return hc + vc;
        }

    }
}
