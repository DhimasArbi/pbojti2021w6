package percobaan2;

public class ClassB extends ClassA{
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void setSuperX(int x) {
        super.setX(x);
    }

    public void setSuperY(int y) {
        super.setY(y);
    }

    public void getNilaiZ(){
        System.out.println("nilai z:"+z);
    }
    public void getJumlah(){
        System.out.println("jumlah:"+(x+y+z));
    }
}
