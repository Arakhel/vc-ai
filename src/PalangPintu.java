import java.lang.reflect.Array;

public class PalangPintu {
    private String orang[][];
    private int baris = 1;
    private int kolom = 10;

    public PalangPintu() {
        orang = new String[baris][kolom];
        for (int i = 0; i < baris ; i++) {
            for (int j = 0; j < kolom; j++) {
                orang[i][j]= " ";
            }
        }

        orang[0][0] = "p";
        orang[0][2] = "p";
        orang[0][3] = "p";
        orang[0][7] = "p";
        orang[0][9] = "p";
    }

    public String toString(){
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < baris; i++) {

            for (int j = 0; j < kolom; j++) {
                r.append("[").append(orang[i][j]).append("]");
            }
            r.append("\n");
        }
        return r.toString();
    }

    private int CountPeople() {
        int count = 0;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (orang[i][j].equals("p")) {
                    count++;
                }
            }
        }
        // System.out.println("the found dirt " + count+" dirts");
        return count;
    }

    private void Move(){
//        while (CountPeople() > 0){
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    if(orang[i][j].equals("p")){
                        buka();
                    }
                    else {
                        tutup();
                    }
                }
            }
//        }
    }

    private void buka(){
        System.out.println("Buka Pintu ada orang");
    }

    private void tutup(){
        System.out.println("Tutup Pintu baru gak ada orang");
    }

    public static void main(String[] args) {
        PalangPintu palang = new PalangPintu();
        System.out.println("Ceritanya pintu otomatis mall");
        System.out.println(palang.toString());
        palang.Move();
        System.out.println("Sudah gak ada orang Bang");
    }
}
