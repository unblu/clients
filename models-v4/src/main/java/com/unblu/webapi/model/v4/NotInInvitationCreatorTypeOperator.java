
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
 * NotInInvitationCreatorTypeOperator
 */

@JsonPropertyOrder({
	NotInInvitationCreatorTypeOperator.JSON_PROPERTY_$_TYPE,
	NotInInvitationCreatorTypeOperator.JSON_PROPERTY_TYPE,
	NotInInvitationCreatorTypeOperator.JSON_PROPERTY_VALUES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class NotInInvitationCreatorTypeOperator implements InvitationCreatorTypeOperator {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		NOTININVITATIONCREATORTYPEOPERATOR("NotInInvitationCreatorTypeOperator");

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
			return TypeEnum.NOTININVITATIONCREATORTYPEOPERATOR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.NOTININVITATIONCREATORTYPEOPERATOR;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EInvitationCreatorTypeOperatorType type = EInvitationCreatorTypeOperatorType.NOT_IN;

	public static final String JSON_PROPERTY_VALUES = "values";
	@JsonProperty(JSON_PROPERTY_VALUES)
	private List<EInvitationCreatorType> values = null;

	public NotInInvitationCreatorTypeOperator $type(TypeEnum $type) {
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

	public NotInInvitationCreatorTypeOperator type(EInvitationCreatorTypeOperatorType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EInvitationCreatorTypeOperatorType getType() {
		return type;
	}

	public void setType(EInvitationCreatorTypeOperatorType type) {
		this.type = type;
	}

	public NotInInvitationCreatorTypeOperator values(List<EInvitationCreatorType> values) {
		this.values = values;
		return this;
	}

	public NotInInvitationCreatorTypeOperator addValuesItem(EInvitationCreatorType valuesItem) {
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
	public List<EInvitationCreatorType> getValues() {
		return values;
	}

	public void setValues(List<EInvitationCreatorType> values) {
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
		NotInInvitationCreatorTypeOperator notInInvitationCreatorTypeOperator = (NotInInvitationCreatorTypeOperator) o;
		return Objects.equals(this.$type, notInInvitationCreatorTypeOperator.$type) &&
				Objects.equals(this.type, notInInvitationCreatorTypeOperator.type) &&
				Objects.equals(this.values, notInInvitationCreatorTypeOperator.values);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, values);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NotInInvitationCreatorTypeOperator {\n");
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
