
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EPersonStateType
 */
public enum EPersonStateType {

	/**
	 * AGENT
	 */
	AGENT("AGENT"),

	/**
	 * VISITOR
	 */
	VISITOR("VISITOR");

	private String value;

	EPersonStateType(String value) {
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
	public static EPersonStateType fromValue(String value) {
		for (EPersonStateType b : EPersonStateType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
