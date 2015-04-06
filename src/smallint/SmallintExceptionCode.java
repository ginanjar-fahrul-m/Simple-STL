package smallint;

/**
 * SmallintExceptionCode
 * 
 * @author Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 * @version 1.0
 * @since   2013-11-20
 */
public enum SmallintExceptionCode implements ErrorCode {

    /**
     * Code if Smallint value is under-range
     */
    S_UNDERFLOW("Angka tidak boleh lebih kecil dari 0"),
    
    /**
     * Code if Smallint value is over-range
     */
    S_OVERFLOW("Angka tidak boleh lebih besar dari 10");
    
    private final String message;

    private SmallintExceptionCode(String message) {
        this.message = message;
    }

    /**
     * Return code message.
     * 
     * @return ExceptionCode Message
     */
    @Override
    public String getMessage() {
        return message;
    }
}
