/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2016 Synacor, Inc.
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation,
 * version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.ldaputils;

import java.util.Map;

import com.zimbra.cs.ldap.LdapException;
import com.zimbra.cs.ldap.ZAttributes;

/**
 * @author Greg Solovyev
 */
public class PosixGroup extends LDAPUtilEntry {
	private static final String A_gidNumber = "gidNumber";
	
	public PosixGroup(String dn, ZAttributes attrs,
            Map<String, Object> defaults) throws LdapException {
        super(dn, attrs, defaults);
        mId = attrs.getAttrString(A_gidNumber);
    }

    public String getId() {
        return getAttr(A_gidNumber);
    }
}
