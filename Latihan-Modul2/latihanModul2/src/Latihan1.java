import java.util.ArrayList;

public class Latihan1 {
    public static void main(String[] args) {
        //Membuat Objek Arraylist "Hewan"
        ArrayList<String> hewan = new ArrayList<>();

        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        System.out.println("Hewan : "+hewan);

        //Membuat objek Arraylist "DeleteHewan"
        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("kambing");
        deleteHewan.add("Unta");

        //Pengecekan Hewan dengan data Warna
        for (int i=0; i < hewan.size(); i++){
            String temp = hewan.get(i);
            for (int j=0; j < deleteHewan.size(); j++){
                String Warna = deleteHewan.get(j);
                if (temp.equals(Warna)){
                    hewan.remove(Warna);
                    i--; //nilai variabel akan dikurangi sebesar 1
                }
            }
        }
        System.out.println("Hewan yang dihapus : "+deleteHewan);
        System.out.println("Output Hewan : "+hewan);

    }
}