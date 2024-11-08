package testscripts;

public class BrowserCommands extends Base {

	public void browserCommands()
	{
	String url=	driver.getCurrentUrl();
	System.out.println(url);
	String title=driver.getTitle();
	System.out.println(title);
	}
	public void navigationCommands()
	{
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserCommands browsercommands =new BrowserCommands();
browsercommands.intialiseBrowser();
browsercommands.browserCommands();
browsercommands.navigationCommands();
browsercommands.driverQuit();
	}

}
