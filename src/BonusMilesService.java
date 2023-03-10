public class BonusMilesService {
    public int calculate(int cost) {
        int price = 10_000;
        cost = price / 20;
        System.out.println(cost);
        return cost;
    }
}
