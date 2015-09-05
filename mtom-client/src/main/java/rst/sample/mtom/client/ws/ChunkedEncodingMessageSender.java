/**
 * Copyright (c) 2014-2014 DVM-Deutsche Verrechnungsstelle Mittelstand GmbH
 * All rights reserved. The use of this program and the
 * accompanying materials are subject to license terms.
 */

package rst.sample.mtom.client.ws;

import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Extends {@link HttpUrlConnectionMessageSender} by using chunked encoding.
 */
public class ChunkedEncodingMessageSender extends HttpUrlConnectionMessageSender {
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.ws.transport.http.HttpUrlConnectionMessageSender#prepareConnection
	 * (java.net.HttpURLConnection)
	 */
	@Override
	protected void prepareConnection(final HttpURLConnection connection) throws IOException {
		super.prepareConnection(connection);
		connection.setChunkedStreamingMode(-1);
	}
}
