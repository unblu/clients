
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
 * Success response to a &#x60;ExternalMessengerNewMessageRequest&#x60; API call.
 */
@ApiModel(description = "Success response to a `ExternalMessengerNewMessageRequest` API call.")

@JsonPropertyOrder({
	ExternalMessengerNewMessageResponse.JSON_PROPERTY_$_TYPE,
	ExternalMessengerNewMessageResponse.JSON_PROPERTY_EXTERNAL_MESSAGE_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerNewMessageResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERNEWMESSAGERESPONSE("ExternalMessengerNewMessageResponse");

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
			return TypeEnum.EXTERNALMESSENGERNEWMESSAGERESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERNEWMESSAGERESPONSE;

	public static final String JSON_PROPERTY_EXTERNAL_MESSAGE_ID = "externalMessageId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSAGE_ID)
	private String externalMessageId;

	public ExternalMessengerNewMessageResponse $type(TypeEnum $type) {
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

	public ExternalMessengerNewMessageResponse externalMessageId(String externalMessageId) {
		this.externalMessageId = externalMessageId;
		return this;
	}

	/**
	 * Get externalMessageId
	 * 
	 * @return externalMessageId
	 **/
	@ApiModelProperty(value = "")
	public String getExternalMessageId() {
		return externalMessageId;
	}

	public void setExternalMessageId(String externalMessageId) {
		this.externalMessageId = externalMessageId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerNewMessageResponse externalMessengerNewMessageResponse = (ExternalMessengerNewMessageResponse) o;
		return Objects.equals(this.$type, externalMessengerNewMessageResponse.$type) &&
				Objects.equals(this.externalMessageId, externalMessengerNewMessageResponse.externalMessageId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, externalMessageId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerNewMessageResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    externalMessageId: ").append(toIndentedString(externalMessageId)).append("\n");
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
