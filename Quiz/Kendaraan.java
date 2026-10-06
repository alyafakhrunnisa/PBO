package Quiz;

public class Kendaraan {
    private String identitas;
    private String jenis;
    private boolean isParkir;
    private int jamMasuk;

    public Kendaraan(String identitas, String jenis){
        this.identitas = identitas;
        this.jenis = jenis;
        this.isParkir = false;
        this.jamMasuk = -1;
    }

    public String getIdentitas(){
        return identitas;
    }

    public boolean getIsParkir(){
        return isParkir;
    }

    public void masuk(int jam){
        if (this.isParkir){
            System.out.println("Ditolak : Kendaraan " + this.identitas + " masih berada di area parkir");
            return ;
        }

        if (jam < 0 || jam > 23){
            System.out.println("Ditolak : Jam Masuk (" + jam + ") tidak valid. Harus 0-23");
            return;
        }

        this.jamMasuk = jam;
        this.isParkir = true;
        System.out.println("Berhasil : Kendaraan " + this.identitas + " masuk pada jam " + jam );
    }

    public void keluar(int jam){
        if (!this.isParkir){
            System.out.println("Ditolak : Kendaraan " + this.identitas + " belum masuk area parkir ");
            return;
        }
        if (jam < 0 || jam > 23) {
            System.out.println("Ditolak Jam keluar (" + jam + ") tidak valid. Harus 0-23 ");
            return;
        }
        if (jam < this.jamMasuk) {
            System.out.println("Ditolak: Jam keluar (" + jam + ") lebih kecil dari jam masuk (" + this.jamMasuk + ")");
            return;
        }

        int durasi = jam - this.jamMasuk;
        int biaya = 0;

        if (durasi == 0 || durasi <= 2){
            biaya = 3000;
        } else{
            biaya = 3000 + ((durasi - 2 ) * 2000);
        }

        this.isParkir = false;
        this.jamMasuk = -1;
        System.out.println("Berhasil : Kendaraan " + this.identitas + " keluar. Durasi: " + durasi + " jam. Biaya: Rp" + biaya);

    }
}
