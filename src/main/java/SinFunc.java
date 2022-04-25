public class SinFunc implements IFuncOnSegment{

    private final double koefA;
    private final double koefB;
    private final double beginOfSegment;
    private final double endOfSegment;

    public SinFunc(double koefA, double koefB, double beginOfSegment, double endOfSegment){
        this.koefA = koefA;
        this.koefB = koefB;
        if(beginOfSegment > endOfSegment){
            this.beginOfSegment = endOfSegment;
            this.endOfSegment = beginOfSegment;
        }else {
            this.beginOfSegment = beginOfSegment;
            this.endOfSegment = endOfSegment;
        }
    }

    @Override
    public double getValue(double x) {
        if(x < beginOfSegment || x > endOfSegment){
            throw new IllegalArgumentException("x not in segment");
        }
        return koefA * Math.sin(koefB * x);
    }

    @Override
    public double getBeginOfSegment() {
        return beginOfSegment;
    }

    @Override
    public double getEndOfSegment() {
        return endOfSegment;
    }
}