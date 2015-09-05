package rst.sample.mtom.server.endpoint;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import rst.sample.mtom.jaxb.Document;
import rst.sample.mtom.jaxb.StoreDocumentRequest;
import rst.sample.mtom.jaxb.StoreDocumentResponse;

@Endpoint
public class DocumentEndpoint {

	private static final String NAMESPACE_URI = "https://github.com/ralfstuckert/mtom";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "storeDocumentRequest")
	@ResponsePayload
	public StoreDocumentResponse storeDocument(
			@RequestPayload StoreDocumentRequest request) throws IOException {
		Document document = request.getDocument();
		try (InputStream in = document.getContent().getInputStream()) {
			long counter = 0;
			while (in.read() != -1) {
				++counter;
			}
			System.out.println(String.format("received %d bytes", counter));
		}
		StoreDocumentResponse response = new StoreDocumentResponse();
		response.setSuccess(true);
		return response;
	}

}
