package com.traceability;

import java.io.File;
import java.io.IOException;

import org.hibernate.Session;

public class HHSUtility {

	/**
	 * This utility method will handle the type of java file, accordingly persist the details.
	 * @param file
	 * @param session
	 * @throws Exception
	 */
	public static void javaClassHandler(File file, Session session) throws Exception {
		if (file.getName().contains("Test")) {
			Class c = TestFiles.class;
			TestFiles obj = (TestFiles) c.newInstance();
			obj.setFilename(file.getName());
			obj.setFilepath(file.getCanonicalPath());
			session.saveOrUpdate(obj);
		} else if (file.getName().contains("ServiceImpl")) {
			Class c = Service.class;
			Service obj = (Service) c.newInstance();
			obj.setFilename(file.getName());
			obj.setFilepath(file.getCanonicalPath());
			session.saveOrUpdate(obj);
		} else if (file.getName().contains("Facade")) {
			Class c = Interface.class;
			Interface obj = (Interface) c.newInstance();
			obj.setFilename(file.getName());
			obj.setFilepath(file.getCanonicalPath());
			session.saveOrUpdate(obj);
		} else if (file.getName().contains("Controller")) {
			Class c = Controller.class;
			Controller obj = (Controller) c.newInstance();
			obj.setFilename(file.getName());
			obj.setFilepath(file.getCanonicalPath());
			session.saveOrUpdate(obj);
		} else if (file.getName().contains("DAO")) {
			Class c = DAO.class;
			DAO obj = (DAO) c.newInstance();
			obj.setFilename(file.getName());
			obj.setFilepath(file.getCanonicalPath());
			session.saveOrUpdate(obj);
		} else {
			Class c = Javafiles.class;
			Javafiles obj = (Javafiles) c.newInstance();
			obj.setFilename(file.getName());
			obj.setFilepath(file.getCanonicalPath());
			session.saveOrUpdate(obj);
		}
	}

	/**
	 * This method will Persist the JSP Details.
	 * @param file
	 * @param session
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public static void jspHandler(File file, Session session) throws Exception {
		Class c = JSPFile.class;
		JSPFile obj = (JSPFile) c.newInstance();
		obj.setFilename(file.getName());
		obj.setFilepath(file.getCanonicalPath());
		session.persist(obj);
	}

}
