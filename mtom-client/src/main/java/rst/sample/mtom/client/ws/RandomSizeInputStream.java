package rst.sample.mtom.client.ws;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class RandomSizeInputStream extends InputStream {

	private int count;
	final Random random;
	
	public RandomSizeInputStream(int size) {
		this.count = size;
		random = new Random();
	}



	@Override
	public int read() throws IOException {
		while (count-- > 0) {
			return random.nextInt(255);
		}
		return -1;
	}

}
