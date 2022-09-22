
package com.unblu.webapi.model.v3;

import java.util.ArrayList;
import java.util.List;
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
 * Visitor invitation created event
 */
@ApiModel(description = "Visitor invitation created event")

@JsonPropertyOrder({
	VisitorInvitationCreatedEvent.JSON_PROPERTY_$_TYPE,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_TIMESTAMP,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_EVENT_TYPE,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_ACCOUNT_ID,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_INVITATION_ID,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_CONVERSATION_ID,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_TOKEN,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_DATE_CREATED,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_CREATOR_TYPE,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_CREATOR_PERSON,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_EMAIL,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_NICKNAME,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
	VisitorInvitationCreatedEvent.JSON_PROPERTY_LINKS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class VisitorInvitationCreatedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		VISITORINVITATIONCREATEDEVENT("VisitorInvitationCreatedEvent");

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
			return TypeEnum.VISITORINVITATIONCREATEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.VISITORINVITATIONCREATEDEVENT;

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

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
	@JsonProperty(JSON_PROPERTY_DATE_CREATED)
	private Long dateCreated;

	public static final String JSON_PROPERTY_CREATOR_TYPE = "creatorType";
	@JsonProperty(JSON_PROPERTY_CREATOR_TYPE)
	private EInvitationCreatorType creatorType;

	public static final String JSON_PROPERTY_CREATOR_PERSON = "creatorPerson";
	@JsonProperty(JSON_PROPERTY_CREATOR_PERSON)
	private PersonData creatorPerson = null;

	public static final String JSON_PROPERTY_EMAIL = "email";
	@JsonProperty(JSON_PROPERTY_EMAIL)
	private String email;

	public static final String JSON_PROPERTY_NICKNAME = "nickname";
	@JsonProperty(JSON_PROPERTY_NICKNAME)
	private String nickname;

	public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
	@JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
	private Long expirationTimestamp;

	public static final String JSON_PROPERTY_LINKS = "links";
	@JsonProperty(JSON_PROPERTY_LINKS)
	private List<ConversationLink> links = null;

	public VisitorInvitationCreatedEvent $type(TypeEnum $type) {
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

	public VisitorInvitationCreatedEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (unix time in millies) that the event was generated.
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (unix time in millies) that the event was generated.")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public VisitorInvitationCreatedEvent eventType(String eventType) {
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

	public VisitorInvitationCreatedEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public VisitorInvitationCreatedEvent invitationId(String invitationId) {
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

	public VisitorInvitationCreatedEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Id of the conversation
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Id of the conversation")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public VisitorInvitationCreatedEvent token(String token) {
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

	public VisitorInvitationCreatedEvent dateCreated(Long dateCreated) {
		this.dateCreated = dateCreated;
		return this;
	}

	/**
	 * Unix timestamp when the event was created
	 * 
	 * @return dateCreated
	 **/
	@ApiModelProperty(value = "Unix timestamp when the event was created")
	public Long getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Long dateCreated) {
		this.dateCreated = dateCreated;
	}

	public VisitorInvitationCreatedEvent creatorType(EInvitationCreatorType creatorType) {
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

	public VisitorInvitationCreatedEvent creatorPerson(PersonData creatorPerson) {
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

	public VisitorInvitationCreatedEvent email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Visitor email
	 * 
	 * @return email
	 **/
	@ApiModelProperty(value = "Visitor email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public VisitorInvitationCreatedEvent nickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	/**
	 * Visitor nickname
	 * 
	 * @return nickname
	 **/
	@ApiModelProperty(value = "Visitor nickname")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public VisitorInvitationCreatedEvent expirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp after witch the invitation is no longer valid
	 * 
	 * @return expirationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp after witch the invitation is no longer valid")
	public Long getExpirationTimestamp() {
		return expirationTimestamp;
	}

	public void setExpirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	public VisitorInvitationCreatedEvent links(List<ConversationLink> links) {
		this.links = links;
		return this;
	}

	public VisitorInvitationCreatedEvent addLinksItem(ConversationLink linksItem) {
		if (this.links == null) {
			this.links = new ArrayList<>();
		}
		this.links.add(linksItem);
		return this;
	}

	/**
	 * List of links that can be used to accept the visitor invitation event with the token.&lt;br&gt; Only one link can be used.
	 * 
	 * @return links
	 **/
	@ApiModelProperty(value = "List of links that can be used to accept the visitor invitation event with the token.<br> Only one link can be used.")
	public List<ConversationLink> getLinks() {
		return links;
	}

	public void setLinks(List<ConversationLink> links) {
		this.links = links;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		VisitorInvitationCreatedEvent visitorInvitationCreatedEvent = (VisitorInvitationCreatedEvent) o;
		return Objects.equals(this.$type, visitorInvitationCreatedEvent.$type) &&
				Objects.equals(this.timestamp, visitorInvitationCreatedEvent.timestamp) &&
				Objects.equals(this.eventType, visitorInvitationCreatedEvent.eventType) &&
				Objects.equals(this.accountId, visitorInvitationCreatedEvent.accountId) &&
				Objects.equals(this.invitationId, visitorInvitationCreatedEvent.invitationId) &&
				Objects.equals(this.conversationId, visitorInvitationCreatedEvent.conversationId) &&
				Objects.equals(this.token, visitorInvitationCreatedEvent.token) &&
				Objects.equals(this.dateCreated, visitorInvitationCreatedEvent.dateCreated) &&
				Objects.equals(this.creatorType, visitorInvitationCreatedEvent.creatorType) &&
				Objects.equals(this.creatorPerson, visitorInvitationCreatedEvent.creatorPerson) &&
				Objects.equals(this.email, visitorInvitationCreatedEvent.email) &&
				Objects.equals(this.nickname, visitorInvitationCreatedEvent.nickname) &&
				Objects.equals(this.expirationTimestamp, visitorInvitationCreatedEvent.expirationTimestamp) &&
				Objects.equals(this.links, visitorInvitationCreatedEvent.links);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, invitationId, conversationId, token, dateCreated, creatorType, creatorPerson, email, nickname, expirationTimestamp, links);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class VisitorInvitationCreatedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    invitationId: ").append(toIndentedString(invitationId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
		sb.append("    creatorType: ").append(toIndentedString(creatorType)).append("\n");
		sb.append("    creatorPerson: ").append(toIndentedString(creatorPerson)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
