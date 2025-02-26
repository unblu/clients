
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
 * Possible option of a rating question message.
 */
@ApiModel(description = "Possible option of a rating question message.")

@JsonPropertyOrder({
	RatingQuestionOption.JSON_PROPERTY_$_TYPE,
	RatingQuestionOption.JSON_PROPERTY_LABEL,
	RatingQuestionOption.JSON_PROPERTY_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RatingQuestionOption {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		RATINGQUESTIONOPTION("RatingQuestionOption");

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
			return TypeEnum.RATINGQUESTIONOPTION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.RATINGQUESTIONOPTION;

	public static final String JSON_PROPERTY_LABEL = "label";
	@JsonProperty(JSON_PROPERTY_LABEL)
	private String label;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private String value;

	public RatingQuestionOption $type(TypeEnum $type) {
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

	public RatingQuestionOption label(String label) {
		this.label = label;
		return this;
	}

	/**
	 * Visual representation of the option
	 * 
	 * @return label
	 **/
	@ApiModelProperty(value = "Visual representation of the option")
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public RatingQuestionOption value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Value of the option, which is used in a &#x60;ReplyMessageData&#x60;
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "Value of the option, which is used in a `ReplyMessageData`")
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
		RatingQuestionOption ratingQuestionOption = (RatingQuestionOption) o;
		return Objects.equals(this.$type, ratingQuestionOption.$type) &&
				Objects.equals(this.label, ratingQuestionOption.label) &&
				Objects.equals(this.value, ratingQuestionOption.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, label, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RatingQuestionOption {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
