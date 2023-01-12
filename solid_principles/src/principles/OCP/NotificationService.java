package principles.OCP;

public interface NotificationService {
	
	public void sendOTP(String medium);
	public void sendTransactionNotification(String medium);

}
