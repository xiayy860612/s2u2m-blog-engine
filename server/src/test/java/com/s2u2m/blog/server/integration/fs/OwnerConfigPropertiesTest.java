/*
 *     Copyright (C) 2018  s2u2m
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.s2u2m.blog.server.integration.fs;

import com.s2u2m.blog.server.BaseS2u2mSpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

/**
 * OwnerConfigPropertiesTest create on 18-12-29.
 *
 * @author Amos Xia
 */
public class OwnerConfigPropertiesTest extends BaseS2u2mSpringTest {

    @Autowired
    private OwnerConfigProperties ownerConfigProperties;

    @Test
    public void loadOwnerProperties() {
        assertEquals("Test", ownerConfigProperties.getUsername());
    }

}