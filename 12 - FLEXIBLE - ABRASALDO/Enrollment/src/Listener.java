
public interface Listener {
	public boolean signup(String username, String name, String email, String password, String contactno, String birthday, String gender, String strand);
	public boolean signin(String username,String password);
	public void enroll();
	public void signedin(String usr);
	public void logout();
}
