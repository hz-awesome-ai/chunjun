/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.flinkx.metadataphoenix5.util;

import com.dtstack.flinkx.metadata.MetaDataCons;

/**
 * @author kunni@dtstack.com
 */

public class PhoenixMetadataCons extends MetaDataCons {

    public static final String KEY_PRIMARY_KEY = "is_primary_key";

    public static final String KEY_PATH = "path";

    public static final String KEY_DEFAULT = "default";

    public static final String KEY_TABLE_NAME = "table_name";

    public static final String KEY_NAMESPACE = "namespace";

    public static final String KEY_CREATE_TIME = "createTime";

    public static final String DRIVER_NAME = "org.apache.phoenix.jdbc.PhoenixDriver";

    public static final String SQL_DEFAULT_TABLE_NAME = " SELECT DISTINCT TABLE_NAME FROM SYSTEM.CATALOG WHERE TABLE_SCHEM is null ";

    public static final String SQL_TABLE_NAME = " SELECT DISTINCT TABLE_NAME FROM SYSTEM.CATALOG WHERE TABLE_SCHEM = '%s' ";

    public static final String SQL_COLUMN = "SELECT ORDINAL_POSITION, COLUMN_FAMILY FROM SYSTEM.CATALOG WHERE TABLE_SCHEM = '%s' AND TABLE_NAME = '%s' ";

    public static final String SQL_DEFAULT_COLUMN = "SELECT ORDINAL_POSITION, COLUMN_FAMILY FROM SYSTEM.CATALOG WHERE TABLE_SCHEM is null AND TABLE_NAME = '%s' ";

}