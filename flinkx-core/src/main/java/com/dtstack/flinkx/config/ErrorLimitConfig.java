/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.flinkx.config;

import java.util.HashMap;
import java.util.Map;

/**
 * The configuration of error limitation control
 *
 * Company: www.dtstack.com
 * @author huyifan.zju@163.com
 */
public class ErrorLimitConfig extends AbstractConfig {

    public static final String KEY_ERROR_RECORD_LIMIT = "record";
    public static final String KEY_ERROR_PERCENTAGE_LIMIT = "percentage";

    public static final int DEFAULT_ERROR_RECORD_LIMIT = 0;
    public static final double DEFAULT_ERROR_PERCENTAGE_LIMIT = 0.0;


    public ErrorLimitConfig(Map<String, Object> map) {
        super(map);
    }

    public static ErrorLimitConfig defaultConfig(){
        Map<String, Object> map = new HashMap<>();
        map.put("record",DEFAULT_ERROR_RECORD_LIMIT);
        map.put("percentage",DEFAULT_ERROR_PERCENTAGE_LIMIT);
        return new ErrorLimitConfig(map);
    }

    public int getRecord() {
        return getIntVal(KEY_ERROR_RECORD_LIMIT, DEFAULT_ERROR_RECORD_LIMIT);
    }

    public void setRecord(int record) {
        setIntVal(KEY_ERROR_RECORD_LIMIT, record);
    }

    public double getPercentage() {
        return getDoubleVal(KEY_ERROR_PERCENTAGE_LIMIT, DEFAULT_ERROR_PERCENTAGE_LIMIT);
    }

    public void setPercentage(double percentage) {
        setDoubleVal(KEY_ERROR_PERCENTAGE_LIMIT, percentage);
    }
}