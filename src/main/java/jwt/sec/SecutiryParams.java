package jwt.sec;

public class SecutiryParams {
	public static final String SECRET = "secret1";
	public static final long EXPIRATION_TIME = 864_000_000; // 10 days
	public static final String HEADER_PRIFIX = "Bearer";
	public static final String HEADER_NAME = "Authorization";
}
