package net.webservicex.www;

import net.webservicex.www.GeoIPServiceStub.GeoIP;
import net.webservicex.www.GeoIPServiceStub.GeoIPE;
import net.webservicex.www.GeoIPServiceStub.GetGeoIP;

public class GeoIPServiceClient {

	public static void main(String[] args) {
		
		try{
			GeoIPServiceStub stub = new GeoIPServiceStub();
			
			GetGeoIP getGeoIP3 = new GetGeoIP();
			getGeoIP3.setIPAddress("31.31.191.255");
			GeoIPE response = stub.getGeoIP(getGeoIP3);
			if(response!=null){
				GeoIP geo = response.getGeoIP();
				System.out.println(geo.getCountryName());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
