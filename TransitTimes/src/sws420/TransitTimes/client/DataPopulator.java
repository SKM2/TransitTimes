package sws420.TransitTimes.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;



public class DataPopulator 
{
Scanner sc;
HashMap<String, Route> route = new HashMap<String, Route>();
	 File routestxt;
	
	public void run() {
		
		try {
            routestxt = new File("routes.txt");
            sc = new Scanner(routestxt);
            getRoute(route);
        } catch (FileNotFoundException e) {
            System.out.println(routestxt + " file was not found.");
            e.printStackTrace();
        }
		

		// TODO Auto-generated method stub
		
	}

	
	
	public void getRoute(HashMap<String, Route> route) {
        String sLine;
        sLine = sc.nextLine();
        while (sc.hasNext()) {
            sLine = sc.nextLine();
            String[] extractNames = sLine.split(",");
            Route r = new Route(extractNames[2], extractNames[0]);
            if (route.containsKey(extractNames[0]) == false) {
                route.put(extractNames[0], r);
            }
        }
    }
}
