package Reusable;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
public class commonFramework {
	//static WebDriver driver = BrowserFactory.getBrowser();
	public static WebDriver driver;
	static Integer controller = 0;
	public static String msg ;

	public static void Reporting(String ReportPath)
	{
		//ReportPath = "C:\\Users\\pratekug\\eclipse-workspace\\FlexcubeReportingV2\\target\\cucumber-reports\\report.html";
		File sourcePath = new File (ReportPath);
		Date date = new Date();
		long ds = date.getTime();
		Timestamp ts = new Timestamp(ds);
		System.out.println(ts);
		String ts1 = ts.toString().replaceAll(":","").replaceAll("\\.","").replaceAll(" ","_");
		System.out.println(ts1);
		String Path = "D:\\seleniumresult\\REPORTS_EXTENT\\" + System.getProperty("user.name");
		Path path = Paths.get(Path);

		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
				File destinationPath = new File(Path +"\\"+ "report" +"_"+ ts1 + ".html");
				FileUtils.copyFile(sourcePath, destinationPath);  
			} catch (IOException e) {
				//fail to create directory
				e.printStackTrace();
			}


		}else
		{
			File destinationPath = new File(Path +"\\"+ "report" +"_"+ ts1 + ".html");
			try {
				FileUtils.copyFile(sourcePath, destinationPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}
	}


	public static void ReportingTwo(String target)
	{
		try {
			Class<?> cls = Class.forName("Trigger.TEST");
			Method meth = cls.getMethod("main", String[].class);
		    String[] params = null; // init params accordingly
		    meth.invoke(null, (Object) params); // static method doesn't have an instance

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File sourceLocation = new File(target);
		//File sourcePath_one = new File(target+ "\\cucumber-html-reports");
		//File sourcePath_two = new File(target + "\\html-report");

		Date date = new Date();
		long ds = date.getTime();
		Timestamp ts = new Timestamp(ds);
		System.out.println(ts);
		String ts1 = ts.toString().replaceAll(":","").replaceAll("\\.","").replaceAll(" ","_");
		System.out.println(ts1);
		String Path = "D:\\seleniumresult\\REPORTS_CUCUMBER\\" + System.getProperty("user.name");
		Path path = Paths.get(Path);
		Path path1 = Paths.get(Path + "\\"+ts1 );
		String[] children = sourceLocation.list();
	


		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
				Files.createDirectories(path1);
				//File path_copy = new File(Path + "\\"+ts1 );
				// File destinationPath = new File(Path +"\\"+ "report" +"_"+ ts1 + ".html");
				//Files.copy(sourcePath1, path);
				//Files.copy(sourcePath2, path);
				for (int i=0; i<children.length; i++) {
					System.out.println(children[i]);
					if(children[i].contentEquals("cucumber-html-reports") || children[i].contentEquals("html-report") )
					{
						String targetlocation = Path + "\\"+ts1 + "\\" + children[i].toString();
						File target_location = new File(targetlocation);
						Path p = Paths.get(targetlocation);
						if (!Files.exists(p)) {
							try {
								Files.createDirectories(p);
								File source_location = new File(sourceLocation + "\\"+ children[i]);
								FileUtils.copyDirectory(source_location,target_location);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} 
						}
					}

				}

				
				//FileUtils.copyDirectory(sourcePath_one, path_copy);
				//FileUtils.copyDirectory(sourcePath_two, path_copy);

			} catch (IOException e) {
				//fail to create directory
				e.printStackTrace();
			}


		}else
		{
			try {
				Files.createDirectories(path1);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//File path_copy = new File(Path + "\\"+ts1 );
			// File destinationPath = new File(Path +"\\"+ "report" +"_"+ ts1 + ".html");
			//Files.copy(sourcePath1, path);
			//Files.copy(sourcePath2, path);
			for (int i=0; i<children.length; i++) {
				System.out.println(children[i]);
				if(children[i].contentEquals("cucumber-html-reports") || children[i].contentEquals("html-report") )
				{
					String targetlocation = Path + "\\"+ts1 + "\\" + children[i].toString();
					File target_location = new File(targetlocation);
					Path p = Paths.get(targetlocation);
					if (!Files.exists(p)) {
						try {
							Files.createDirectories(p);
							File source_location = new File(sourceLocation + "\\"+ children[i]);
							FileUtils.copyDirectory(source_location,target_location);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
					}
				}

			}

			
			//FileUtils.copyDirectory(sourcePath_one, path_copy);
			//FileUtils.copyDirectory(sourcePath_two, path_copy)
 
		}
	}

}	

