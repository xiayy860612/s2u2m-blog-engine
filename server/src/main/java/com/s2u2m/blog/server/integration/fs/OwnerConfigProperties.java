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

import com.s2u2m.blog.server.constant.ContactEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;

/**
 * OwnerConfigProperties create on 18-12-29.
 *
 * @author Amos Xia
 */
@Getter
@Setter
@Configuration
@PropertySource(value = "classpath:owner.properties")
@ConfigurationProperties(prefix = "s2u2m.blog.owner")
public class OwnerConfigProperties {
    private String username;
    private String avatar;
    private String motto;
    private Map<ContactEnum, String> contacts;
}
