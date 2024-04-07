package com.pluralsight.fundamentals.exception;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationNotFoundException  extends RuntimeException implements GraphQLError {

    private Map<String, Object> extensions = new HashMap<>();

    /*public ApplicationNotFoundException(String message) {
        super(message);
    }*/

    public ApplicationNotFoundException(String message, Long id) {
        super(message);
        extensions.put("invalideApplicationId", id);
    }

    public ApplicationNotFoundException(String message, String val) {
        super(message);
        extensions.put("invalideApplicationId", val);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return ErrorType.DataFetchingException;
    }
}
