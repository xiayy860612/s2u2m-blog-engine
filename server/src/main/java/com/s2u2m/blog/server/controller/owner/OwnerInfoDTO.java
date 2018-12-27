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

package com.s2u2m.blog.server.controller.owner;

import com.s2u2m.blog.server.constant.ContactEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

/**
 * OwnerInfoDTO create on 18-12-27.
 *
 * @author Amos Xia
 */
@Getter
@Builder
@ToString
final class OwnerInfoDTO {
    private String username;
    private String avatar;
    private String motto;
    private Map<ContactEnum, String> contacts;
}
