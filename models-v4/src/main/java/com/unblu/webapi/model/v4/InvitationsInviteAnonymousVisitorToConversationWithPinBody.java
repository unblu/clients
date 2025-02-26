
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;invitationsInviteAnonymousVisitorToConversationWithPin&#39; operation
 */
@ApiModel(description = "Request body for the 'invitationsInviteAnonymousVisitorToConversationWithPin' operation")

@JsonPropertyOrder({
	InvitationsInviteAnonymousVisitorToConversationWithPinBody.JSON_PROPERTY_CONVERSATION_ID,
	InvitationsInviteAnonymousVisitorToConversationWithPinBody.JSON_PROPERTY_NICKNAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InvitationsInviteAnonymousVisitorToConversationWithPinBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_NICKNAME = "nickname";
	@JsonProperty(JSON_PROPERTY_NICKNAME)
	private String nickname;

	public InvitationsInviteAnonymousVisitorToConversationWithPinBody conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Conversation id.
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Conversation id.")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public InvitationsInviteAnonymousVisitorToConversationWithPinBody nickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	/**
	 * Nickname that will be applied to the visitor who accepts the invitation if they are anonymous and don&#39;t already have a nickname set. Optional.
	 * 
	 * @return nickname
	 **/
	@ApiModelProperty(value = "Nickname that will be applied to the visitor who accepts the invitation if they are anonymous and don't already have a nickname set. Optional.")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvitationsInviteAnonymousVisitorToConversationWithPinBody invitationsInviteAnonymousVisitorToConversationWithPinBody = (InvitationsInviteAnonymousVisitorToConversationWithPinBody) o;
		return Objects.equals(this.conversationId, invitationsInviteAnonymousVisitorToConversationWithPinBody.conversationId) &&
				Objects.equals(this.nickname, invitationsInviteAnonymousVisitorToConversationWithPinBody.nickname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, nickname);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvitationsInviteAnonymousVisitorToConversationWithPinBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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
