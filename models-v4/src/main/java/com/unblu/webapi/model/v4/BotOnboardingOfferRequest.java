
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
 * Request sent when a person joins a conversation, giving the bot a chance to participate in the person&#39;s onboarding. &lt;p&gt; Bots must accept or decline
 * the dialog offer by responding to the request with a &#x60;BotBoardingOfferResponse&#x60;. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;If the
 * onboarding person does not match the onboarding filter defined in the &#x60;DialogBot&#x60;, the request isn&#39;t sent to the bot&#39;s endpoint.&lt;/li&gt;
 * &lt;li&gt;The bot MUST respond to the request. If it doesn&#39;t, the person has to wait for a timeout before their onboarding can proceed.&lt;/li&gt;
 * &lt;/ul&gt;
 */
@ApiModel(description = "Request sent when a person joins a conversation, giving the bot a chance to participate in the person's onboarding. <p> Bots must accept or decline the dialog offer by responding to the request with a `BotBoardingOfferResponse`. <p> <b>Note:</b> <ul> <li>If the onboarding person does not match the onboarding filter defined in the `DialogBot`, the request isn't sent to the bot's endpoint.</li> <li>The bot MUST respond to the request. If it doesn't, the person has to wait for a timeout before their onboarding can proceed.</li> </ul>")

@JsonPropertyOrder({
	BotOnboardingOfferRequest.JSON_PROPERTY_$_TYPE,
	BotOnboardingOfferRequest.JSON_PROPERTY_ACCOUNT_ID,
	BotOnboardingOfferRequest.JSON_PROPERTY_SERVICE_NAME,
	BotOnboardingOfferRequest.JSON_PROPERTY_DIALOG_TOKEN,
	BotOnboardingOfferRequest.JSON_PROPERTY_ONBOARDING_PERSON,
	BotOnboardingOfferRequest.JSON_PROPERTY_CONVERSATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotOnboardingOfferRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTONBOARDINGOFFERREQUEST("BotOnboardingOfferRequest");

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
			return TypeEnum.BOTONBOARDINGOFFERREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTONBOARDINGOFFERREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_ONBOARDING_PERSON = "onboardingPerson";
	@JsonProperty(JSON_PROPERTY_ONBOARDING_PERSON)
	private PersonData onboardingPerson = null;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public BotOnboardingOfferRequest $type(TypeEnum $type) {
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

	public BotOnboardingOfferRequest accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Get accountId
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public BotOnboardingOfferRequest serviceName(String serviceName) {
		this.serviceName = serviceName;
		return this;
	}

	/**
	 * Get serviceName
	 * 
	 * @return serviceName
	 **/
	@ApiModelProperty(value = "")
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public BotOnboardingOfferRequest dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * The unique dialog token for this bot, used to identify this onboarding via the bot web API
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "The unique dialog token for this bot, used to identify this onboarding via the bot web API")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotOnboardingOfferRequest onboardingPerson(PersonData onboardingPerson) {
		this.onboardingPerson = onboardingPerson;
		return this;
	}

	/**
	 * Get onboardingPerson
	 * 
	 * @return onboardingPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getOnboardingPerson() {
		return onboardingPerson;
	}

	public void setOnboardingPerson(PersonData onboardingPerson) {
		this.onboardingPerson = onboardingPerson;
	}

	public BotOnboardingOfferRequest conversation(ConversationData conversation) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotOnboardingOfferRequest botOnboardingOfferRequest = (BotOnboardingOfferRequest) o;
		return Objects.equals(this.$type, botOnboardingOfferRequest.$type) &&
				Objects.equals(this.accountId, botOnboardingOfferRequest.accountId) &&
				Objects.equals(this.serviceName, botOnboardingOfferRequest.serviceName) &&
				Objects.equals(this.dialogToken, botOnboardingOfferRequest.dialogToken) &&
				Objects.equals(this.onboardingPerson, botOnboardingOfferRequest.onboardingPerson) &&
				Objects.equals(this.conversation, botOnboardingOfferRequest.conversation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, dialogToken, onboardingPerson, conversation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotOnboardingOfferRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    onboardingPerson: ").append(toIndentedString(onboardingPerson)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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
