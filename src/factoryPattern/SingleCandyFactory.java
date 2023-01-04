package factoryPattern;

public class SingleCandyFactory {
    static Candy getCandy(String candyType){
        if(candyType.equalsIgnoreCase(String.valueOf(CandyType.HARD_CANDY))){
            return new  HardCandy();
        }
        if(candyType.equalsIgnoreCase(String.valueOf(CandyType.MINTY_CANDY))){
            return  new MintyCandy();
        }
        return  null;
    }
}
