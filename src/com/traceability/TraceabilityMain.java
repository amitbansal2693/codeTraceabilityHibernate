package com.traceability;

import java.io.File;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TraceabilityMain {
	public static void main(String[] args) throws Exception {

		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		List<File> files = null;
		try {
			Transaction t = session.beginTransaction();
			files = FetchFiles.fetchAllFiles();

			for (File file : files) {
				if(file.getName().toLowerCase().contains(".java")){
					HHSUtility.javaClassHandler(file, session);
				}
				else if(file.getName().toLowerCase().contains(".jsp")){
					HHSUtility.jspHandler(file, session);
				}
			}
			t.commit();
		} finally {
			System.out.println("Session Closed...!!!");
			session.close();
		}

	}
}
