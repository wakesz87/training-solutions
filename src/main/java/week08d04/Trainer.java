package week08d04;

public class Trainer {
    private CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;
    }

    public int giveMark() {
        return canMark.giveMark();
    }


    public static void main(String[] args) {
        Trainer happytrainer = new Trainer(new GoodMood());
        Trainer sadtrainer = new Trainer(new BadMood());
        System.out.println(happytrainer.giveMark());
        System.out.println(sadtrainer.giveMark());

    }
}