package Tugas;

public class Main {
    public static void main(String[] args) {

        Dosen d1 = new Dosen();
        d1.setNama("Budi");
        d1.setSKS(10);

        Dosen d2 = new Dosen();
        d2.setNama("Erina");
        d2.setSKS(12);
        
        Pegawai p1 = new Pegawai();
        p1.setNama("Faris");

        Pegawai p2 = new Pegawai();
        p2.setNama("Irul");
        
        DaftarGaji dg = new DaftarGaji(10);
        dg.addPegawai(d1);
        dg.addPegawai(d2);
        dg.addPegawai(p1);
        dg.addPegawai(p2);
        dg.printSemuaGaji();
    } 
}
