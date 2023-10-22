package com.app.runner;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleOmne {
	// broken link count
	public static void main(String[] args) {
		/*WebDriver driver = new ChromeDriver();
		List<WebElement> listFind = driver.findElements(By.tagName("a"));
		for (WebElement x : listFind) {
			String link = x.getAttribute("href");
			System.out.println(link);
			int count =0;
			try {
				URL url = new URL(link);
				URLConnection urlConnection = url.openConnection();
				HttpURLConnection http=(HttpURLConnection)urlConnection;
				http.connect();
				//200 status success 400 series error 
				int response = http.getResponseCode();
				if(response>=400) {
					count++;
				}else if(response==200) {
					count ++;
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(count);
		}*/
		
		/*int a [] = {1,5,2,2};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}	
		}
		System.out.println(Arrays.toString(a));
		// to print duplicate value
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
		*/
		
		/*int a [] = {3,4,5,6};
		int b [] = new int [a.length];
		for (int i = 0; i < a.length; i++) {
			b[i]= a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));*/
		
		/*int a [] = {3,4,5,6};
		for (int i = 1; i < a.length; i=i+2) {
			System.out.println(a[i]);
		}*/
		
		/*int a [] = {3,4,5,6};
		for (int i = 0; i < a.length; i=i+2) {
			System.out.println(a[i]);
		}*/
		
		/*int a [] = {3,4,5,6};
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);*/
		/*int a [] = {3,4,5,6};
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);*/	
		
	}

}
