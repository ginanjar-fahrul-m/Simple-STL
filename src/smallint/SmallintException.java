package smallint;

/**
 * SmallintException
 * 
 * @author Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 * @version 1.0
 * @since   2013-11-20
 * 
 */
public class SmallintException extends Exception {

    private ErrorCode errorCode;

    /**
     * Initialize Exception with an ErrorCode
     * 
     * @param errorCode
     */
    public SmallintException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage(){
        return getErrorCode().getMessage();
    }
    
    /**
     * Get Exception ErrorCode
     * 
     * @return ErrorCode
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
