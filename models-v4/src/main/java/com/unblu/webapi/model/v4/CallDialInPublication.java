
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
 * Call dial-in publication metadata class
 */
@ApiModel(description = "Call dial-in publication metadata class")

@JsonPropertyOrder({
	CallDialInPublication.JSON_PROPERTY_$_TYPE,
	CallDialInPublication.JSON_PROPERTY_ID,
	CallDialInPublication.JSON_PROPERTY_CREATION_TIMESTAMP,
	CallDialInPublication.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	CallDialInPublication.JSON_PROPERTY_ACCOUNT_ID,
	CallDialInPublication.JSON_PROPERTY_TYPE,
	CallDialInPublication.JSON_PROPERTY_DIAL_IN_SERVICE_PROVIDER_TYPE,
	CallDialInPublication.JSON_PROPERTY_DIAL_IN_ID,
	CallDialInPublication.JSON_PROPERTY_DIAL_IN_NUMBER,
	CallDialInPublication.JSON_PROPERTY_START_TIMESTAMP,
	CallDialInPublication.JSON_PROPERTY_END_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CallDialInPublication implements CallPublication {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CALLDIALINPUBLICATION("CallDialInPublication");

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
			return TypeEnum.CALLDIALINPUBLICATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CALLDIALINPUBLICATION;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ECallPublicationType type = ECallPublicationType.DIAL_IN;

	public static final String JSON_PROPERTY_DIAL_IN_SERVICE_PROVIDER_TYPE = "dialInServiceProviderType";
	@JsonProperty(JSON_PROPERTY_DIAL_IN_SERVICE_PROVIDER_TYPE)
	private EDialInServiceProvider dialInServiceProviderType;

	public static final String JSON_PROPERTY_DIAL_IN_ID = "dialInId";
	@JsonProperty(JSON_PROPERTY_DIAL_IN_ID)
	private String dialInId;

	public static final String JSON_PROPERTY_DIAL_IN_NUMBER = "dialInNumber";
	@JsonProperty(JSON_PROPERTY_DIAL_IN_NUMBER)
	private String dialInNumber;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public CallDialInPublication $type(TypeEnum $type) {
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

	public CallDialInPublication id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique ID of the entity. When creating an entity, this property can be omitted; it&#39;s generated by the server.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique ID of the entity. When creating an entity, this property can be omitted; it's generated by the server.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CallDialInPublication creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency..
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency..")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public CallDialInPublication modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational
	 * character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it
	 * will not be written to the storage and will not effect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public CallDialInPublication accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It is filled by the Unblu server with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It is filled by the Unblu server with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public CallDialInPublication type(ECallPublicationType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public ECallPublicationType getType() {
		return type;
	}

	public void setType(ECallPublicationType type) {
		this.type = type;
	}

	public CallDialInPublication dialInServiceProviderType(EDialInServiceProvider dialInServiceProviderType) {
		this.dialInServiceProviderType = dialInServiceProviderType;
		return this;
	}

	/**
	 * Get dialInServiceProviderType
	 * 
	 * @return dialInServiceProviderType
	 **/
	@ApiModelProperty(value = "")
	public EDialInServiceProvider getDialInServiceProviderType() {
		return dialInServiceProviderType;
	}

	public void setDialInServiceProviderType(EDialInServiceProvider dialInServiceProviderType) {
		this.dialInServiceProviderType = dialInServiceProviderType;
	}

	public CallDialInPublication dialInId(String dialInId) {
		this.dialInId = dialInId;
		return this;
	}

	/**
	 * Dial-in ID of the dial-in service provider
	 * 
	 * @return dialInId
	 **/
	@ApiModelProperty(value = "Dial-in ID of the dial-in service provider")
	public String getDialInId() {
		return dialInId;
	}

	public void setDialInId(String dialInId) {
		this.dialInId = dialInId;
	}

	public CallDialInPublication dialInNumber(String dialInNumber) {
		this.dialInNumber = dialInNumber;
		return this;
	}

	/**
	 * Dial-in phone number used for this publication
	 * 
	 * @return dialInNumber
	 **/
	@ApiModelProperty(value = "Dial-in phone number used for this publication")
	public String getDialInNumber() {
		return dialInNumber;
	}

	public void setDialInNumber(String dialInNumber) {
		this.dialInNumber = dialInNumber;
	}

	public CallDialInPublication startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the dial-in publication started
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the dial-in publication started")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public CallDialInPublication endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the dial-in publication ended
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the dial-in publication ended")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CallDialInPublication callDialInPublication = (CallDialInPublication) o;
		return Objects.equals(this.$type, callDialInPublication.$type) &&
				Objects.equals(this.id, callDialInPublication.id) &&
				Objects.equals(this.creationTimestamp, callDialInPublication.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, callDialInPublication.modificationTimestamp) &&
				Objects.equals(this.accountId, callDialInPublication.accountId) &&
				Objects.equals(this.type, callDialInPublication.type) &&
				Objects.equals(this.dialInServiceProviderType, callDialInPublication.dialInServiceProviderType) &&
				Objects.equals(this.dialInId, callDialInPublication.dialInId) &&
				Objects.equals(this.dialInNumber, callDialInPublication.dialInNumber) &&
				Objects.equals(this.startTimestamp, callDialInPublication.startTimestamp) &&
				Objects.equals(this.endTimestamp, callDialInPublication.endTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, accountId, type, dialInServiceProviderType, dialInId, dialInNumber, startTimestamp, endTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CallDialInPublication {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    dialInServiceProviderType: ").append(toIndentedString(dialInServiceProviderType)).append("\n");
		sb.append("    dialInId: ").append(toIndentedString(dialInId)).append("\n");
		sb.append("    dialInNumber: ").append(toIndentedString(dialInNumber)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
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
