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

import com.s2u2m.blog.server.domain.entity.owner.OwnerEntity;
import com.s2u2m.blog.server.domain.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * OwnerController create on 18-12-27.
 *
 * @author Amos Xia
 */
@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @GetMapping("")
    public @NotNull OwnerInfoDTO getOwnerInfo() {
        OwnerEntity owner = ownerRepository.getOwner();
        return OwnerInfoDTO.builder()
                .username(owner.getUsername())
                .avatar(owner.getAvatar())
                .motto(owner.getMotto())
                .contacts(owner.getContacts())
                .build();
    }

}
