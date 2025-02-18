
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * ConversationIdCollaborationLayerLogEntrySearchFilter
 */

@JsonPropertyOrder({
	ConversationIdCollaborationLayerLogEntrySearchFilter.JSON_PROPERTY_$_TYPE,
	ConversationIdCollaborationLayerLogEntrySearchFilter.JSON_PROPERTY_FIELD,
	ConversationIdCollaborationLayerLogEntrySearchFilter.JSON_PROPERTY_OPERATOR,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationIdCollaborationLayerLogEntrySearchFilter implements CollaborationLayerLogEntrySearchFilter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONIDCOLLABORATIONLAYERLOGENTRYSEARCHFILTER("ConversationIdCollaborationLayerLogEntrySearchFilter");

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
			return TypeEnum.CONVERSATIONIDCOLLABORATIONLAYERLOGENTRYSEARCHFILTER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONIDCOLLABORATIONLAYERLOGENTRYSEARCHFILTER;

	public static final String JSON_PROPERTY_FIELD = "field";
	@JsonProperty(JSON_PROPERTY_FIELD)
	private ECollaborationLayerLogEntrySearchFilterField field = ECollaborationLayerLogEntrySearchFilterField.CONVERSATION_ID;

	public static final String JSON_PROPERTY_OPERATOR = "operator";
	@JsonProperty(JSON_PROPERTY_OPERATOR)
	private StringOperator operator = null;

	public ConversationIdCollaborationLayerLogEntrySearchFilter $type(TypeEnum $type) {
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

	public ConversationIdCollaborationLayerLogEntrySearchFilter field(ECollaborationLayerLogEntrySearchFilterField field) {
		this.field = field;
		return this;
	}

	/**
	 * Get field
	 * 
	 * @return field
	 **/
	@ApiModelProperty(value = "")
	public ECollaborationLayerLogEntrySearchFilterField getField() {
		return field;
	}

	public void setField(ECollaborationLayerLogEntrySearchFilterField field) {
		this.field = field;
	}

	public ConversationIdCollaborationLayerLogEntrySearchFilter operator(StringOperator operator) {
		this.operator = operator;
		return this;
	}

	/**
	 * Get operator
	 * 
	 * @return operator
	 **/
	@ApiModelProperty(value = "")
	public StringOperator getOperator() {
		return operator;
	}

	public void setOperator(StringOperator operator) {
		this.operator = operator;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationIdCollaborationLayerLogEntrySearchFilter conversationIdCollaborationLayerLogEntrySearchFilter = (ConversationIdCollaborationLayerLogEntrySearchFilter) o;
		return Objects.equals(this.$type, conversationIdCollaborationLayerLogEntrySearchFilter.$type) &&
				Objects.equals(this.field, conversationIdCollaborationLayerLogEntrySearchFilter.field) &&
				Objects.equals(this.operator, conversationIdCollaborationLayerLogEntrySearchFilter.operator);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, field, operator);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationIdCollaborationLayerLogEntrySearchFilter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    field: ").append(toIndentedString(field)).append("\n");
		sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
