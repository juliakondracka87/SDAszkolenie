package PraceDomowe.Strategia;

public class StrategiaTest {
    public static void main(String[] args) {
        Knight anna = new Knight("Anna", 20);
        Knight zbyszko = new Knight("Zbyszko", 40);
        Knight dobromil = new Knight("Dobromil", 70);
        KnightValidator oldValid = new OldKnightsValidator();
        KnightValidator nameValid = new MaleKnightsValidator();
        Arena elderArena = new Arena(oldValid);
        Arena malesArena = new Arena(nameValid);
        elderArena.addKnight(anna);
        elderArena.addKnight(zbyszko);
        elderArena.addKnight(dobromil);
        malesArena.addKnight(anna);
        malesArena.addKnight(zbyszko);
        malesArena.addKnight(dobromil);

        System.out.println("===Arena seniorów===");
        System.out.println(elderArena);
        System.out.println("===Arena bez równouprawnienia");
        System.out.println(malesArena);
    }
}
