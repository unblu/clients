
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
 * Message to reply to a specific question message.
 */
@ApiModel(description = "Message to reply to a specific question message.")

@JsonPropertyOrder({
	ReplyPostMessageData.JSON_PROPERTY_$_TYPE,
	ReplyPostMessageData.JSON_PROPERTY_TYPE,
	ReplyPostMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	ReplyPostMessageData.JSON_PROPERTY_LOCALE,
	ReplyPostMessageData.JSON_PROPERTY_QUESTION_MESSAGE_ID,
	ReplyPostMessageData.JSON_PROPERTY_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ReplyPostMessageData implements PostMessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		REPLYPOSTMESSAGEDATA("ReplyPostMessageData");

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
			return TypeEnum.REPLYPOSTMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.REPLYPOSTMESSAGEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPostMessageType type = EPostMessageType.REPLY;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_QUESTION_MESSAGE_ID = "questionMessageId";
	@JsonProperty(JSON_PROPERTY_QUESTION_MESSAGE_ID)
	private String questionMessageId;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private String value;

	public ReplyPostMessageData $type(TypeEnum $type) {
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

	public ReplyPostMessageData type(EPostMessageType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EPostMessageType getType() {
		return type;
	}

	public void setType(EPostMessageType type) {
		this.type = type;
	}

	public ReplyPostMessageData fallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
		return this;
	}

	/**
	 * Optional fallback text which is used when: &lt;ul&gt; &lt;li&gt;Unblu can&#39;t restore the complex content of a message&lt;/li&gt; &lt;li&gt;A push
	 * notification couldn&#39;t be decrypted&lt;/li&gt; &lt;li&gt;Last message in the conversation overview&lt;/li&gt; &lt;/ul&gt; The usage of this field is
	 * recommended especially for complex message types.&lt;br&gt; The value must not contain markdown.&lt;br&gt; If no fallback is given, a fallback text based on
	 * the content of the message is generated. This may however not always be a perfect textual representation of the message.&lt;br&gt;
	 * 
	 * @return fallbackText
	 **/
	@ApiModelProperty(value = "Optional fallback text which is used when: <ul> <li>Unblu can't restore the complex content of a message</li> <li>A push notification couldn't be decrypted</li> <li>Last message in the conversation overview</li> </ul> The usage of this field is recommended especially for complex message types.<br> The value must not contain markdown.<br> If no fallback is given, a fallback text based on the content of the message is generated. This may however not always be a perfect textual representation of the message.<br>")
	public String getFallbackText() {
		return fallbackText;
	}

	public void setFallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
	}

	public ReplyPostMessageData locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * Optional source language of the message (as BCP 47 language tag form including region if available). If not provided the language will be automatically
	 * detected based on the provided content. If the detection can&#39;t confidently detect the language the message will be considered to be in the
	 * conversation&#39;s locale.
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "Optional source language of the message (as BCP 47 language tag form including region if available). If not provided the language will be automatically detected based on the provided content. If the detection can't confidently detect the language the message will be considered to be in the conversation's locale.")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public ReplyPostMessageData questionMessageId(String questionMessageId) {
		this.questionMessageId = questionMessageId;
		return this;
	}

	/**
	 * ID of the question message for which this reply is
	 * 
	 * @return questionMessageId
	 **/
	@ApiModelProperty(value = "ID of the question message for which this reply is")
	public String getQuestionMessageId() {
		return questionMessageId;
	}

	public void setQuestionMessageId(String questionMessageId) {
		this.questionMessageId = questionMessageId;
	}

	public ReplyPostMessageData value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * The reply value for the question message.
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "The reply value for the question message.")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ReplyPostMessageData replyPostMessageData = (ReplyPostMessageData) o;
		return Objects.equals(this.$type, replyPostMessageData.$type) &&
				Objects.equals(this.type, replyPostMessageData.type) &&
				Objects.equals(this.fallbackText, replyPostMessageData.fallbackText) &&
				Objects.equals(this.locale, replyPostMessageData.locale) &&
				Objects.equals(this.questionMessageId, replyPostMessageData.questionMessageId) &&
				Objects.equals(this.value, replyPostMessageData.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, fallbackText, locale, questionMessageId, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReplyPostMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    questionMessageId: ").append(toIndentedString(questionMessageId)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
