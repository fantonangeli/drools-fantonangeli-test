/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.kie.internal.runtime.manager.audit.query;

import java.util.Date;

import org.kie.api.runtime.manager.audit.ProcessInstanceLog;
import org.kie.internal.process.CorrelationKey;

public interface ProcessInstanceLogQueryBuilder extends AuditLogQueryBuilder<ProcessInstanceLogQueryBuilder, ProcessInstanceLog> {

    /**
     * Specify one more statuses (in the form of an int) as criteria.
     * @param status one or more int statuses
     * @return The current instance of this query builder
     */
    public ProcessInstanceLogQueryBuilder status(int... status);

    /**
     * Specify one or more (process instance) outcomes as a criteria.
     * @param outcome one or more string outcomes
     * @return The current instance of this query builder
     */
    public ProcessInstanceLogQueryBuilder outcome(String... outcome);

    /**
     * Specify one or more (process instance) durations as a criteria.
     * </p>
     * This duration is in milliseconds.
     * @param duration one or more long durations
     * @return The current instance of this query builder
     */
    public ProcessInstanceLogQueryBuilder duration(long... duration);

    /**
     * Specify the begin (minimum) of a range to be used as a criteria on the
     * (process instance) duration field
     * @param durationMin the begin (minimum) of the long range
     * @return The current instance of this query builder
     */
    public ProcessInstanceLogQueryBuilder durationMin(long durationMin);

    /**
     * Specify the end (maximum) of a range to be used as a criteria on the
     * (process instance) duration field
     * @param durationMax the end (maximum) of the long range
     * @return The current instance of this query builder
     */
    public ProcessInstanceLogQueryBuilder durationMax(long durationMax);

    /**
     * Specify one or more identiies (who started the process instance) as a criteria
     * @param identity one or more string identities
     * @return The current instance of this query builder
     */
    public ProcessInstanceLogQueryBuilder identity(String... identity);

    /**
     * Specify one or more process versions as a criteria
     * @param version one or more string process versions
     * @return The current instance of this query builder
     */
    public ProcessInstanceLogQueryBuilder processVersion(String... version);

    /**
     * Specify one or more process names as a criteria
     * @param processName one or more string process names
     * @return The current instance of this query builder
     */
    public ProcessInstanceLogQueryBuilder processName(String... processName);

    /**
     * Specify one or more (process instance) start dates as a criteria
     * @param date one or more {@link Date} start dates
     * @return The current instance of this query builder
     */
    public ProcessInstanceLogQueryBuilder startDate(Date... date);

    /**
     * Specify the begin of a date range to be used as a criteria on the start date field.
     * The date range includes the date specified.
     * @param rangeStart the start (early end) of the date range
     * @return The current query builder instance
     */
    public ProcessInstanceLogQueryBuilder startDateRangeStart(Date rangeStart);

    /**
     * Specify the end of a date range to be used as a criteria on the start date field.
     * The date range includes this date.
     * @param rangeEnd the end (later end) of the date range
     * @return The current query builder instance
     */
    public ProcessInstanceLogQueryBuilder startDateRangeEnd(Date rangeEnd);

    /**
     * Specify one or more (process instance) end dates as a criteria
     * @param date one or more {@link Date} end dates
     * @return The current instance of this query builder
     */
    public ProcessInstanceLogQueryBuilder endDate(Date... date);

    /**
     * Specify the begin of a date range to be used as a criteria on the end date field.
     * The date range includes this date.
     * @param rangeStart the begin (later end) of the date range
     * @return The current query builder instance
     */
    public ProcessInstanceLogQueryBuilder endDateRangeStart(Date rangeStart);

    /**
     * Specify the end of a date range to be used as a criteria on the end date field.
     * The date range includes this date.
     * @param rangeEnd the end (later end) of the date range
     * @return The current query builder instance
     */
    public ProcessInstanceLogQueryBuilder endDateRangeEnd(Date rangeEnd);

    /**
     * Specify one or more process correlation keys as a criteria
     * @param correlationKeys one or more correlation keys
     * @return The current instance of this query builder
     */
    public ProcessInstanceLogQueryBuilder correlationKey(CorrelationKey... correlationKeys);

}
