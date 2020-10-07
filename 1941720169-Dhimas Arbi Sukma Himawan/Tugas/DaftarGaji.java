package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawai = 0;
    
    public DaftarGaji(int jumlahPegawai){
        listPegawai = new Pegawai[jumlahPegawai];
    }
    
    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawai] = p;
        jumlahPegawai++;
    }
    
    public void printSemuaGaji(){
        for (int i=0;i<jumlahPegawai;i++){
            System.out.print(listPegawai[i].getNama()+" mendapatkan gaji ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
