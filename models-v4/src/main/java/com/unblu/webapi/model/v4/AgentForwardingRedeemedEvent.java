
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
 * Agent forwarding redeemed event
 */
@ApiModel(description = "Agent forwarding redeemed event")

@JsonPropertyOrder({
	AgentForwardingRedeemedEvent.JSON_PROPERTY_$_TYPE,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_TIMESTAMP,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_EVENT_TYPE,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_ACCOUNT_ID,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_INVITATION_ID,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_CONVERSATION,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_TOKEN,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_CREATION_TIMESTAMP,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_CREATOR_TYPE,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_CREATOR_PERSON,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_CONTEXT_PERSON_INFO,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_TARGET,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_COMMENT,
	AgentForwardingRedeemedEvent.JSON_PROPERTY_REDEEMING_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AgentForwardingRedeemedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AGENTFORWARDINGREDEEMEDEVENT("AgentForwardingRedeemedEvent");

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
			return TypeEnum.AGENTFORWARDINGREDEEMEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AGENTFORWARDINGREDEEMEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_INVITATION_ID = "invitationId";
	@JsonProperty(JSON_PROPERTY_INVITATION_ID)
	private String invitationId;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_CREATOR_TYPE = "creatorType";
	@JsonProperty(JSON_PROPERTY_CREATOR_TYPE)
	private EInvitationCreatorType creatorType;

	public static final String JSON_PROPERTY_CREATOR_PERSON = "creatorPerson";
	@JsonProperty(JSON_PROPERTY_CREATOR_PERSON)
	private PersonData creatorPerson = null;

	public static final String JSON_PROPERTY_CONTEXT_PERSON_INFO = "contextPersonInfo";
	@JsonProperty(JSON_PROPERTY_CONTEXT_PERSON_INFO)
	private ContextPersonInfo contextPersonInfo = null;

	public static final String JSON_PROPERTY_TARGET = "target";
	@JsonProperty(JSON_PROPERTY_TARGET)
	private AgentTargetData target = null;

	public static final String JSON_PROPERTY_COMMENT = "comment";
	@JsonProperty(JSON_PROPERTY_COMMENT)
	private String comment;

	public static final String JSON_PROPERTY_REDEEMING_PERSON = "redeemingPerson";
	@JsonProperty(JSON_PROPERTY_REDEEMING_PERSON)
	private PersonData redeemingPerson = null;

	public AgentForwardingRedeemedEvent $type(TypeEnum $type) {
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

	public AgentForwardingRedeemedEvent timestamp(Long timestamp) {
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

	public AgentForwardingRedeemedEvent eventType(String eventType) {
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

	public AgentForwardingRedeemedEvent accountId(String accountId) {
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

	public AgentForwardingRedeemedEvent invitationId(String invitationId) {
		this.invitationId = invitationId;
		return this;
	}

	/**
	 * Id of the invitation
	 * 
	 * @return invitationId
	 **/
	@ApiModelProperty(value = "Id of the invitation")
	public String getInvitationId() {
		return invitationId;
	}

	public void setInvitationId(String invitationId) {
		this.invitationId = invitationId;
	}

	public AgentForwardingRedeemedEvent conversation(ConversationData conversation) {
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

	public AgentForwardingRedeemedEvent token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * Token (digits for pin or character sequence) requested to redeem or revoke the invitation
	 * 
	 * @return token
	 **/
	@ApiModelProperty(value = "Token (digits for pin or character sequence) requested to redeem or revoke the invitation")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public AgentForwardingRedeemedEvent creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the event was created
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the event was created")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public AgentForwardingRedeemedEvent creatorType(EInvitationCreatorType creatorType) {
		this.creatorType = creatorType;
		return this;
	}

	/**
	 * Get creatorType
	 * 
	 * @return creatorType
	 **/
	@ApiModelProperty(value = "")
	public EInvitationCreatorType getCreatorType() {
		return creatorType;
	}

	public void setCreatorType(EInvitationCreatorType creatorType) {
		this.creatorType = creatorType;
	}

	public AgentForwardingRedeemedEvent creatorPerson(PersonData creatorPerson) {
		this.creatorPerson = creatorPerson;
		return this;
	}

	/**
	 * Get creatorPerson
	 * 
	 * @return creatorPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getCreatorPerson() {
		return creatorPerson;
	}

	public void setCreatorPerson(PersonData creatorPerson) {
		this.creatorPerson = creatorPerson;
	}

	public AgentForwardingRedeemedEvent contextPersonInfo(ContextPersonInfo contextPersonInfo) {
		this.contextPersonInfo = contextPersonInfo;
		return this;
	}

	/**
	 * Get contextPersonInfo
	 * 
	 * @return contextPersonInfo
	 **/
	@ApiModelProperty(value = "")
	public ContextPersonInfo getContextPersonInfo() {
		return contextPersonInfo;
	}

	public void setContextPersonInfo(ContextPersonInfo contextPersonInfo) {
		this.contextPersonInfo = contextPersonInfo;
	}

	public AgentForwardingRedeemedEvent target(AgentTargetData target) {
		this.target = target;
		return this;
	}

	/**
	 * Get target
	 * 
	 * @return target
	 **/
	@ApiModelProperty(value = "")
	public AgentTargetData getTarget() {
		return target;
	}

	public void setTarget(AgentTargetData target) {
		this.target = target;
	}

	public AgentForwardingRedeemedEvent comment(String comment) {
		this.comment = comment;
		return this;
	}

	/**
	 * Text provided by the creator for the target
	 * 
	 * @return comment
	 **/
	@ApiModelProperty(value = "Text provided by the creator for the target")
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public AgentForwardingRedeemedEvent redeemingPerson(PersonData redeemingPerson) {
		this.redeemingPerson = redeemingPerson;
		return this;
	}

	/**
	 * Get redeemingPerson
	 * 
	 * @return redeemingPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getRedeemingPerson() {
		return redeemingPerson;
	}

	public void setRedeemingPerson(PersonData redeemingPerson) {
		this.redeemingPerson = redeemingPerson;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AgentForwardingRedeemedEvent agentForwardingRedeemedEvent = (AgentForwardingRedeemedEvent) o;
		return Objects.equals(this.$type, agentForwardingRedeemedEvent.$type) &&
				Objects.equals(this.timestamp, agentForwardingRedeemedEvent.timestamp) &&
				Objects.equals(this.eventType, agentForwardingRedeemedEvent.eventType) &&
				Objects.equals(this.accountId, agentForwardingRedeemedEvent.accountId) &&
				Objects.equals(this.invitationId, agentForwardingRedeemedEvent.invitationId) &&
				Objects.equals(this.conversation, agentForwardingRedeemedEvent.conversation) &&
				Objects.equals(this.token, agentForwardingRedeemedEvent.token) &&
				Objects.equals(this.creationTimestamp, agentForwardingRedeemedEvent.creationTimestamp) &&
				Objects.equals(this.creatorType, agentForwardingRedeemedEvent.creatorType) &&
				Objects.equals(this.creatorPerson, agentForwardingRedeemedEvent.creatorPerson) &&
				Objects.equals(this.contextPersonInfo, agentForwardingRedeemedEvent.contextPersonInfo) &&
				Objects.equals(this.target, agentForwardingRedeemedEvent.target) &&
				Objects.equals(this.comment, agentForwardingRedeemedEvent.comment) &&
				Objects.equals(this.redeemingPerson, agentForwardingRedeemedEvent.redeemingPerson);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, invitationId, conversation, token, creationTimestamp, creatorType, creatorPerson, contextPersonInfo, target, comment, redeemingPerson);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AgentForwardingRedeemedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    invitationId: ").append(toIndentedString(invitationId)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    creatorType: ").append(toIndentedString(creatorType)).append("\n");
		sb.append("    creatorPerson: ").append(toIndentedString(creatorPerson)).append("\n");
		sb.append("    contextPersonInfo: ").append(toIndentedString(contextPersonInfo)).append("\n");
		sb.append("    target: ").append(toIndentedString(target)).append("\n");
		sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
		sb.append("    redeemingPerson: ").append(toIndentedString(redeemingPerson)).append("\n");
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
