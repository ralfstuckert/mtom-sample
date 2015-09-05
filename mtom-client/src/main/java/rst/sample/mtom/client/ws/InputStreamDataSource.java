package rst.sample.mtom.client.ws;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataSource;

public class InputStreamDataSource implements DataSource {

	private InputStream input;
	private String name;
	
	public InputStreamDataSource(InputStream input, String name) {
		this.input = input;
		this.name = name;
	}

	@Override
	public String getContentType() {
		return "application/octet-stream";
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return input;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public OutputStream getOutputStream() throws IOException {
		return null;
	}

}
