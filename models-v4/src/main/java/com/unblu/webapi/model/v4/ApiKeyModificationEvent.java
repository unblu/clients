
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
 * An event triggered every time a &#x60;ApiKey&#x60; is created, deleted or changed.
 */
@ApiModel(description = "An event triggered every time a `ApiKey` is created, deleted or changed.")

@JsonPropertyOrder({
	ApiKeyModificationEvent.JSON_PROPERTY_$_TYPE,
	ApiKeyModificationEvent.JSON_PROPERTY_TIMESTAMP,
	ApiKeyModificationEvent.JSON_PROPERTY_EVENT_TYPE,
	ApiKeyModificationEvent.JSON_PROPERTY_ACCOUNT_ID,
	ApiKeyModificationEvent.JSON_PROPERTY_ACTION,
	ApiKeyModificationEvent.JSON_PROPERTY_ENTITY,
	ApiKeyModificationEvent.JSON_PROPERTY_EDITING_USER,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ApiKeyModificationEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		APIKEYMODIFICATIONEVENT("ApiKeyModificationEvent");

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
			return TypeEnum.APIKEYMODIFICATIONEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.APIKEYMODIFICATIONEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_ACTION = "action";
	@JsonProperty(JSON_PROPERTY_ACTION)
	private EntityModificationAction action;

	public static final String JSON_PROPERTY_ENTITY = "entity";
	@JsonProperty(JSON_PROPERTY_ENTITY)
	private ApiKey entity = null;

	public static final String JSON_PROPERTY_EDITING_USER = "editingUser";
	@JsonProperty(JSON_PROPERTY_EDITING_USER)
	private UserInfo editingUser = null;

	public ApiKeyModificationEvent $type(TypeEnum $type) {
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

	public ApiKeyModificationEvent timestamp(Long timestamp) {
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

	public ApiKeyModificationEvent eventType(String eventType) {
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

	public ApiKeyModificationEvent accountId(String accountId) {
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

	public ApiKeyModificationEvent action(EntityModificationAction action) {
		this.action = action;
		return this;
	}

	/**
	 * Get action
	 * 
	 * @return action
	 **/
	@ApiModelProperty(value = "")
	public EntityModificationAction getAction() {
		return action;
	}

	public void setAction(EntityModificationAction action) {
		this.action = action;
	}

	public ApiKeyModificationEvent entity(ApiKey entity) {
		this.entity = entity;
		return this;
	}

	/**
	 * Get entity
	 * 
	 * @return entity
	 **/
	@ApiModelProperty(value = "")
	public ApiKey getEntity() {
		return entity;
	}

	public void setEntity(ApiKey entity) {
		this.entity = entity;
	}

	public ApiKeyModificationEvent editingUser(UserInfo editingUser) {
		this.editingUser = editingUser;
		return this;
	}

	/**
	 * Get editingUser
	 * 
	 * @return editingUser
	 **/
	@ApiModelProperty(value = "")
	public UserInfo getEditingUser() {
		return editingUser;
	}

	public void setEditingUser(UserInfo editingUser) {
		this.editingUser = editingUser;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApiKeyModificationEvent apiKeyModificationEvent = (ApiKeyModificationEvent) o;
		return Objects.equals(this.$type, apiKeyModificationEvent.$type) &&
				Objects.equals(this.timestamp, apiKeyModificationEvent.timestamp) &&
				Objects.equals(this.eventType, apiKeyModificationEvent.eventType) &&
				Objects.equals(this.accountId, apiKeyModificationEvent.accountId) &&
				Objects.equals(this.action, apiKeyModificationEvent.action) &&
				Objects.equals(this.entity, apiKeyModificationEvent.entity) &&
				Objects.equals(this.editingUser, apiKeyModificationEvent.editingUser);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, action, entity, editingUser);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApiKeyModificationEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    action: ").append(toIndentedString(action)).append("\n");
		sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
		sb.append("    editingUser: ").append(toIndentedString(editingUser)).append("\n");
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
