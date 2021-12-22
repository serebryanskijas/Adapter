public class Adapter {
    public static void main(String[] args) {
Well well = new DugWell();
well.makeEcho("Hi");
        System.out.println("Water "+well.getWater());
        well = new WellWithBucket();
        well.makeEcho("Bue");
        System.out.println("Count water "+well.getWater());
    }
}

class WellAndBucket {
    // шаблон Адаптер

}
interface Well{
    public double getWater();
    public void makeEcho(String call);
}
class DugWell implements Well{
    private double water = 1000.0;

    @Override
    public double getWater() {
        return 0;
    }

    @Override
    public void makeEcho(String call) {
        System.out.println(call + " - " + call + " - " + call);
    }
}
class Bucket {
    public double capacity = 10.0;
    public void fill(){
        System.out.println("Filling the bucket with water");
    }
    public void emptying(){
        System.out.println("Pouring water");
    }
}
class WellWithBucket implements Well{
    private Bucket bucket = new Bucket();

    @Override
    public double getWater() {
        bucket.fill();
        bucket.emptying();
        return bucket.capacity;
    }

    @Override
    public void makeEcho(String call) {
        System.out.println(call + " - " + call + " - " + call);
    }
}