
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
 * ConversationTemplateList
 */

@JsonPropertyOrder({
	ConversationTemplateList.JSON_PROPERTY_$_TYPE,
	ConversationTemplateList.JSON_PROPERTY_ITEMS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationTemplateList {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONTEMPLATELIST("ConversationTemplateList");

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
			return TypeEnum.CONVERSATIONTEMPLATELIST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONTEMPLATELIST;

	public static final String JSON_PROPERTY_ITEMS = "items";
	@JsonProperty(JSON_PROPERTY_ITEMS)
	private List<ConversationTemplate> items = null;

	public ConversationTemplateList $type(TypeEnum $type) {
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

	public ConversationTemplateList items(List<ConversationTemplate> items) {
		this.items = items;
		return this;
	}

	public ConversationTemplateList addItemsItem(ConversationTemplate itemsItem) {
		if (this.items == null) {
			this.items = new ArrayList<>();
		}
		this.items.add(itemsItem);
		return this;
	}

	/**
	 * The list of mapped entities
	 * 
	 * @return items
	 **/
	@ApiModelProperty(value = "The list of mapped entities")
	public List<ConversationTemplate> getItems() {
		return items;
	}

	public void setItems(List<ConversationTemplate> items) {
		this.items = items;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationTemplateList conversationTemplateList = (ConversationTemplateList) o;
		return Objects.equals(this.$type, conversationTemplateList.$type) &&
				Objects.equals(this.items, conversationTemplateList.items);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, items);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationTemplateList {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
