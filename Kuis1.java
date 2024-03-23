public class Kuis1 {

    public static void main(String[] args) {

    boolean a = true;
    boolean c = true;
    boolean b = false;
    boolean d = false;
    boolean e = false;
    boolean f = false;
    boolean g = false;
    boolean h = false;
    boolean i = false;
    boolean j = false;
    boolean k = false;

    boolean[][] ruleKuis = new boolean[][] {
        {a, b, c},
        {c, d},
        {a, e, f},
        {a, g},
        {f, g ,d},
        {g, e, h},
        {c, h, i},
        {i, a, j},
        {g, j},
        {j, k}
    };

    for (int x = 0; x < ruleKuis.length; x++) {
        boolean kondisiTerpenuhi = true;

        for (int y = 0; y < ruleKuis[x].length; y++) {
            if (!ruleKuis[x][y]) {
                kondisiTerpenuhi = false;
                break;
            }
        }

        if (kondisiTerpenuhi) {
            k = true;
            break;
        }
    }

    if (k) {
        System.out.println(" k bernilai benar");
    } else {
        System.out.println(" k bernilai salah");
    }
}
}

