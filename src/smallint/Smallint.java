package smallint;


/**
 * Small integer class definition. Limited between MIN .. MAX.
 * 
 * @author Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 * @version 1.0
 * @since   2013-11-20
 * 
 */
public class Smallint {

    private static int MIN = 0;
    private static int MAX = 10;
    private int v;

    /**
     * Default constructor.
     */
    public Smallint() {
        v = MIN;
    }

    /**
     * Constructor.
     * 
     * @param i default value.
     * @throws SmallintException  
     */
    public Smallint(int i) throws SmallintException {
        v = this.rangeCheck(i);
    }
    
    /**
     * Copy Constructor.
     * 
     * @param s another Smallint.
     * @throws SmallintException  
     */
    public Smallint(Smallint s) throws SmallintException {
        this(s.getV());
    }

    /**
     * Get value.
     * 
     * @return Smallint current value.
     */
    public int getV() {
        return v;
    }

    /**
     * Set value.
     * 
     * @param v Smallint new value.
     */
    public void setV(int v) {
        this.v = v;
    }
    
    /**
     * Return valid range
     * 
     * @param i init value
     * @return i if range is valid, else
     * @throws SmallintException  
     */
    private int rangeCheck(int i) throws SmallintException {
        if(i < MIN){
            i = MIN;
            throw new SmallintException(SmallintExceptionCode.S_UNDERFLOW);
        } else if(i > MAX) {
            i = MAX;
            throw new SmallintException(SmallintExceptionCode.S_OVERFLOW);
        } else {
            return i;
        }
    }
    
    /**
     * Return Smallint + Smallint s
     * 
     * @param s Smallint
     * @return Smallint + Smallint s
     * @throws SmallintException  
     */
    public Smallint add(Smallint s) throws SmallintException {
        return new Smallint(v + s.getV());
    }
    
    /**
     * Return Smallint - Smallint s
     * 
     * @param s Smallint
     * @return Smallint - Smallint s
     * @throws SmallintException  
     */
    public Smallint substract(Smallint s) throws SmallintException {
        return new Smallint(v - s.getV());
    }
    
    /**
     * Return Smallint * Smallint s
     * 
     * @param s Smallint
     * @return Smallint * Smallint s
     * @throws SmallintException  
     */
    public Smallint multiple(Smallint s) throws SmallintException {
        return new Smallint(v * s.getV());
    }
    
    /**
     * Return Smallint / Smallint s
     * 
     * @param s Smallint
     * @return Smallint / Smallint s
     * @throws SmallintException  
     */
    public Smallint divide(Smallint s) throws SmallintException {
        return new Smallint(v / s.getV());
    }
    
    @Override
    public String toString(){
        return "" + getV();
    }
}
