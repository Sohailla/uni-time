/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/
package org.unitime.timetable.model.base;

import java.io.Serializable;

import org.unitime.timetable.model.StandardEventNote;

/**
 * Do not change this class. It has been automatically generated using ant create-model.
 * @see org.unitime.commons.ant.CreateBaseModelFromXml
 */
public abstract class BaseStandardEventNote implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long iUniqueId;
	private String iReference;
	private String iNote;


	public static String PROP_UNIQUEID = "uniqueId";
	public static String PROP_REFERENCE = "reference";
	public static String PROP_NOTE = "note";

	public BaseStandardEventNote() {
		initialize();
	}

	public BaseStandardEventNote(Long uniqueId) {
		setUniqueId(uniqueId);
		initialize();
	}

	protected void initialize() {}

	public Long getUniqueId() { return iUniqueId; }
	public void setUniqueId(Long uniqueId) { iUniqueId = uniqueId; }

	public String getReference() { return iReference; }
	public void setReference(String reference) { iReference = reference; }

	public String getNote() { return iNote; }
	public void setNote(String note) { iNote = note; }

	public boolean equals(Object o) {
		if (o == null || !(o instanceof StandardEventNote)) return false;
		if (getUniqueId() == null || ((StandardEventNote)o).getUniqueId() == null) return false;
		return getUniqueId().equals(((StandardEventNote)o).getUniqueId());
	}

	public int hashCode() {
		if (getUniqueId() == null) return super.hashCode();
		return getUniqueId().hashCode();
	}

	public String toString() {
		return "StandardEventNote["+getUniqueId()+"]";
	}

	public String toDebugString() {
		return "StandardEventNote[" +
			"\n	Note: " + getNote() +
			"\n	Reference: " + getReference() +
			"\n	UniqueId: " + getUniqueId() +
			"]";
	}
}
