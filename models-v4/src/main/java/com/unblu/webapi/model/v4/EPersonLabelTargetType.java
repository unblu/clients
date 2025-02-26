
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The person type a person label can be set on
 */
public enum EPersonLabelTargetType {

	/**
	 * AGENT: Agent
	 */
	AGENT("AGENT"),

	/**
	 * ANONYMOUS_VISITOR: Anonymous visitor
	 */
	ANONYMOUS_VISITOR("ANONYMOUS_VISITOR"),

	/**
	 * AUTHENTICATED_VISITOR: Authenticated visitor
	 */
	AUTHENTICATED_VISITOR("AUTHENTICATED_VISITOR"),

	/**
	 * BOT: Bot
	 */
	BOT("BOT");

	private String value;

	EPersonLabelTargetType(String value) {
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
	public static EPersonLabelTargetType fromValue(String value) {
		for (EPersonLabelTargetType b : EPersonLabelTargetType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
