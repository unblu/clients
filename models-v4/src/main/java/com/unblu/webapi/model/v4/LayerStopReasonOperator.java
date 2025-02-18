package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsLayerStopReasonOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InLayerStopReasonOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsLayerStopReasonOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInLayerStopReasonOperator.class, name = "NOT_IN"),
})
public interface LayerStopReasonOperator {
	void setType(ELayerStopReasonOperatorType type);

	ELayerStopReasonOperatorType getType();

	LayerStopReasonOperator type(ELayerStopReasonOperatorType type);

}
