package Trigger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File reportOutputDirectory = new File("C:\\Users\\shima\\workspace\\ParalleltestingCucumber\\target");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add("C:\\Users\\shima\\workspace\\ParalleltestingCucumber\\target\\cucumber-parallel\\1.json");
		jsonFiles.add("C:\\Users\\shima\\workspace\\ParalleltestingCucumber\\target\\cucumber-parallel\\2.json");
		//jsonFiles.add("C:\\Users\\shima\\workspace\\ParalleltestingCucumber\\target\\cucumber-parallel\\3.json");
		//jsonFiles.add("C:\\Users\\shima\\workspace\\ParalleltestingCucumber\\target\\cucumber-parallel\\4.json");
		//jsonFiles.add("C:\\Users\\shima\\workspace\\ParalleltestingCucumber\\target\\cucumber-parallel\\5.json");
		//jsonFiles.add("cucumber-report-2.json");

		String buildNumber = "1";
		String projectName = "Cucumber Default";
		boolean runWithJenkins = false;
		boolean parallelTesting = false;

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		// optional configuration
	    //configuration.setParallelTesting(parallelTesting);
		//configuration.setRunWithJenkins(runWithJenkins);
		//configuration.setBuildNumber(buildNumber);
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Firefox");
		configuration.addClassifications("Branch", "release/1.0");

		// optionally add metadata presented on main page via properties file
		//List<String> classificationFiles = new ArrayList<String>();
		//classificationFiles.add("C:\\Users\\shima\\workspace\\ParalleltestingCucumber\\properties-1.properties");
		//classificationFiles.add("properties-2.properties");
		//configuration.addClassificationFiles(classificationFiles);

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		Reportable result = reportBuilder.generateReports();
	}

}
