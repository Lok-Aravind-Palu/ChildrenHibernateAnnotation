package com.apptrics.AnnotationSample.ChildrenAnnotaction;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
		HibernateUtil hu = new HibernateUtil();
		
		System.out.println("Enter the Option you want to operate");
		System.out.println(
				" 1:Insert Values\n 2: Update Details\n 3:Read From Table\n 4:Read Table\n 5:Delete From Table\n 6:Delete Table\n 7:Close Connection");

		for (;;) {
			switch (s.nextInt()) {
			case 1:
				HibernateConfiguration.insertValues();
				break;
			case 2:
				HibernateConfiguration.readValues();
				break;

			default:
				System.exit(0);
			}
		}
    }
}
