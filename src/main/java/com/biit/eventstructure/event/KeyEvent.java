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

import java.time.LocalDateTime;

public class KeyEvent extends BasicEvent {
    private int programId;
    private int journeyId;
    private int projectId;
    private String variable;
    private Object value;

    public KeyEvent() {
        super();
    }

    public KeyEvent(String id, LocalDateTime creationTime, int programId, int journeyId, int projectId, String variable, Object value) {
        super(id, creationTime);
        this.programId = programId;
        this.journeyId = journeyId;
        this.projectId = projectId;
        this.variable = variable;
        this.value = value;
    }

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString() + ", programId: '" + getProgramId() + "', journeyId: '" + getJourneyId() +
                "', projectId: '" + getProjectId() + "', variable: '" + getVariable() + "', value: '" + getValue() + "'";
    }
}
