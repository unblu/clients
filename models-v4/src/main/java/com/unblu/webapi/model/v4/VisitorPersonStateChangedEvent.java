
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An event triggered every time a visitor person&#39;s state changes
 */
@ApiModel(description = "An event triggered every time a visitor person's state changes")

@JsonPropertyOrder({
	VisitorPersonStateChangedEvent.JSON_PROPERTY_$_TYPE,
	VisitorPersonStateChangedEvent.JSON_PROPERTY_TIMESTAMP,
	VisitorPersonStateChangedEvent.JSON_PROPERTY_EVENT_TYPE,
	VisitorPersonStateChangedEvent.JSON_PROPERTY_ACCOUNT_ID,
	VisitorPersonStateChangedEvent.JSON_PROPERTY_PERSON_STATE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class VisitorPersonStateChangedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		VISITORPERSONSTATECHANGEDEVENT("VisitorPersonStateChangedEvent");

		private String value;

		TypeEnum(String value) {
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
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.VISITORPERSONSTATECHANGEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.VISITORPERSONSTATECHANGEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_PERSON_STATE = "personState";
	@JsonProperty(JSON_PROPERTY_PERSON_STATE)
	private VisitorPersonStateData personState = null;

	public VisitorPersonStateChangedEvent $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public VisitorPersonStateChangedEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (Unix time in ms) when the event was generated
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (Unix time in ms) when the event was generated")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public VisitorPersonStateChangedEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public VisitorPersonStateChangedEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public VisitorPersonStateChangedEvent personState(VisitorPersonStateData personState) {
		this.personState = personState;
		return this;
	}

	/**
	 * Get personState
	 * 
	 * @return personState
	 **/
	@ApiModelProperty(value = "")
	public VisitorPersonStateData getPersonState() {
		return personState;
	}

	public void setPersonState(VisitorPersonStateData personState) {
		this.personState = personState;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		VisitorPersonStateChangedEvent visitorPersonStateChangedEvent = (VisitorPersonStateChangedEvent) o;
		return Objects.equals(this.$type, visitorPersonStateChangedEvent.$type) &&
				Objects.equals(this.timestamp, visitorPersonStateChangedEvent.timestamp) &&
				Objects.equals(this.eventType, visitorPersonStateChangedEvent.eventType) &&
				Objects.equals(this.accountId, visitorPersonStateChangedEvent.accountId) &&
				Objects.equals(this.personState, visitorPersonStateChangedEvent.personState);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, personState);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class VisitorPersonStateChangedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    personState: ").append(toIndentedString(personState)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
