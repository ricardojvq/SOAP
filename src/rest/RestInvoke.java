package rest;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
public class RestInvoke {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		HttpGet getRequest = new HttpGet("http://api.chartlyrics.com/apiv1.asmx/SearchLyricDirect?artist=eric%20clapton&song=layla");
		

	}
}
