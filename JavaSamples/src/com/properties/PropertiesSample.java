package com.properties;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesSample {
	public static void createProperties(String name) throws IOException
	{
		Properties prop=new Properties();
		OutputStream os=new FileOutputStream(name);
		
		prop.setProperty("name", "darlo");
		prop.setProperty("env", "QA");
		prop.setProperty("url","qa.com");
		prop.store(os, "Created properties file");
		System.out.println("Creation done in  "+System.getProperty("user.dir"));
	}
	public static void readProperties(String name) throws IOException
	{	
		Properties prop=new Properties();
		InputStream is=new FileInputStream(name);
		prop.load(is);
		System.out.println("Name : "+prop.getProperty("name"));
		System.out.println("Environment : "+prop.getProperty("env"));
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name="default.properties";
		createProperties(name);
		readProperties(name);
	}

}
