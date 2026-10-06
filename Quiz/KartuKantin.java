package Quiz;

public class KartuKantin {
    private String identitas;
    private int saldo;
    private int jumlahTransaksi;
    
    public KartuKantin(String identitas){
        this.identitas = identitas;
        this.saldo = 0;
        this.jumlahTransaksi = 0;
    }

    public String getIdentitas(){
        return identitas;
    }

    public int getSaldo(){
        return saldo;
    }

    public int  getJumlahTransaksi(){
        return jumlahTransaksi;
    }

    public void topUp (int nominal){
        if (nominal <= 0){
            System.out.println("Ditolak : Nominal Top Up (" + nominal + ") tidak valid");
            return;
        }

        this.saldo += nominal;
        System.out.println("Berhasil : Top Up RP " + nominal + " pada kartu " + this.identitas);
    }

    public void bayar(int nominal){
        if (nominal <= 0) {
            System.out.println("Ditolak : Nominal pembayaran (" + nominal + ") tidak valid");
            return;
        }

        if (nominal > this.saldo) {
            System.out.println("Gagal : Saldo tidak mencukupi untuk pembayaran Rp" + nominal + " pada kartu " + this.identitas );
            return;
        }

        this.saldo -= nominal;
        this.jumlahTransaksi++;
        System.out.println("Berhasil : Pembayaran Rp" + nominal + " menggunakan kartu " + this.identitas );
    }

    public String getKategori() {
        if (this.saldo < 25000) {
            return "Rendah"; 
        } else if (this.saldo < 100000) {
            return "Sedang";
        } else {
            return "Tinggi";
        }
}
}