package com.jdc.weekend.api.output;

public record DataModificationResult<T>(T id, String message) {

	public static <T> DataModificationResult<T> createResult(T id, String domainName, String fieldName){
		return new DataModificationResult<T>(id, "%s has been created with %s %s.".formatted(domainName, fieldName, id));
	}
	
	public static <T> DataModificationResult<T> updateResult(T id, String domainName, String fieldName){
		return new DataModificationResult<T>(id, "%s has been update with %s %s.".formatted(domainName, fieldName, id));
	}
	
}
