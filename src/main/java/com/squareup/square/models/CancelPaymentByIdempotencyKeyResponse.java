package com.squareup.square.models;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.squareup.square.http.client.HttpContext;


/**
 * This is a model class for CancelPaymentByIdempotencyKeyResponse type.
 */
public class CancelPaymentByIdempotencyKeyResponse {

    /**
     * Initialization constructor.
     * @param errors
     */
    @JsonCreator
    public CancelPaymentByIdempotencyKeyResponse(
            @JsonProperty("errors") List<Error> errors) {
        this.errors = errors;
    }

    private HttpContext httpContext;
    private final List<Error> errors;

    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Errors.
     * Any errors that occurred during the request.
     */
    @JsonGetter("errors")
    public List<Error> getErrors() {
        return this.errors;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(errors);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof CancelPaymentByIdempotencyKeyResponse)) {
            return false;
        }
        CancelPaymentByIdempotencyKeyResponse cancelPaymentByIdempotencyKeyResponse = (CancelPaymentByIdempotencyKeyResponse) obj;
        return Objects.equals(errors, cancelPaymentByIdempotencyKeyResponse.errors);
    }

    /**
     * Builds a new {@link CancelPaymentByIdempotencyKeyResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CancelPaymentByIdempotencyKeyResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .errors(getErrors());
            return builder;
    }

    /**
     * Class to build instances of {@link CancelPaymentByIdempotencyKeyResponse}
     */
    public static class Builder {
        private HttpContext httpContext;
        private List<Error> errors;

        /**
         * Initialization constructor
         */
        public Builder() {
           
        }

        /**
         * Setter for httpContext
         * @param httpContext
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }
        /**
         * Setter for errors
         * @param errors
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link CancelPaymentByIdempotencyKeyResponse} object using the set fields.
         * @return {@link CancelPaymentByIdempotencyKeyResponse}
         */
        public CancelPaymentByIdempotencyKeyResponse build() {
            CancelPaymentByIdempotencyKeyResponse model = new CancelPaymentByIdempotencyKeyResponse(errors);
            model.httpContext = httpContext;
            return model;
        }
    }
}
