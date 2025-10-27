package com.biit.eventstructure.event;

/*-
 * #%L
 * Event Structure
 * %%
 * Copyright (C) 2022 - 2025 BiiT Sourcing Solutions S.L.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */

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
		event.setEventId(getEventId());
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
