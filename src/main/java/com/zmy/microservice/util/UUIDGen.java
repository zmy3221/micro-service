package com.zmy.microservice.util;

import java.util.UUID;

/*
 * Copyright (C) 2018 The gingkoo Authors
 * This file is part of The gingkoo library.
 *
 * The gingkoo is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The gingkoo is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with The gingkoo.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * @author: zmy
 * @create: 2018/6/20
 */
public class UUIDGen {

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    public static String uuidUpper() {
        return uuid().toUpperCase();
    }

    public static String cleanUuid() {
        return uuid().replace("-", "");
    }

    public static String cleanUuidUpper() {
        return cleanUuid().toUpperCase();
    }


}
