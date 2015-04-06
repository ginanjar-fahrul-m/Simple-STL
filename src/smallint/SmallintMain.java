package smallint;

/**
 *
 * @author Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 */
public class SmallintMain {
    /**
     * 
     * @param args
     */
    public static void main(String[] args){
        try {
            Smallint s1;
            Smallint s2 = new Smallint(5);
            
            System.out.println(s2.add(new Smallint(8)));
        } catch (SmallintException sie){
            System.out.println(sie.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
