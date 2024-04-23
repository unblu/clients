
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ERecordingFailedReason
 */
public enum ERecordingFailedReason {

	/**
	 * ABORT_SYSTEM: Recording aborted by the system
	 */
	ABORT_SYSTEM("ABORT_SYSTEM"),

	/**
	 * ABORT_TIMEOUT: Recording aborted due to timeout
	 */
	ABORT_TIMEOUT("ABORT_TIMEOUT"),

	/**
	 * ABORT_BLOBSTORE_FAILURE: Recording aborted due to an error regarding the blob
	 */
	ABORT_BLOBSTORE_FAILURE("ABORT_BLOBSTORE_FAILURE"),

	/**
	 * ABORT_UNEXPECT: Recording aborted unexpectedly
	 */
	ABORT_UNEXPECT("ABORT_UNEXPECT");

	private String value;

	ERecordingFailedReason(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static ERecordingFailedReason fromValue(String value) {
		for (ERecordingFailedReason b : ERecordingFailedReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
