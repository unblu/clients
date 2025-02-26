
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
 * An event triggered every time a conversation&#39;s state is set to OFFBOARDING
 */
@ApiModel(description = "An event triggered every time a conversation's state is set to OFFBOARDING")

@JsonPropertyOrder({
	ConversationOffboardingEvent.JSON_PROPERTY_$_TYPE,
	ConversationOffboardingEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationOffboardingEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationOffboardingEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationOffboardingEvent.JSON_PROPERTY_CONVERSATION,
	ConversationOffboardingEvent.JSON_PROPERTY_END_REASON,
	ConversationOffboardingEvent.JSON_PROPERTY_END_PERSON,
	ConversationOffboardingEvent.JSON_PROPERTY_END_COMMENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationOffboardingEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONOFFBOARDINGEVENT("ConversationOffboardingEvent");

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
			return TypeEnum.CONVERSATIONOFFBOARDINGEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONOFFBOARDINGEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public static final String JSON_PROPERTY_END_REASON = "endReason";
	@JsonProperty(JSON_PROPERTY_END_REASON)
	private EConversationEndReason endReason;

	public static final String JSON_PROPERTY_END_PERSON = "endPerson";
	@JsonProperty(JSON_PROPERTY_END_PERSON)
	private PersonData endPerson = null;

	public static final String JSON_PROPERTY_END_COMMENT = "endComment";
	@JsonProperty(JSON_PROPERTY_END_COMMENT)
	private String endComment;

	public ConversationOffboardingEvent $type(TypeEnum $type) {
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

	public ConversationOffboardingEvent timestamp(Long timestamp) {
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

	public ConversationOffboardingEvent eventType(String eventType) {
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

	public ConversationOffboardingEvent accountId(String accountId) {
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

	public ConversationOffboardingEvent conversation(ConversationData conversation) {
		this.conversation = conversation;
		return this;
	}

	/**
	 * Get conversation
	 * 
	 * @return conversation
	 **/
	@ApiModelProperty(value = "")
	public ConversationData getConversation() {
		return conversation;
	}

	public void setConversation(ConversationData conversation) {
		this.conversation = conversation;
	}

	public ConversationOffboardingEvent endReason(EConversationEndReason endReason) {
		this.endReason = endReason;
		return this;
	}

	/**
	 * Get endReason
	 * 
	 * @return endReason
	 **/
	@ApiModelProperty(value = "")
	public EConversationEndReason getEndReason() {
		return endReason;
	}

	public void setEndReason(EConversationEndReason endReason) {
		this.endReason = endReason;
	}

	public ConversationOffboardingEvent endPerson(PersonData endPerson) {
		this.endPerson = endPerson;
		return this;
	}

	/**
	 * Get endPerson
	 * 
	 * @return endPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getEndPerson() {
		return endPerson;
	}

	public void setEndPerson(PersonData endPerson) {
		this.endPerson = endPerson;
	}

	public ConversationOffboardingEvent endComment(String endComment) {
		this.endComment = endComment;
		return this;
	}

	/**
	 * The comment provided when ending the conversation. May be null.
	 * 
	 * @return endComment
	 **/
	@ApiModelProperty(value = "The comment provided when ending the conversation. May be null.")
	public String getEndComment() {
		return endComment;
	}

	public void setEndComment(String endComment) {
		this.endComment = endComment;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationOffboardingEvent conversationOffboardingEvent = (ConversationOffboardingEvent) o;
		return Objects.equals(this.$type, conversationOffboardingEvent.$type) &&
				Objects.equals(this.timestamp, conversationOffboardingEvent.timestamp) &&
				Objects.equals(this.eventType, conversationOffboardingEvent.eventType) &&
				Objects.equals(this.accountId, conversationOffboardingEvent.accountId) &&
				Objects.equals(this.conversation, conversationOffboardingEvent.conversation) &&
				Objects.equals(this.endReason, conversationOffboardingEvent.endReason) &&
				Objects.equals(this.endPerson, conversationOffboardingEvent.endPerson) &&
				Objects.equals(this.endComment, conversationOffboardingEvent.endComment);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversation, endReason, endPerson, endComment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationOffboardingEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
		sb.append("    endPerson: ").append(toIndentedString(endPerson)).append("\n");
		sb.append("    endComment: ").append(toIndentedString(endComment)).append("\n");
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
