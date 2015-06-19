package app;

import java.net.SocketException;

import javax.jws.WebService;
import javax.xml.ws.WebServiceException;

import com.chartlyrics.api.Apiv1;
import com.chartlyrics.api.Apiv1Soap;
import com.chartlyrics.api.GetLyricResult;
import com.chartlyrics.api.SearchLyricResult;

@WebService
public class SearchLyrics {

	public static void main(String[] args) {
		while (true) {
			try {
				Apiv1 service;
				Apiv1Soap soap;


				service = new Apiv1();
				soap = service.getApiv1Soap();
				String autor = "Cake";
				String music = "Daria";
				GetLyricResult result = soap.searchLyricDirect(autor, music);
				System.out.println(result.getLyric());
				break;
			} catch (Exception se) {

			}
		}

	}

}
