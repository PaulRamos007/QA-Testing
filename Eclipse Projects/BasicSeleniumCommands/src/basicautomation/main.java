package basicautomation;

public class main {

	public static void main(String[] args) {
		
		BasicCommands bsc = new BasicCommands();
		
		bsc.invokeBrowser();
		bsc.verifyPageTitle();
		bsc.navigateCommands();
		bsc.closeBrowser();

	}

}
