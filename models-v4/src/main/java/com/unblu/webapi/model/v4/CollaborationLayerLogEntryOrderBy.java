
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
 * CollaborationLayerLogEntry orderBy item.
 */
@ApiModel(description = "CollaborationLayerLogEntry orderBy item.")

@JsonPropertyOrder({
	CollaborationLayerLogEntryOrderBy.JSON_PROPERTY_$_TYPE,
	CollaborationLayerLogEntryOrderBy.JSON_PROPERTY_FIELD,
	CollaborationLayerLogEntryOrderBy.JSON_PROPERTY_ORDER,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CollaborationLayerLogEntryOrderBy {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COLLABORATIONLAYERLOGENTRYORDERBY("CollaborationLayerLogEntryOrderBy");

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
			return TypeEnum.COLLABORATIONLAYERLOGENTRYORDERBY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COLLABORATIONLAYERLOGENTRYORDERBY;

	public static final String JSON_PROPERTY_FIELD = "field";
	@JsonProperty(JSON_PROPERTY_FIELD)
	private ECollaborationLayerLogEntryOrderByField field;

	public static final String JSON_PROPERTY_ORDER = "order";
	@JsonProperty(JSON_PROPERTY_ORDER)
	private Order order;

	public CollaborationLayerLogEntryOrderBy $type(TypeEnum $type) {
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

	public CollaborationLayerLogEntryOrderBy field(ECollaborationLayerLogEntryOrderByField field) {
		this.field = field;
		return this;
	}

	/**
	 * Get field
	 * 
	 * @return field
	 **/
	@ApiModelProperty(value = "")
	public ECollaborationLayerLogEntryOrderByField getField() {
		return field;
	}

	public void setField(ECollaborationLayerLogEntryOrderByField field) {
		this.field = field;
	}

	public CollaborationLayerLogEntryOrderBy order(Order order) {
		this.order = order;
		return this;
	}

	/**
	 * Get order
	 * 
	 * @return order
	 **/
	@ApiModelProperty(value = "")
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CollaborationLayerLogEntryOrderBy collaborationLayerLogEntryOrderBy = (CollaborationLayerLogEntryOrderBy) o;
		return Objects.equals(this.$type, collaborationLayerLogEntryOrderBy.$type) &&
				Objects.equals(this.field, collaborationLayerLogEntryOrderBy.field) &&
				Objects.equals(this.order, collaborationLayerLogEntryOrderBy.order);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, field, order);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CollaborationLayerLogEntryOrderBy {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    field: ").append(toIndentedString(field)).append("\n");
		sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
