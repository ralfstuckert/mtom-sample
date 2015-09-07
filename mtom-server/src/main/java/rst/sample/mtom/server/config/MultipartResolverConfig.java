/**
 * Copyright (c) 2014-2015 DVM-Deutsche Verrechnungsstelle Mittelstand GmbH
 * All rights reserved. The use of this program and the
 * accompanying materials are subject to license terms.
 */

package rst.sample.mtom.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * Provides the MultipartResolver beans necessary to use multipart requests/responses.
 */
@Configuration
public class MultipartResolverConfig {

	@Bean
	public CommonsMultipartResolver multipartResolver() {
		return new CommonsMultipartResolver();
	}

	@Bean
	public CommonsMultipartResolver filterMultipartResolver() {
		final CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		return resolver;
	}


}
