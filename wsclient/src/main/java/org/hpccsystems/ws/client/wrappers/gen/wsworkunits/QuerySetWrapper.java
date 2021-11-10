package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: QuerySetWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_83.QuerySet
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2021-09-30T21:52:48.420Z
 */
public class QuerySetWrapper
{
    protected String local_querySetName;

    public QuerySetWrapper() {}

    public QuerySetWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySet queryset)
    {
        copy( queryset );
    }
    public QuerySetWrapper( String _querySetName )
    {
        this.local_querySetName = _querySetName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySet raw )
    {
        if (raw == null)
            return;

        this.local_querySetName = raw.getQuerySetName();

    }

    @Override
    public String toString()
    {
        return "QuerySetWrapper [" + "querySetName = " + local_querySetName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySet getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySet raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySet();
        raw.setQuerySetName( local_querySetName);
        return raw;
    }


    public void setQuerySetName( String _querySetName )
    {
        this.local_querySetName = _querySetName;
    }
    public String getQuerySetName( )
    {
        return this.local_querySetName;
    }
}