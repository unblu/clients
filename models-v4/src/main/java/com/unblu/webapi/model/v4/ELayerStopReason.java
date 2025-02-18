
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ELayerStopReason
 */
public enum ELayerStopReason {

	/**
	 * STOPPED_BY_USER: Layer was explicitly stopped by the user
	 */
	STOPPED_BY_USER("STOPPED_BY_USER"),

	/**
	 * APPROVAL_DECLINED: Layer approval was declined by the user
	 */
	APPROVAL_DECLINED("APPROVAL_DECLINED"),

	/**
	 * REMOVED: Layer was removed as it is no longer supported or is unavailable for the person
	 */
	REMOVED("REMOVED"),

	/**
	 * INACTIVITY: Layer was stopped due to inactivity
	 */
	INACTIVITY("INACTIVITY"),

	/**
	 * RECORDING_STOPPED: Recording of the layer was stopped. This will also stop the layer if the recording is mandatory
	 */
	RECORDING_STOPPED("RECORDING_STOPPED"),

	/**
	 * CONVERSATION_OFFBOARDING: Layer was stopped by the system due to conversation going into the offboarding phase
	 */
	CONVERSATION_OFFBOARDING("CONVERSATION_OFFBOARDING"),

	/**
	 * SYSTEM_SHUTDOWN: Layer was stopped due to shutdown of the whole system
	 */
	SYSTEM_SHUTDOWN("SYSTEM_SHUTDOWN"),

	/**
	 * ACTIVATION_ERROR: Layer was stopped due to an error. This error could be a decline, abortion or canceling of the active layer
	 */
	ACTIVATION_ERROR("ACTIVATION_ERROR"),

	/**
	 * RENDERING_SERVICE_STOPPED: The headless browser disconnected and the layer was stopped
	 */
	RENDERING_SERVICE_STOPPED("RENDERING_SERVICE_STOPPED");

	private String value;

	ELayerStopReason(String value) {
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
	public static ELayerStopReason fromValue(String value) {
		for (ELayerStopReason b : ELayerStopReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
