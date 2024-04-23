
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * InInvitationTypeOperator
 */

@JsonPropertyOrder({
	InInvitationTypeOperator.JSON_PROPERTY_$_TYPE,
	InInvitationTypeOperator.JSON_PROPERTY_TYPE,
	InInvitationTypeOperator.JSON_PROPERTY_VALUES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InInvitationTypeOperator implements InvitationTypeOperator {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ININVITATIONTYPEOPERATOR("InInvitationTypeOperator");

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
			return TypeEnum.ININVITATIONTYPEOPERATOR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ININVITATIONTYPEOPERATOR;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EInvitationTypeOperatorType type = EInvitationTypeOperatorType.IN;

	public static final String JSON_PROPERTY_VALUES = "values";
	@JsonProperty(JSON_PROPERTY_VALUES)
	private List<EInvitationType> values = null;

	public InInvitationTypeOperator $type(TypeEnum $type) {
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

	public InInvitationTypeOperator type(EInvitationTypeOperatorType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EInvitationTypeOperatorType getType() {
		return type;
	}

	public void setType(EInvitationTypeOperatorType type) {
		this.type = type;
	}

	public InInvitationTypeOperator values(List<EInvitationType> values) {
		this.values = values;
		return this;
	}

	public InInvitationTypeOperator addValuesItem(EInvitationType valuesItem) {
		if (this.values == null) {
			this.values = new ArrayList<>();
		}
		this.values.add(valuesItem);
		return this;
	}

	/**
	 * Get values
	 * 
	 * @return values
	 **/
	@ApiModelProperty(value = "")
	public List<EInvitationType> getValues() {
		return values;
	}

	public void setValues(List<EInvitationType> values) {
		this.values = values;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InInvitationTypeOperator inInvitationTypeOperator = (InInvitationTypeOperator) o;
		return Objects.equals(this.$type, inInvitationTypeOperator.$type) &&
				Objects.equals(this.type, inInvitationTypeOperator.type) &&
				Objects.equals(this.values, inInvitationTypeOperator.values);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, values);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InInvitationTypeOperator {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
