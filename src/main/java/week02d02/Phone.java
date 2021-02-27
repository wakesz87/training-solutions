package week02d02;

public class Phone {
    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", 8);
        Phone phone1 = new Phone("Huawei", 16);
        System.out.println(phone.getType() + " , " + phone.mem);
        System.out.println(phone1.getType() + " , " + phone1.mem);

    }
}
