
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
 * Data class for collaboration layer log entries.
 */
@ApiModel(description = "Data class for collaboration layer log entries.")

@JsonPropertyOrder({
	CollaborationLayerLogEntryData.JSON_PROPERTY_$_TYPE,
	CollaborationLayerLogEntryData.JSON_PROPERTY_CONVERSATION_ID,
	CollaborationLayerLogEntryData.JSON_PROPERTY_LAYER_TYPE,
	CollaborationLayerLogEntryData.JSON_PROPERTY_LAYER_OWNER_PERSON_DATA,
	CollaborationLayerLogEntryData.JSON_PROPERTY_STARTING_PERSON_DATA,
	CollaborationLayerLogEntryData.JSON_PROPERTY_STOPPING_PERSON_DATA,
	CollaborationLayerLogEntryData.JSON_PROPERTY_STARTING_TIMESTAMP,
	CollaborationLayerLogEntryData.JSON_PROPERTY_APPROVAL_TIMESTAMP,
	CollaborationLayerLogEntryData.JSON_PROPERTY_ACTIVATION_TIMESTAMP,
	CollaborationLayerLogEntryData.JSON_PROPERTY_STOP_TIMESTAMP,
	CollaborationLayerLogEntryData.JSON_PROPERTY_ABORT_TIMESTAMP,
	CollaborationLayerLogEntryData.JSON_PROPERTY_LAYER_ABORT_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CollaborationLayerLogEntryData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COLLABORATIONLAYERLOGENTRYDATA("CollaborationLayerLogEntryData");

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
			return TypeEnum.COLLABORATIONLAYERLOGENTRYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COLLABORATIONLAYERLOGENTRYDATA;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_LAYER_TYPE = "layerType";
	@JsonProperty(JSON_PROPERTY_LAYER_TYPE)
	private ELayerType layerType;

	public static final String JSON_PROPERTY_LAYER_OWNER_PERSON_DATA = "layerOwnerPersonData";
	@JsonProperty(JSON_PROPERTY_LAYER_OWNER_PERSON_DATA)
	private PersonData layerOwnerPersonData = null;

	public static final String JSON_PROPERTY_STARTING_PERSON_DATA = "startingPersonData";
	@JsonProperty(JSON_PROPERTY_STARTING_PERSON_DATA)
	private PersonData startingPersonData = null;

	public static final String JSON_PROPERTY_STOPPING_PERSON_DATA = "stoppingPersonData";
	@JsonProperty(JSON_PROPERTY_STOPPING_PERSON_DATA)
	private PersonData stoppingPersonData = null;

	public static final String JSON_PROPERTY_STARTING_TIMESTAMP = "startingTimestamp";
	@JsonProperty(JSON_PROPERTY_STARTING_TIMESTAMP)
	private Long startingTimestamp;

	public static final String JSON_PROPERTY_APPROVAL_TIMESTAMP = "approvalTimestamp";
	@JsonProperty(JSON_PROPERTY_APPROVAL_TIMESTAMP)
	private Long approvalTimestamp;

	public static final String JSON_PROPERTY_ACTIVATION_TIMESTAMP = "activationTimestamp";
	@JsonProperty(JSON_PROPERTY_ACTIVATION_TIMESTAMP)
	private Long activationTimestamp;

	public static final String JSON_PROPERTY_STOP_TIMESTAMP = "stopTimestamp";
	@JsonProperty(JSON_PROPERTY_STOP_TIMESTAMP)
	private Long stopTimestamp;

	public static final String JSON_PROPERTY_ABORT_TIMESTAMP = "abortTimestamp";
	@JsonProperty(JSON_PROPERTY_ABORT_TIMESTAMP)
	private Long abortTimestamp;

	public static final String JSON_PROPERTY_LAYER_ABORT_REASON = "layerAbortReason";
	@JsonProperty(JSON_PROPERTY_LAYER_ABORT_REASON)
	private ELayerStopReason layerAbortReason;

	public CollaborationLayerLogEntryData $type(TypeEnum $type) {
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

	public CollaborationLayerLogEntryData conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation the event originated from
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation the event originated from")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public CollaborationLayerLogEntryData layerType(ELayerType layerType) {
		this.layerType = layerType;
		return this;
	}

	/**
	 * Get layerType
	 * 
	 * @return layerType
	 **/
	@ApiModelProperty(value = "")
	public ELayerType getLayerType() {
		return layerType;
	}

	public void setLayerType(ELayerType layerType) {
		this.layerType = layerType;
	}

	public CollaborationLayerLogEntryData layerOwnerPersonData(PersonData layerOwnerPersonData) {
		this.layerOwnerPersonData = layerOwnerPersonData;
		return this;
	}

	/**
	 * Get layerOwnerPersonData
	 * 
	 * @return layerOwnerPersonData
	 **/
	@ApiModelProperty(value = "")
	public PersonData getLayerOwnerPersonData() {
		return layerOwnerPersonData;
	}

	public void setLayerOwnerPersonData(PersonData layerOwnerPersonData) {
		this.layerOwnerPersonData = layerOwnerPersonData;
	}

	public CollaborationLayerLogEntryData startingPersonData(PersonData startingPersonData) {
		this.startingPersonData = startingPersonData;
		return this;
	}

	/**
	 * Get startingPersonData
	 * 
	 * @return startingPersonData
	 **/
	@ApiModelProperty(value = "")
	public PersonData getStartingPersonData() {
		return startingPersonData;
	}

	public void setStartingPersonData(PersonData startingPersonData) {
		this.startingPersonData = startingPersonData;
	}

	public CollaborationLayerLogEntryData stoppingPersonData(PersonData stoppingPersonData) {
		this.stoppingPersonData = stoppingPersonData;
		return this;
	}

	/**
	 * Get stoppingPersonData
	 * 
	 * @return stoppingPersonData
	 **/
	@ApiModelProperty(value = "")
	public PersonData getStoppingPersonData() {
		return stoppingPersonData;
	}

	public void setStoppingPersonData(PersonData stoppingPersonData) {
		this.stoppingPersonData = stoppingPersonData;
	}

	public CollaborationLayerLogEntryData startingTimestamp(Long startingTimestamp) {
		this.startingTimestamp = startingTimestamp;
		return this;
	}

	/**
	 * The timestamp when the layer was started
	 * 
	 * @return startingTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the layer was started")
	public Long getStartingTimestamp() {
		return startingTimestamp;
	}

	public void setStartingTimestamp(Long startingTimestamp) {
		this.startingTimestamp = startingTimestamp;
	}

	public CollaborationLayerLogEntryData approvalTimestamp(Long approvalTimestamp) {
		this.approvalTimestamp = approvalTimestamp;
		return this;
	}

	/**
	 * The timestamp when the layer was approved
	 * 
	 * @return approvalTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the layer was approved")
	public Long getApprovalTimestamp() {
		return approvalTimestamp;
	}

	public void setApprovalTimestamp(Long approvalTimestamp) {
		this.approvalTimestamp = approvalTimestamp;
	}

	public CollaborationLayerLogEntryData activationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
		return this;
	}

	/**
	 * The timestamp when the layer was activated
	 * 
	 * @return activationTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the layer was activated")
	public Long getActivationTimestamp() {
		return activationTimestamp;
	}

	public void setActivationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
	}

	public CollaborationLayerLogEntryData stopTimestamp(Long stopTimestamp) {
		this.stopTimestamp = stopTimestamp;
		return this;
	}

	/**
	 * The timestamp when the layer was stopped
	 * 
	 * @return stopTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the layer was stopped")
	public Long getStopTimestamp() {
		return stopTimestamp;
	}

	public void setStopTimestamp(Long stopTimestamp) {
		this.stopTimestamp = stopTimestamp;
	}

	public CollaborationLayerLogEntryData abortTimestamp(Long abortTimestamp) {
		this.abortTimestamp = abortTimestamp;
		return this;
	}

	/**
	 * The timestamp when the layer was aborted
	 * 
	 * @return abortTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the layer was aborted")
	public Long getAbortTimestamp() {
		return abortTimestamp;
	}

	public void setAbortTimestamp(Long abortTimestamp) {
		this.abortTimestamp = abortTimestamp;
	}

	public CollaborationLayerLogEntryData layerAbortReason(ELayerStopReason layerAbortReason) {
		this.layerAbortReason = layerAbortReason;
		return this;
	}

	/**
	 * Get layerAbortReason
	 * 
	 * @return layerAbortReason
	 **/
	@ApiModelProperty(value = "")
	public ELayerStopReason getLayerAbortReason() {
		return layerAbortReason;
	}

	public void setLayerAbortReason(ELayerStopReason layerAbortReason) {
		this.layerAbortReason = layerAbortReason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CollaborationLayerLogEntryData collaborationLayerLogEntryData = (CollaborationLayerLogEntryData) o;
		return Objects.equals(this.$type, collaborationLayerLogEntryData.$type) &&
				Objects.equals(this.conversationId, collaborationLayerLogEntryData.conversationId) &&
				Objects.equals(this.layerType, collaborationLayerLogEntryData.layerType) &&
				Objects.equals(this.layerOwnerPersonData, collaborationLayerLogEntryData.layerOwnerPersonData) &&
				Objects.equals(this.startingPersonData, collaborationLayerLogEntryData.startingPersonData) &&
				Objects.equals(this.stoppingPersonData, collaborationLayerLogEntryData.stoppingPersonData) &&
				Objects.equals(this.startingTimestamp, collaborationLayerLogEntryData.startingTimestamp) &&
				Objects.equals(this.approvalTimestamp, collaborationLayerLogEntryData.approvalTimestamp) &&
				Objects.equals(this.activationTimestamp, collaborationLayerLogEntryData.activationTimestamp) &&
				Objects.equals(this.stopTimestamp, collaborationLayerLogEntryData.stopTimestamp) &&
				Objects.equals(this.abortTimestamp, collaborationLayerLogEntryData.abortTimestamp) &&
				Objects.equals(this.layerAbortReason, collaborationLayerLogEntryData.layerAbortReason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, conversationId, layerType, layerOwnerPersonData, startingPersonData, stoppingPersonData, startingTimestamp, approvalTimestamp, activationTimestamp, stopTimestamp, abortTimestamp, layerAbortReason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CollaborationLayerLogEntryData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    layerType: ").append(toIndentedString(layerType)).append("\n");
		sb.append("    layerOwnerPersonData: ").append(toIndentedString(layerOwnerPersonData)).append("\n");
		sb.append("    startingPersonData: ").append(toIndentedString(startingPersonData)).append("\n");
		sb.append("    stoppingPersonData: ").append(toIndentedString(stoppingPersonData)).append("\n");
		sb.append("    startingTimestamp: ").append(toIndentedString(startingTimestamp)).append("\n");
		sb.append("    approvalTimestamp: ").append(toIndentedString(approvalTimestamp)).append("\n");
		sb.append("    activationTimestamp: ").append(toIndentedString(activationTimestamp)).append("\n");
		sb.append("    stopTimestamp: ").append(toIndentedString(stopTimestamp)).append("\n");
		sb.append("    abortTimestamp: ").append(toIndentedString(abortTimestamp)).append("\n");
		sb.append("    layerAbortReason: ").append(toIndentedString(layerAbortReason)).append("\n");
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
