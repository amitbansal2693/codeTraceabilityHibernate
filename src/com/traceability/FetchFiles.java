package com.traceability;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FetchFiles {
	public static List<File> fetchAllFiles() throws IOException {

		File dir = new File("A:\\Release_2\\FestivalPortalR2_Participant");
		String[] extensions = new String[] { "java", "jsp" };
		System.out.println("Getting all files in " + dir.getCanonicalPath() + " including those in subdirectories");
		List<File> files = (List<File>) FileUtils.listFiles(dir, extensions, true);
		return files;
	}

	public static void aim() throws IOException {
		File dir = new File("A:\\Release_2\\FestivalPortalR2_Participant");
		String[] extensions = new String[] { "java", "jsp" };
		System.out.println("Getting all files in " + dir.getCanonicalPath() + " including those in subdirectories");
		List<File> files = (List<File>) FileUtils.listFiles(dir, extensions, true);
		for (File file : files) {
			System.out.println(file.getName() + " ");

		}
	}

	public static void main(String[] a) throws ClassNotFoundException, IOException {
		File file = new File(
				"A:\\Release_2\\FestivalPortalR2_Participant\\src\\com\\accenture\\adf\\businesstier\\controller\\EventController.java");
		String name=getClassNameFromFile(
				"A:\\Release_2\\FestivalPortalR2_Participant\\src\\com\\accenture\\adf\\businesstier\\controller\\EventController.java");
Class c1=null;
		try {
			c1 = Class.forName(name);
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
		System.out.println(c1.getName());

		// Class
		// file1=FileUtils.getFile("A:\\Release_2\\FestivalPortalR2_Participant\\src\\com\\accenture\\adf\\businesstier\\controller\\EventController.java").getClass();
		// Class
		// file2=FileUtils.class.forName("A:.Release_2.FestivalPortalR2_Participant.src.com.accenture.adf.businesstier.controller.EventController.java");
		// System.out.println(file2.getClass());

		// FileUtils.class
		// System.out.println(s);
		// System.out.println(c.getName());
		/*
		 * Method[] method=file.getClass().getMethods(); for(Method m:method)
		 * System.out.println(m.getName());
		 */
	}

	private static String getClassNameFromFile(String fileName) {
		String className = null;
		if (fileName != null && !fileName.trim().equals("") && fileName.trim().indexOf("com") > 0) {
			fileName = fileName.replace("\\", ".");
			className = "com." + fileName.split("\\.com\\.")[1];
			// className = className.replace("\\", ".");
		}
		if (className != null && className.startsWith(".")) {
			className = className.substring(1);
		}
		if (className != null && className.endsWith(".java")) {
			className = className.substring(0, className.length() - 5);
		}
		return className;
	}

}
