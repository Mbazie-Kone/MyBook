package com.mbaziekone.mybook.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.mbaziekone.mybook.model.Product;
import com.mbaziekone.mybook.model.ProductCategory;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer{
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		
		HttpMethod[] theUnsupportedMethodActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
		
		// Disable HTTP methods for product: PUT, POST and DELETE
				config.getExposureConfiguration()
					.forDomainType(Product.class)
					.withItemExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedMethodActions))
					.withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedMethodActions));
				
				// Disable HTTP methods for productCategory: PUT, POST and DELETE
						config.getExposureConfiguration()
							.forDomainType(ProductCategory.class)
							.withItemExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedMethodActions))
							.withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedMethodActions));
		

		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
	}
}
