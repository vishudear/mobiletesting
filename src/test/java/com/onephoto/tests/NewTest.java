package com.onephoto.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.standalone.SelendroidConfiguration;
import io.selendroid.standalone.SelendroidLauncher;

public class NewTest {
  
	public SelendroidDriver driver;
	
  @Test
  public void f() {
	  System.out.println("In test method");
  }
  @BeforeClass
  public void beforeClass() throws Exception{
	  
	  
//	  SelendroidConfiguration config = new SelendroidConfiguration();
//		config.addSupportedApp("src/main/resources/selendroid-test-app-0.11.0.apk");
//		selendroidServer = new SelendroidLauncher(config);
//		selendroidServer.launchSelendroid();
	  
	  
//	  3.1.3. Switching Context
//
//	  As described above, Selendroid can automate native and hybrid apps and the mobile web. When a Selendroid test session is started, the native mode is activated by default.
//
//	  Available contexts can be retrieved via:
//
//	  selendroidDriver.getContextHandles();
//	  When a webview is available, above method will return a "WEBVIEW" context handle.
//
//	  String contextHandleName="WEBVIEW";
//	  selendroidDriver.context(contextHandleName);
//	  When a context switch is done, all WebDriver commands are redirected to the corresponding context.
	  
	  SelendroidCapabilities caps =  new SelendroidCapabilities("com.one.gallery.main:1.5.22");
		 
	  driver = new SelendroidDriver(caps);
	  System.out.println("TESTING123");
	  Thread.sleep(5000);
		    
	  //Specify app Package or app ID
	  //capa.setAut("io.selendroid.testapp:0.17.0");
	  

	  
	  //Specify to use Android device API 19
	  //capa.setPlatformVersion(DeviceTargetPlatform.ANDROID10);
	  //capa.setEmulator(true);
	  
	  //driver = new SelendroidDriver(capa);
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Closing driver");
	  driver.quit();
  }

}
