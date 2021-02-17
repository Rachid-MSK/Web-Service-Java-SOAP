import javax.xml.ws.Endpoint;

import ws.BanqueService;

// classe pour deployer un web service dans un serveur JaxWS.
public class ServerJaxWS {

	public static void main(String[] args) {
		String url= "http://0.0.0.0:8686/";
		Endpoint.publish(url, new BanqueService());
		System.out.println("web service deployer sur:"+url);
	}

}
