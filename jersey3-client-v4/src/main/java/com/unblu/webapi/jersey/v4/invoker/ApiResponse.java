
package com.unblu.webapi.jersey.v4.invoker;

import java.util.List;
import java.util.Map;

/**
 * API response returned by API call.
 *
 * @param <T> The type of data that is deserialized from response body
 */
public class ApiResponse<T> {
	private final int statusCode;
	private final Map<String, List<String>> headers;
	private final T data;

	/**
	 * @param statusCode The status code of HTTP response
	 * @param headers The headers of HTTP response
	 */
	public ApiResponse(int statusCode, Map<String, List<String>> headers) {
		this(statusCode, headers, null);
	}

	/**
	 * @param statusCode The status code of HTTP response
	 * @param headers The headers of HTTP response
	 * @param data The object deserialized from response bod
	 */
	public ApiResponse(int statusCode, Map<String, List<String>> headers, T data) {
		this.statusCode = statusCode;
		this.headers = headers;
		this.data = data;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public Map<String, List<String>> getHeaders() {
		return headers;
	}

	public T getData() {
		return data;
	}
}
