package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsLayerTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InLayerTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsLayerTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInLayerTypeOperator.class, name = "NOT_IN"),
})
public interface LayerTypeOperator {
	void setType(ELayerTypeOperatorType type);

	ELayerTypeOperatorType getType();

	LayerTypeOperator type(ELayerTypeOperatorType type);

}
