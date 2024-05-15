
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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Call participation metadata class
 */
@ApiModel(description = "Call participation metadata class")

@JsonPropertyOrder({
	CallParticipation.JSON_PROPERTY_$_TYPE,
	CallParticipation.JSON_PROPERTY_ID,
	CallParticipation.JSON_PROPERTY_CREATION_TIMESTAMP,
	CallParticipation.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	CallParticipation.JSON_PROPERTY_ACCOUNT_ID,
	CallParticipation.JSON_PROPERTY_JOINED_TIMESTAMP,
	CallParticipation.JSON_PROPERTY_LEFT_TIMESTAMP,
	CallParticipation.JSON_PROPERTY_PERSON_ID,
	CallParticipation.JSON_PROPERTY_RINGING_TIMESTAMP,
	CallParticipation.JSON_PROPERTY_CONNECTED_TIMESTAMP,
	CallParticipation.JSON_PROPERTY_LEFT_REASON,
	CallParticipation.JSON_PROPERTY_PUBLICATIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CallParticipation {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CALLPARTICIPATION("CallParticipation");

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
			return TypeEnum.CALLPARTICIPATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CALLPARTICIPATION;

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

	public static final String JSON_PROPERTY_JOINED_TIMESTAMP = "joinedTimestamp";
	@JsonProperty(JSON_PROPERTY_JOINED_TIMESTAMP)
	private Long joinedTimestamp;

	public static final String JSON_PROPERTY_LEFT_TIMESTAMP = "leftTimestamp";
	@JsonProperty(JSON_PROPERTY_LEFT_TIMESTAMP)
	private Long leftTimestamp;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_RINGING_TIMESTAMP = "ringingTimestamp";
	@JsonProperty(JSON_PROPERTY_RINGING_TIMESTAMP)
	private Long ringingTimestamp;

	public static final String JSON_PROPERTY_CONNECTED_TIMESTAMP = "connectedTimestamp";
	@JsonProperty(JSON_PROPERTY_CONNECTED_TIMESTAMP)
	private Long connectedTimestamp;

	public static final String JSON_PROPERTY_LEFT_REASON = "leftReason";
	@JsonProperty(JSON_PROPERTY_LEFT_REASON)
	private ECallParticipationLeftReason leftReason;

	public static final String JSON_PROPERTY_PUBLICATIONS = "publications";
	@JsonProperty(JSON_PROPERTY_PUBLICATIONS)
	private List<CallPublication> publications = null;

	public CallParticipation $type(TypeEnum $type) {
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

	public CallParticipation id(String id) {
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

	public CallParticipation creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public CallParticipation modificationTimestamp(Long modificationTimestamp) {
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

	public CallParticipation accountId(String accountId) {
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

	public CallParticipation joinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the person has joined
	 * 
	 * @return joinedTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the person has joined")
	public Long getJoinedTimestamp() {
		return joinedTimestamp;
	}

	public void setJoinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
	}

	public CallParticipation leftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the person has left (may not be present or -1 if still online)
	 * 
	 * @return leftTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the person has left (may not be present or -1 if still online)")
	public Long getLeftTimestamp() {
		return leftTimestamp;
	}

	public void setLeftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
	}

	public CallParticipation personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Person id representing the participant
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "Person id representing the participant")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public CallParticipation ringingTimestamp(Long ringingTimestamp) {
		this.ringingTimestamp = ringingTimestamp;
		return this;
	}

	/**
	 * utc timestamp when this call participation actually starts ringing
	 * 
	 * @return ringingTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when this call participation actually starts ringing")
	public Long getRingingTimestamp() {
		return ringingTimestamp;
	}

	public void setRingingTimestamp(Long ringingTimestamp) {
		this.ringingTimestamp = ringingTimestamp;
	}

	public CallParticipation connectedTimestamp(Long connectedTimestamp) {
		this.connectedTimestamp = connectedTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the participant connected to the call
	 * 
	 * @return connectedTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the participant connected to the call")
	public Long getConnectedTimestamp() {
		return connectedTimestamp;
	}

	public void setConnectedTimestamp(Long connectedTimestamp) {
		this.connectedTimestamp = connectedTimestamp;
	}

	public CallParticipation leftReason(ECallParticipationLeftReason leftReason) {
		this.leftReason = leftReason;
		return this;
	}

	/**
	 * Get leftReason
	 * 
	 * @return leftReason
	 **/
	@ApiModelProperty(value = "")
	public ECallParticipationLeftReason getLeftReason() {
		return leftReason;
	}

	public void setLeftReason(ECallParticipationLeftReason leftReason) {
		this.leftReason = leftReason;
	}

	public CallParticipation publications(List<CallPublication> publications) {
		this.publications = publications;
		return this;
	}

	public CallParticipation addPublicationsItem(CallPublication publicationsItem) {
		if (this.publications == null) {
			this.publications = new ArrayList<>();
		}
		this.publications.add(publicationsItem);
		return this;
	}

	/**
	 * Get publications
	 * 
	 * @return publications
	 **/
	@ApiModelProperty(value = "")
	public List<CallPublication> getPublications() {
		return publications;
	}

	public void setPublications(List<CallPublication> publications) {
		this.publications = publications;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CallParticipation callParticipation = (CallParticipation) o;
		return Objects.equals(this.$type, callParticipation.$type) &&
				Objects.equals(this.id, callParticipation.id) &&
				Objects.equals(this.creationTimestamp, callParticipation.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, callParticipation.modificationTimestamp) &&
				Objects.equals(this.accountId, callParticipation.accountId) &&
				Objects.equals(this.joinedTimestamp, callParticipation.joinedTimestamp) &&
				Objects.equals(this.leftTimestamp, callParticipation.leftTimestamp) &&
				Objects.equals(this.personId, callParticipation.personId) &&
				Objects.equals(this.ringingTimestamp, callParticipation.ringingTimestamp) &&
				Objects.equals(this.connectedTimestamp, callParticipation.connectedTimestamp) &&
				Objects.equals(this.leftReason, callParticipation.leftReason) &&
				Objects.equals(this.publications, callParticipation.publications);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, accountId, joinedTimestamp, leftTimestamp, personId, ringingTimestamp, connectedTimestamp, leftReason, publications);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CallParticipation {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    joinedTimestamp: ").append(toIndentedString(joinedTimestamp)).append("\n");
		sb.append("    leftTimestamp: ").append(toIndentedString(leftTimestamp)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    ringingTimestamp: ").append(toIndentedString(ringingTimestamp)).append("\n");
		sb.append("    connectedTimestamp: ").append(toIndentedString(connectedTimestamp)).append("\n");
		sb.append("    leftReason: ").append(toIndentedString(leftReason)).append("\n");
		sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
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
