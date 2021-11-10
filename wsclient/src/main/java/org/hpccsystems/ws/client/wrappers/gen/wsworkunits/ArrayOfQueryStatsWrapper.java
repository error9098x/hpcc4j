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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfQueryStatsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_83.ArrayOfQueryStats
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2021-09-30T21:52:48.356Z
 */
public class ArrayOfQueryStatsWrapper
{
    protected List<QueryStatsWrapper> local_queryStats = null;

    public ArrayOfQueryStatsWrapper() {}

    public ArrayOfQueryStatsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryStats arrayofquerystats)
    {
        copy( arrayofquerystats );
    }
    public ArrayOfQueryStatsWrapper( List<QueryStatsWrapper> _queryStats )
    {
        this.local_queryStats = _queryStats;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryStats raw )
    {
        if (raw == null)
            return;

        if (raw.getQueryStats() != null)
        {
            this.local_queryStats = new ArrayList<QueryStatsWrapper>();
            for ( int i = 0; i < raw.getQueryStats().length; i++)
            {
                this.local_queryStats.add(new QueryStatsWrapper(raw.getQueryStats()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfQueryStatsWrapper [" + "queryStats = " + local_queryStats + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryStats getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryStats raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryStats();
        if (this.local_queryStats!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStats[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStats[this.local_queryStats.size()];
            for ( int i = 0; i < this.local_queryStats.size(); i++)
            {
                arr[i] = this.local_queryStats.get(i) .getRaw();
            }
            raw.setQueryStats(arr);
        }
        return raw;
    }


    public void setQueryStats( List<QueryStatsWrapper> _queryStats )
    {
        this.local_queryStats = _queryStats;
    }
    public List<QueryStatsWrapper> getQueryStats( )
    {
        return this.local_queryStats;
    }
}