package com.biit.eventstructure.event;

import javax.lang.model.type.NullType;

public class Response extends EventResponse {

	private Object value;

	public Response() {
		super();
	}

	public Response(Object value) {
		super();
		this.value = value;
	}

	public Response(String parameter, Object value) {
		super(parameter);
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public BasicEvent getBasicEvent(String category) {
		EventResponse event;
		if (value != null) {
			if (value instanceof Number) {
				EventNumericResponse numericAnswer = new EventNumericResponse();
				numericAnswer.setValue(Double.valueOf(value.toString()));
				event = numericAnswer;
			} else {
				EventStringResponse stringAnswer = new EventStringResponse();
				stringAnswer.setValue(value.toString());
				event = stringAnswer;
			}
		} else {
			EventStringResponse stringAnswer = new EventStringResponse();
			stringAnswer.setValue("");
			event = stringAnswer;
		}
		event.setId(getId());
		event.setGroup(getGroup());
		event.setParameter(getParameter());
		event.setCreationTime(getCreationTime());
		event.setCategory(category == null ? "default" : category);
		return event;
	}

	@Override
	public String toString() {
		return super.toString() + ", Category: '" + getCategory() + "', Group: '" + getGroup() + "', Parameter: '" + getParameter() +
				"', Value: '" + getValue() + "' (" + (getValue() == null ? NullType.class.toString() : getValue().getClass().getName()) + ")";
	}
}
